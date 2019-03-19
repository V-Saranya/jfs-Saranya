import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Customer } from '../model/users';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  baseUrl = 'http://localhost:8084/makerchecker';
  constructor(private http: HttpClient) { }

  public getCustomerList() {
    return this.http.get<Customer[]>(this.baseUrl + '/maker/getUser');
  }
  public createCustomer(customer: Customer, loginId: string) {
      return this.http.post(this.baseUrl + '/maker/create/' + loginId, customer);
    }
  public updateCustomer(customer: Customer, loginId: string){
        return this.http.put(this.baseUrl + '/maker/' + localStorage.getItem('editCustomerId') + '/' + loginId, customer);
    }
   public getUserById(id: number) {
      return this.http.get<Customer>(this.baseUrl + '/maker/' + id);
    }
  public deleteCustomer(id: number) {
    return this.http.delete<Customer>(this.baseUrl + '/maker/' + id);
  }
  public approveCustomer(customer: Customer, id: number, loginId: string) {
    return this.http.post(this.baseUrl + '/checker/approve/' + id + '/' + loginId, customer);
  }
  public rejectCustomer(customer: Customer, id: number, loginId: string) {
    return this.http.post(this.baseUrl + '/maker/' + id + '/' + loginId, customer);
  }
  }


