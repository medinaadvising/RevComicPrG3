import { User } from './../models/user';
import { HttpClient, HttpHeaders, HttpParams, HttpResponse } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {


  constructor(private http:HttpClient) { }

  url = 'http://localhost:3000/user'

 
  
  getUsers():Observable<any>{
    return this.http.get(this.url)
  }

  getUserById(id:number):Observable<HttpResponse<User>>{
    return this.http.get(this.url + '/'+id, {observe:'response'}) as Observable<HttpResponse<User>>
  }

  postUser(postData){
    return this.http.post(this.url, postData);
    
  }

  putUser(userForm){
    
    let id = (<HTMLInputElement>document.getElementById("{users_id}")).value;

    return this.http.put(this.url +'/'+id, userForm);
  }

}
