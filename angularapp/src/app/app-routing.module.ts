import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddonsComponent } from './addons/addons.component';
import { AddonsDisplayComponent } from './addons-display/addons-display.component';
import { UserAddonsComponent } from './user-addons/user-addons.component';

const routes: Routes = [
  { path: 'addons', component: AddonsComponent},
  { path: 'addons-display', component: AddonsDisplayComponent},
  { path: 'user-addons', component: UserAddonsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
