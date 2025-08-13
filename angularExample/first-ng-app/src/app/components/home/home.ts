import { Component, signal } from '@angular/core';
import { Greeting } from '../greeting/greeting';
import { Counter } from '../counter/counter';

@Component({
  selector: 'app-home',
  imports: [Greeting, Counter],
  templateUrl: './home.html',
  styleUrl: './home.scss'
})
export class Home {
homeMessage = signal('Hello World from home');


}
