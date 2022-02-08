import { MarvelAPIService } from './Service/marvel-api.service';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { UserprofileComponent } from './components/userprofile/userprofile.component';
import { ResetpasswordComponent } from './components/resetpassword/resetpassword.component';
import { CartComponent } from './components/cart/cart.component';
import { CheckoutComponent } from './components/checkout/checkout.component';
import { HeaderComponent } from './components/header/header.component';
import { HttpClientModule, HttpHeaders } from '@angular/common/http';
import { ComicsComponent } from './components/comics/comics.component';
import { DisplayproductsComponent } from './components/displayproducts/displayproducts.component';
import { SearchComponent } from './components/search/search.component';
import { AddItemComponent } from './components/add-item/add-item.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    UserprofileComponent,
    ResetpasswordComponent,
    CartComponent,
    CheckoutComponent,
    DisplayproductsComponent,
    HeaderComponent,
    ComicsComponent,
    SearchComponent,
    AddItemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
