import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { KartComponent } from './kart/kart.component';
import { RegisterComponent } from './register/register.component';
import { FormsModule} from '@angular/forms';
import { ProductsComponent } from './products/products.component';
import { HttpClientModule } from '@angular/common/http';

import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

import {RegisterService} from './register/register.service'
import { LoginService } from './login/login.service';
// import{ ReactiveFormsModule,FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    KartComponent,
    RegisterComponent,
    ProductsComponent
  
    // ReactiveFormsModule,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    NgbModule,
    HttpClientModule
  ],
  providers: [RegisterService,LoginService],
  bootstrap: [AppComponent]
})
export class AppModule { }
