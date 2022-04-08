import { Component, OnInit,ViewChild } from '@angular/core';
import {MatTableDataSource} from '@angular/material/table';
import {MatPaginator} from '@angular/material/paginator';
import {MatSort} from '@angular/material/sort';
import { Plan } from 'src/app/plan';
import {MatDialog} from '@angular/material/dialog';
import { ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup } from '@angular/forms';
import {Router} from '@angular/router';
import { PostpaidApiService } from '../services/postpaid-api.service';

@Component({
  selector: 'app-postpaid',
  templateUrl: './postpaid.component.html',
  styleUrls: ['./postpaid.component.css']
})
export class PostpaidComponent implements OnInit {

  plan!: Plan[];
  plandata!: Plan;
  editPlanData!:FormGroup;
  displayedColumns: string[] = ['planType', 'planName', 'planPrice','planDescription','planOffers','planValidity','action'];
  dataSource!: MatTableDataSource<any>;
  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;
  

  
  constructor(private formBuilder:FormBuilder,public dialog: MatDialog,
    private api:PostpaidApiService,private route: ActivatedRoute,
    private router:Router) {}


  ngOnInit(): void{
    this.getPrePlan();
    

    
  }
  filterPrepaid() {
    const filterValue = "prepaid";
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
 
 
 }
 filterPostpaid() {
  this.router.navigateByUrl('/postpaid');
  const filterValue = "postpaid";
  this.dataSource.filter = filterValue.trim().toLowerCase();

  if (this.dataSource.paginator) {
    this.dataSource.paginator.firstPage();
  }


}

  public getPrePlan():void{
    this.api.getPlans()
    .subscribe({
      next:(response:Plan[])=>{
        this.plan=response;
        this.dataSource=new MatTableDataSource(response);
        this.dataSource.paginator=this.paginator;
        this.dataSource.sort=this.sort;
  
        
      },
      error:()=>{
        alert("Error while fetching records")
      }
    });
  }

  deletePlan(id:number){
    this.api.deletePlan(id)
    .subscribe({
      next:(res)=>{
        alert("Plan deleted successfully");
        this.getPrePlan();
      },
      error:()=>{
        alert("error on deleting");
      }
    });

  }
  editPlan(response:Plan,id:number){
    this.editPlanData.controls['id'].setValue(response.id);
    this.editPlanData.controls['planName'].setValue(response.planName);
    this.editPlanData.controls['planPrice'].setValue(response.planPrice);
    this.editPlanData.controls['planType'].setValue(response.planType);
    this.editPlanData.controls['planOffers'].setValue(response.planOffers);
    this.editPlanData.controls['planDescription'].setValue(response.planDescription);
    this.editPlanData.controls['planValidity'].setValue(response.planValidity);
    
  
    

    
  }


    
   
    

}
