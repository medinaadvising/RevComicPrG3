import { CartService } from './../../Service/cart.service';
import { TransactionService } from './../../Service/transaction.service';
import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {

  public item : any = [];
  public grandTotal !: number;

  quantity:number = null;
  total:string = '';
  f_name:string = '';
  l_name:string = '';
  credit_card:string = '';
  expiration:string = '';
  cvv:number = null;
  zipcode:number = null;

  subscription:Subscription = new Subscription();

  trans = false;


  constructor(private ts:TransactionService, private cs: CartService) { }

  ngOnInit(): void {
    this.cs.getProducts()
    .subscribe(res=>{
      this.item = res;
      this.grandTotal = this.cs.getTotalPrice();
  })
}

  addUser(form: NgForm){
    
    const tranForm = {
      quantity: form.value.quantity,
      total: form.value.total,
      f_name: form.value.f_name,
      l_name: form.value.l_name,
      credit_card: form.value.credit_card,
      expiration: form.value.expiration,
      cvv: form.value.cvv,
      zipcode: form.value.zipcode
    }

    this.ts.postTrans(tranForm).subscribe(data => {

      console.log(data)

      this.trans = true;

    }, (err)=>{
      console.log("Transaction Failed" + err);
    });
      
  }

  removeItem(item: any){
    this.cs.removeCartItem(item);
  }
  emptycart(){
    this.cs.removeAllCart();
  }

}
