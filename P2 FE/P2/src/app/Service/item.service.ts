import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  constructor(private http:HttpClient) { }

  BaseUrl = 'http://localhost:3000/items';

  allItems():Observable<any>{

    return this.http.get(this.BaseUrl);
  }
}
