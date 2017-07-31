import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-successalert',
  template: `
    <p>This is a warning, you are in danger!</p>
   `,
  styles: [
    `
    p {
      padding: 20px;
      background-color: palegreen;
      border: 1px solid green;
    }
    `
  ]
})
export class SuccessalertComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
