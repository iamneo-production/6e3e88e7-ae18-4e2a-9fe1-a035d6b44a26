import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatTabsModule} from '@angular/material/tabs';


import { RouterModule, Routes } from '@angular/router';
import { MatListModule } from '@angular/material/list';
import {MatDialogModule} from '@angular/material/dialog';
import { AddPostpaidComponent } from './add-postpaid/add-postpaid.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import {MatTableModule} from '@angular/material/table';
import {MatPaginatorModule} from '@angular/material/paginator';
import {MatSortModule} from '@angular/material/sort';
import { PrepaidComponent } from './prepaid/prepaid.component';
import { EditPostpaidComponent } from './edit-postpaid/edit-postpaid.component';
import { PostpaidComponent } from './postpaid/postpaid.component';
import { EditPrepaidComponent } from './edit-prepaid/edit-prepaid.component';
import { AddPrepaidComponent } from './add-prepaid/add-prepaid.component';
import { AddonsComponent } from './addons/addons.component';
import { EditAddonsComponent } from './edit-addons/edit-addons.component';
import { AddAddonsComponent } from './add-addons/add-addons.component';



const routes: Routes = [
  
];



@NgModule({
  declarations: [
    AppComponent,
    AddPostpaidComponent,
    PrepaidComponent,
    EditPostpaidComponent,
    PostpaidComponent,
    EditPrepaidComponent,
    AddPrepaidComponent,
    AddonsComponent,
    EditAddonsComponent,
    AddAddonsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
    BrowserAnimationsModule,
    MatTabsModule,
    MatListModule,
    MatDialogModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
    MatTableModule,
    MatPaginatorModule,
    RouterModule.forRoot(routes),
    MatSortModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
