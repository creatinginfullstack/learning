import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css']
})
export class DatabindingComponent implements OnInit {
  isBlankUsername: boolean = true;
  username: String = "";

  constructor() {
    this.isBlankUsername = true;
    console.log("got isBlankUsername: " + this.isBlankUsername);
  }

  ngOnInit() {
  }

  onUpdateUserName(event: Event) {
    console.log(event);
    this.username = (<HTMLInputElement> event.target).value;
    console.log("got username: " + this.username);
    this.isBlankUsername = false;
  }

  onResetUserName(event: Event) {
    console.log("onResetUserName");
    this.username = "";
    console.log("got username: " + this.username);
    this.isBlankUsername = true;
  }

}
