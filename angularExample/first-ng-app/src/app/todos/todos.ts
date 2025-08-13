import { Component, inject, signal } from '@angular/core';
import { TodosService } from '../services/todos';
import { Todo } from '../model/todo.type';
import { catchError } from 'rxjs';
import { TodoItem } from '../components/todo-item/todo-item';


@Component({
  selector: 'app-todos',
  imports: [TodoItem],
  templateUrl: './todos.html',
  styleUrl: './todos.scss'
})
export class Todos {
todoService = inject(TodosService);
todoItems = signal<Array<Todo>>([]);

  ngOnInit(): void {
    this.todoService
      .getItemsFromApi()
      .pipe(
        catchError((err) => {
           console.log(err);
          throw err;
        })
      )
      .subscribe((todos) => {
          this.todoItems.set(todos);
      });
  }

  updateTodoItem(todoItem: Todo){
    this.todoItems.update((todos) => {
        return todos.map(todo => {
          if(todo.id === todoItem.id){
            return {
              ...todo,
              completed:!todo.completed
            };
          }
          return todo;
        });

    });

  }
}
