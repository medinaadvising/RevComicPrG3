import { ThankyouComponent } from './components/thankyou/thankyou.component';
import { ThemeToggleComponent } from './components/theme-toggle/theme-toggle.component';
import { ResetpasswordComponent } from './components/resetpassword/resetpassword.component';
import { LoginComponent } from './components/login/login.component';
import { UserprofileComponent } from './components/userprofile/userprofile.component';
import { ComicsComponent } from './components/comics/comics.component';
import { DisplayproductsComponent } from './components/displayproducts/displayproducts.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './components/register/register.component';
import { CartComponent } from './components/cart/cart.component';
import { CheckoutComponent } from './components/checkout/checkout.component';
import { SearchComponent } from './components/search/search.component';
import { AddItemComponent } from './components/add-item/add-item.component';

const routes: Routes = [

{path: '', component:DisplayproductsComponent},
{path:'comics',component:ComicsComponent},
{path: 'userprofile', component:UserprofileComponent},
{path: 'login', component:LoginComponent},
{path: 'login/resetpassword', component:ResetpasswordComponent},
{path: 'register', component:RegisterComponent},
{path: 'cart', component:CartComponent},
{path: 'checkout', component:CheckoutComponent},
{path: 'search', component:SearchComponent},
{path: 'add', component:AddItemComponent},
{path: 'dark', component:ThemeToggleComponent},
{path: 'thankyou', component:ThankyouComponent},
{path: 'userprofile/resetpassword', component:ResetpasswordComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
