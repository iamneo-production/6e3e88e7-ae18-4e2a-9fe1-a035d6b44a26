import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addons',
  templateUrl: './addons.component.html',
  styleUrls: ['./addons.component.css']
})
export class AddonsComponent implements OnInit {

  constructor(private route: Router,private dialog : MatDialog) { }

  ngOnInit(): void {
  }
  openDia(){
    this.route.navigate(['addons-display'])
  };

}
