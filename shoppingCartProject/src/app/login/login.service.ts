import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable, of} from 'rxjs';
import  {validateUserUrl } from './../url';

@Injectable({
    providedIn: 'root'
  })
  export class LoginService{

    constructor(public http: HttpClient){

    }
       
    validateUser(userDetails:any):Observable<any>{
        console.log("Hello");        
        var result = this.http.post(validateUserUrl, userDetails );
        return result;
    }

    SaveUser(userDetails:any):Observable<any>{  
      //  console.log(userDetails);
        var result = this.http.post(validateUserUrl, userDetails);
        return result;
    
      }
  }