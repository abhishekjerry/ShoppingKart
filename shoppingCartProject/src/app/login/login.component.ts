import { Component, OnInit } from '@angular/core';
import { LoginService } from './login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username:String;
  password:String;
  loginResponse:string;
  loggedIn :boolean;
  constructor(private loginService:LoginService) { }

 


  ngOnInit() {
    this.username="";
    this.password="";
    this.loginResponse="";
    this.loggedIn = false;
  }
  OnLogin(){
//console.log(this.username);
//console.log(this.password);

    var userDetails = {username:this.username,password:this.password}
    this.loginService.validateUser(userDetails).subscribe((result)=>{
      console.log(result);
     if(result == true){
       this.loginResponse="sucessfully LoggedIn";
       this.loggedIn = true;
       window.location.href = '/products';
     }else{
      this.loggedIn = false;
       this.loginResponse="Invalid usename or password ";
     }
    });

  }
  

}
