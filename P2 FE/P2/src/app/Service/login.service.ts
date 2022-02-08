import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

 
  constructor(private http:HttpClient) { }

  url = 'http://localhost:3000/login'

  postLogin(loginData){
    return this.http.post(this.url, loginData);
    
  }

}
