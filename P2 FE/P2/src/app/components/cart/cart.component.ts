import { CartService } from './../../Service/cart.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  public item : any = [];
  public grandTotal !: number;
  constructor(private cs : CartService) { }

  ngOnInit(): void {
    this.cs.getProducts()
    .subscribe(res=>{
      this.item = res;
      this.grandTotal = this.cs.getTotalPrice();
    })
  }
  removeItem(item: any){
    this.cs.removeCartItem(item);
  }
  emptycart(){
    this.cs.removeAllCart();
  }

}
