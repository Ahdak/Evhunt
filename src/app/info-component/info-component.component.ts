import { Component, OnInit } from '@angular/core';
import {Resume} from './resume';

@Component({
  selector: 'app-info-component',
  templateUrl: './info-component.component.html',
  styleUrls: ['./info-component.component.css']
})
export class InfoComponentComponent implements OnInit {

  resume: Resume;
  constructor() { }

  ngOnInit() {
  }

}
