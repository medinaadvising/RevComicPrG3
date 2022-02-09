import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  public cartItemList : any =[]
  public allItems = new BehaviorSubject<any>([]);
  

  constructor() { }
  getProducts(){
    return this.allItems.asObservable();
  }

  addtoCart(item : any){
    this.cartItemList.push(item);
    this.allItems.next(this.cartItemList);
    
  }
  getTotalPrice() : number{
    let grandTotal = 0;
    this.cartItemList.map((item:any)=>{
      
      grandTotal += item.total;

    
    })
    return grandTotal;
  }
  removeCartItem(item: any){
    this.cartItemList.map((a:any, index:any)=>{
      if(item.item_id=== a.item_id){
        this.cartItemList.splice(index,1);
      }
    })
    this.allItems.next(this.cartItemList);
  }
  removeAllCart(){
    this.cartItemList = []
    this.allItems.next(this.cartItemList);
  }
}
