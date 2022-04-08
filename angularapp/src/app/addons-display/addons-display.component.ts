import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addons-display',
  templateUrl: './addons-display.component.html',
  styleUrls: ['./addons-display.component.css']
})
export class AddonsDisplayComponent implements OnInit {

  constructor(private route:Router) { }

  ngOnInit(): void {
  }
  onClick(){
    this.route.navigate(['user-addons'])
  }
}
