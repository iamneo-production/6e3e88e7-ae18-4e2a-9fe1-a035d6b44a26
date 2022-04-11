import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-viewdetails',
  templateUrl: './viewdetails.component.html',
  styleUrls: ['./viewdetails.component.css']
})
export class ViewdetailsComponent implements OnInit {
  public rechargeDetails:any = [];

  constructor( private route:Router,
    private aap: UserService,) { }

  ngOnInit(): void {
    this.getPrePlans();
  }

  openRec(){
    this.route.navigate(['user-addon'])
  }
  openPlan(){
    this.route.navigate(['user-addon'])
  };
  


  getPrePlans(){
    this.aap.getPlans()
    .subscribe({
      next:(res)=>{
        this.rechargeDetails = res;
      },
      error:(err)=>{
        alert("error while fetching records")
      }
    })  
  }


}

