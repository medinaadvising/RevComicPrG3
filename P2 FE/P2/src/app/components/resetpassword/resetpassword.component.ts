import { Component, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { UserService } from 'src/app/Service/user.service';

@Component({
  selector: 'app-resetpassword',
  templateUrl: './resetpassword.component.html',
  styleUrls: ['./resetpassword.component.css']
})
export class ResetpasswordComponent implements OnInit {
  
  users_id:number = null;
  username:string = '';
  password:string = '';
  f_name:string = '';
  l_name:string = '';
  user_email:string = '';

  subscription:Subscription = new Subscription();

  public user:any;

  update = false;


  constructor(private us:UserService) { }

  ngOnInit(): void {
  }

  updateUser(form){
    
    const userForm = {
      users_id: form.value.users_id,
      username: form.value.username,
      password: form.value.password,
      f_name: form.value.f_name,
      l_name: form.value.l_name,
      user_email: form.value.user_email
    }

    this.us.putUser(userForm).subscribe(data => {

      console.log(data)
      
      this.update = true;
    });
      
  }

}
