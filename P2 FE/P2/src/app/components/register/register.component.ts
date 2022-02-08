import { NgForm } from '@angular/forms';
import { UserService } from './../../Service/user.service';
import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  username:string = '';
  password:string = '';
  f_name:string = '';
  l_name:string = '';
  user_email:string = '';

  subscription:Subscription = new Subscription();

  public user:any;

  add = false;


  constructor(private us:UserService) { }

  ngOnInit(): void {
  }

  addUser(form: NgForm){
    
    const userForm = {
      username: form.value.username,
      password: form.value.password,
      f_name: form.value.f_name,
      l_name: form.value.l_name,
      user_email: form.value.user_email
    }

    this.us.postUser(userForm).subscribe(data => {
      console.log(data)
      this.add = true;
    }, (err)=>{
      console.log("unable to add user" + err);
    });
      
  }

}
