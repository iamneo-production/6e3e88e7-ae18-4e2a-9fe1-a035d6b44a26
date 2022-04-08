import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { FormControl, FormGroup, NgForm, Validators } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { FormsModule } from '@angular/forms';
import { Addonattributes } from '../addonattributes';

@Component({
  selector: 'app-user-addons',
  templateUrl: './user-addons.component.html',
  styleUrls: ['./user-addons.component.css']
})
export class UserAddonsComponent implements OnInit {
  popup = true;
  addForm!: FormGroup;
   response:any;

  constructor(private api:UserService) { }

  ngOnInit(): void {
    this.addForm = new FormGroup({
      Type: new FormControl('', [Validators.required, Validators.maxLength(10)]),
      Name: new FormControl('', [Validators.required, Validators.maxLength(10)]),
      Number: new FormControl('', [Validators.required, Validators.maxLength(10)]),
      email: new FormControl('', [Validators.required, Validators.maxLength(60)]),
      plan: new FormControl('', [Validators.required, Validators.maxLength(25)]),
      price: new FormControl('', [Validators.required, Validators.maxLength(5)]),

  });
}
public Error = (controlName: string, errorName: string) =>{
  return this.addForm.controls[controlName].hasError(errorName);
}
  /*recharge(){
    this.api.postPlan(this.myForm.value).subscribe({next:(res:Name) => {
      alert('Recharge Successfully');
      this.myForm.reset();
      this.response=res;
      console.log(res)
    },error:(err: any)=>{
    alert('Error occured while recharging')}} )
    }
  
  }*/
  public recharge(addForm: NgForm): void{
    this.api.postPlan(addForm.value)
    .subscribe({
      next:(response:Addonattributes)=>{
        console.log(response);
        alert("Recharge saved successfully");
        addForm.reset();
        
      },
      error:()=>{
        alert("Error while adding records")
      }
    });


  }

  

}


