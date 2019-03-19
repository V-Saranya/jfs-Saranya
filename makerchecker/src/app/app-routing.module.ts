import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {LoginComponent} from './login/login.component';
import {CheckerComponent} from './checker/checker.component';
import { ListCustomersComponent } from './list-customers/list-customers.component';
import { CreateCustomersComponent } from './create-customers/create-customers.component';
import {ModifyCustomersComponent} from './modify-customers/modify-customers.component';


const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'maker', component: ListCustomersComponent },
  {path: 'add-customers', component: CreateCustomersComponent},
  {path: 'modify-customers', component: ModifyCustomersComponent},
  { path: 'checker', component: CheckerComponent },
  {path : '', component : LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
