import { Component, OnInit, Inject } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import { UserService } from '../services/user.service';
import {MatDialogRef, MAT_DIALOG_DATA} from '@angular/material';
import {first} from 'rxjs/operators';

@Component({
  selector: 'app-modify-customers',
  templateUrl: './modify-customers.component.html',
  styleUrls: ['./modify-customers.component.css']
})
export class ModifyCustomersComponent implements OnInit {
  modifyForm: FormGroup;
  constructor(private formBuilder: FormBuilder, private router: Router,
              public dialogRef: MatDialogRef <ModifyCustomersComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              private userService: UserService) { }


  ngOnInit() {
    let custId = localStorage.getItem('editCustomerId');
    this.modifyForm = this.formBuilder.group({
      customer_id: [''],
      customer_code: ['', Validators.required],
      email: ['', Validators.required],
      customer_name: ['', Validators.required],
      customer_address1: ['', Validators.required],
      customer_address2: [],
      customer_pincode: ['', Validators.required],
      primary_contact_person: ['', Validators.required],
      contact_number: ['', Validators.required]

    });
    this.userService.getUserById(+custId)
    .subscribe( data => {
      this.modifyForm.setValue(data);
    });
    this.modifyForm.controls['customer_id'].disable();
  }

  onSubmit() {
    this.userService.updateCustomer(this.modifyForm.value, sessionStorage.getItem('loginId'))
    .pipe(first())
    .subscribe(
      data => {
        this.router.navigate(['list-user']);
      },
      error => {
        alert(error);
      });
  }
}
