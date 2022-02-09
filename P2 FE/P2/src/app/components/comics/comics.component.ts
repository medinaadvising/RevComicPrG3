import { CartService } from './../../Service/cart.service';
import { Item } from './../../models/item';
import { ItemService } from './../../Service/item.service';
import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';



@Component({
  selector: 'app-comics',
  templateUrl: './comics.component.html',
  styleUrls: ['./comics.component.css']
})
export class ComicsComponent implements OnInit {

  constructor(private is:ItemService, private cs: CartService) { }

  subscription:Subscription = new Subscription();

  public item:any;

  allItems:any=[];

  ngOnInit(): void {

    this.is.allItems().subscribe(result =>{

      console.log(result);

      this.allItems = result;

      console.log(this.allItems)
      this.allItems.forEach((item:any) => {
        
        Object.assign(item,{quantity:item.quantity,total:item.price});
      });

  })
}
addtocart(item: any){
  this.cs.addtoCart(item);
}

}
