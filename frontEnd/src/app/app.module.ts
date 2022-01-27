import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CartComponent } from './cart/cart.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { DiscountedComponent } from './discounted/discounted.component';
import { DarkModeComponent } from './dark-mode/dark-mode.component';
import { FeaturedComponent } from './featured/featured.component';
import { LoginComponent } from './login/login.component';
import { MenuComponent } from './menu/menu.component';
import { NewUserComponent } from './new-user/new-user.component';
import { OwnerPanelComponent } from './owner-panel/owner-panel.component';
import { SalesLogComponent } from './sales-log/sales-log.component';
import { StockroomComponent } from './stockroom/stockroom.component';
import { UserProfileComponent } from './user-profile/user-profile.component';

@NgModule({
  declarations: [
    AppComponent,
    CartComponent,
    CheckoutComponent,
    DiscountedComponent,
    DarkModeComponent,
    FeaturedComponent,
    LoginComponent,
    MenuComponent,
    NewUserComponent,
    OwnerPanelComponent,
    SalesLogComponent,
    StockroomComponent,
    UserProfileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
