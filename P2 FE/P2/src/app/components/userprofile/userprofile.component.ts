import { CartService } from 'src/app/Service/cart.service';
import { UserService } from 'src/app/Service/user.service';
import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-userprofile',
  templateUrl: './userprofile.component.html',
  styleUrls: ['./userprofile.component.css']
})
export class UserprofileComponent implements OnInit {

  subscription:Subscription = new Subscription();

  public input: number = 0;

  public user:any;

  userp = false;

  public item : any = [];
  public grandTotal !: number;
  public totalItem : number = 0;


  constructor(private up:UserService, private cs: CartService) { }

  ngOnInit(): void {
  }

  userProfile(): void{
    

    this.up.getUserById(this.input).subscribe((data:any) => {

      let response:String = data.status;
      console.log(response)

      this.user = data.body;
      console.log(this.user)


    }, 
    ()=>{
      console.log("unable to pull user profile");
    })

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
