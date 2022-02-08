import { CartService } from './../../Service/cart.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {


  public totalItem : number = 0;

  constructor(private cs: CartService) {}



  ngOnInit(): void {
    this.cs.getProducts()
    .subscribe(res=>{
      this.totalItem = res.length;
    
  })
}
}