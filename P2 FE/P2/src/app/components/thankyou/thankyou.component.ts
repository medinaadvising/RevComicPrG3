import { Component, OnInit } from '@angular/core';
import { CartService } from 'src/app/Service/cart.service';

@Component({
  selector: 'app-thankyou',
  templateUrl: './thankyou.component.html',
  styleUrls: ['./thankyou.component.css']
})
export class ThankyouComponent implements OnInit {

  public item : any = [];
  public grandTotal !: number;
  public totalItem : number = 0;

  constructor(private cs: CartService) { }

  ngOnInit(): void {
    this.cs.getProducts()
    .subscribe(res=>{
      this.item = res;
      this.grandTotal = this.cs.getTotalPrice();

      this.cs.getProducts()
    .subscribe(res=>{
      this.totalItem = res.length;
    })
  })
}

}
