import { Component, OnInit } from '@angular/core';
import {UserService} from '../services/user.service';
import {Router} from '@angular/router';
import { Customer } from '../model/users';

@Component({
  selector: 'app-checker',
  templateUrl: './checker.component.html',
  styleUrls: ['./checker.component.css']
})
export class CheckerComponent implements OnInit {
id: number;
tablecols: string[] = ['customer_id', 'customer code', 'customer name',
'customer address1', 'customer address2', 'customer pincode',
'email', 'contact number', 'contact person', 'record status', 'enabled', 'actions'
];
dataSource  = [];
loginId: string;
  constructor(private router: Router, private userService: UserService) { }

  ngOnInit() {
    this.userService.getCustomerList().subscribe((result) => {
      this.dataSource = result;
    });
  }

  approveCustomerDetails(customer: Customer) {
    this.loginId = 'checker';
    this.userService.approveCustomer(customer, customer.customer_id, this.loginId)
   .subscribe( data => {
     console.log(JSON.stringify(data));
   });
 }

 rejectCustomerDetail(customer: Customer, id: number) {
  this.id = id;
  this.loginId = 'checker';
  this.userService.rejectCustomer(customer, id, this.loginId)
 .subscribe( data => {
   console.log(data);
 });

}
logout() {
  this.router.navigate(['/login']);
}
}
