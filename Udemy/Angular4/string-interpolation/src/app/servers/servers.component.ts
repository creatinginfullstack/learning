import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-servers',
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {
  serverId : number = 11;
  serverStatus : string = "online";

  constructor() { }

  ngOnInit() {
  }

}
