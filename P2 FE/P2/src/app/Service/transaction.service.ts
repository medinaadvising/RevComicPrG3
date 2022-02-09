import { Transaction } from './../models/transaction';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, observable, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {

  constructor(private http:HttpClient) { }

  url = 'http://localhost:3000/'

 
  

  getTransById(id:number):Observable<any>{
    return this.http.get(this.url + "transaction/" + id + "/", {observe:'response'})as Observable<any>
  }

  postTrans(postData){
    return this.http.post(this.url +'transaction', postData);
    
  }


}
