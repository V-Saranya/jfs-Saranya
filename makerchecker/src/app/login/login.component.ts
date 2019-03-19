import { Component, OnInit } from '@angular/core';

import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router: Router) { }
  username: string;
  password: string;

  ngOnInit() {
  }
  login(): void {
    if (this.username === 'maker' && this.password === 'maker'){
      sessionStorage.setItem('loginId', this.username);
      this.router.navigate(['maker']);
    } else if (this.username === 'checker' && this.password === 'checker'){
      sessionStorage.setItem('loginId', this.username);
      this.router.navigate(['checker']);
    } else {
      alert('Invalid credentials');
    }
  }

}
