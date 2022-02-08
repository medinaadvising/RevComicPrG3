import { LoginService } from './../../Service/login.service';
import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username:string = '';
  password:string = '';
  

  subscription:Subscription = new Subscription();

  login = false;

  constructor(private ls: LoginService) { }

  ngOnInit(): void {
  }

  addLogin(form: NgForm){
    
    const loginForm = {
      username: form.value.username,
      password: form.value.password,
    }

    this.ls.postLogin(loginForm).subscribe(data => {

      console.log(data)

      this.login = true;

    }, 
    (err)=>{
      console.log("Login Failed" + err);
    });
      
  }

}
