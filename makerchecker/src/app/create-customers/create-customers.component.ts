import { Component, OnInit, Inject } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import { UserService } from '../services/user.service';
import {MatDialogRef, MAT_DIALOG_DATA} from '@angular/material';
import {Customer} from '../model/users';

@Component({
  selector: 'app-create-customers',
  templateUrl: './create-customers.component.html',
  styleUrls: ['./create-customers.component.css']
})
export class CreateCustomersComponent implements OnInit {

  addForm: FormGroup;
  constructor(private formBuilder: FormBuilder, private router: Router,
              public dialogRef: MatDialogRef <CreateCustomersComponent>,
              @Inject(MAT_DIALOG_DATA) public customer: Customer, private userService: UserService) { }

  ngOnInit() {
    this.addForm = this.formBuilder.group({
      customer_code: ['', Validators.required],
      email: ['', Validators.required],
      customer_name: ['', Validators.required],
      customer_address1: ['', Validators.required],
      customer_address2: [],
      customer_pincode: ['', Validators.required],
      primary_contact_person: ['', Validators.required],
      contact_number: ['', Validators.required]

    });
  }

  onSubmit() {
    this.userService.createCustomer(this.addForm.value, sessionStorage.getItem('loginId'))
      .subscribe( response  => {
        this.router.navigate(['maker']);

      }, error => {console.log(error); });


    }    }
