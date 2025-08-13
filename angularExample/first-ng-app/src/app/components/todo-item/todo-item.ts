import { Component, input, output } from '@angular/core';
import { Todo } from '../../model/todo.type';
import { HighlightCompletedTodoDirective } from '../highlight-completed-todo-directive';

@Component({
  selector: 'app-todo-item',
  imports: [HighlightCompletedTodoDirective],
  templateUrl: './todo-item.html',
  styleUrl: './todo-item.scss'
})
export class TodoItem {
todo = input.required<Todo>();
todoToggled = output<Todo>();

todoClicked() {
  this.todoToggled.emit(this.todo());
}
}
