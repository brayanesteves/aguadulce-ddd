import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeManagerComponent } from './components/employee-manager/employee-manager.component';
import { AddEmployeeComponent } from './components/add-employee/add-employee.component';
import { EditEmployeeComponent } from './components/edit-employee/edit-employee.component';
import { ViewEmployeeComponent } from './components/view-employee/view-employee.component';

const routes: Routes = [
  { path:                          '', redirectTo:'/employees/admin', pathMatch:'full' },
  { path:           'employees/admin', component:EmployeeManagerComponent },
  { path:             'employees/add', component:AddEmployeeComponent },
  { path:'employees/edit/:employeeId', component:EditEmployeeComponent },
  { path:'employees/view/:employeeId', component:ViewEmployeeComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
