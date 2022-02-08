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


  constructor(private up:UserService) { }

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
      
  }

}
