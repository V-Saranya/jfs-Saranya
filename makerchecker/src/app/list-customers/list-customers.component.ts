import { Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import {UserService} from '../services/user.service';
import {Router} from '@angular/router';
import {MatDialog} from '@angular/material';
import { Customer } from '../model/users';
import { CreateCustomersComponent } from '../create-customers/create-customers.component';
import {ModifyCustomersComponent} from '../modify-customers/modify-customers.component';

@Component({
  selector: 'app-list-customers',
  templateUrl: './list-customers.component.html',
  styleUrls: ['./list-customers.component.css']
})
export class ListCustomersComponent implements OnInit {

  tablecols: string[] = ['customer_id', 'customer code', 'customer name',
  'customer address1', 'customer address2', 'customer pincode',
  'email', 'contact number', 'contact person', 'record status', 'enabled', 'actions'
  ];

  dataSource  = [];
  id: number;

  constructor(private router: Router, public dialog: MatDialog, private userService: UserService) { }


  ngOnInit() {
    this.userService.getCustomerList().subscribe((result) => {
      this.dataSource = result;
    });
  }

    createCustomer(customer: Customer) {
    const dialogRef = this.dialog.open(CreateCustomersComponent, {
      data: {customer: customer}
    });
  }

  editCustomerDetails(id: number, code: string, name: string, address1: string, address2: string,
    pincode: number, email: string, contact: number, primaryct: string ) {
     this.id = id;
     console.log(id);
     localStorage.setItem('editCustomerId', id.toString());
     const dialogRef = this.dialog.open(ModifyCustomersComponent, {
       data: {id: id, code:code, name: name, address1: address1, address2: address2,
        pincode: pincode, email: email, contact: contact, primaryct: primaryct}
    });
  }
    deleteCustomerDetail(id: number) {
       this.id = id;
       this.userService.deleteCustomer(id)
      .subscribe( data => {
        console.log(data);
      });
    }
    logout(){
      this.router.navigate(['/login']);
    }

}
