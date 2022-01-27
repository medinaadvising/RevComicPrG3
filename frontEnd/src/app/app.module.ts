import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CartComponent } from './cart-Tyler/cart.component';
import { CheckoutComponent } from './checkout-Sophie/checkout.component';;
import { DarkModeComponent } from './dark-mode-RegiTylerShortTerm/dark-mode.component';
import { LoginComponent } from './login-TylerShortTerm/login.component';
import { MenuComponent } from './menu-Tyler/menu.component';
import { NewUserComponent } from './new-user-TylerShortTerm/new-user.component';
import { OwnerPanelComponent } from './owner-panel/owner-panel.component';
import { SalesLogComponent } from './sales-log-Erling/sales-log.component';
import { StockroomComponent } from './stockroom/stockroom.component';
import { UserProfileComponent } from './user-profile-Erling/user-profile.component';
import { SearchBarComponent } from './search-bar/search-bar.component';
import { SearchResultsComponent } from './search-results/search-results.component';


@NgModule({
  declarations: [
    AppComponent,
    CartComponent,
    CheckoutComponent,
    DarkModeComponent,
    LoginComponent,
    MenuComponent,
    NewUserComponent,
    OwnerPanelComponent,
    SalesLogComponent,
    StockroomComponent,
    UserProfileComponent,
    SearchBarComponent,
    SearchResultsComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
