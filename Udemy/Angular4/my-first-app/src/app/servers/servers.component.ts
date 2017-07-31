import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-servers',
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {
  allowNewServer: boolean = false;
  serverCreationStatus: String = 'No server was created!';
  serverName: String = 'Testserver';

  constructor() {
    setTimeout(() => { //ES6 arrow function. same as function() {}
      this.allowNewServer = true;
    }, 2000); //a normal JavaScript function
   }

  ngOnInit() {
  }

  onCreateServer() {
    this.serverCreationStatus = 'Server was created! Name of server was ' + this.serverName;
  }

  onUpdateServerName(event: Event){
    console.log(event);
    this.serverName = (<HTMLInputElement> event.target).value;
  }

}