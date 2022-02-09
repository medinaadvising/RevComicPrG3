import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CartComponent } from './cart-Tyler/cart.component';
import { CheckoutComponent } from './checkout-Sophie/checkout.component';
import { DarkModeComponent } from './dark-mode-RegiTylerShortTerm/dark-mode.component';
import { DiscountedOmniyaComponent } from './discounted-omniya/discounted-omniya.component';
import { LoginComponent } from './login-TylerShortTerm/login.component';
import { MenuComponent } from './menu-Tyler/menu.component';
import { NewUserComponent } from './new-user-TylerShortTerm/new-user.component';
import { OwnerPanelComponent } from './owner-panel/owner-panel.component';
import { SalesLogComponent } from './sales-log-Erling/sales-log.component';
import { SearchBarComponent } from './search-bar/search-bar.component';
import { SearchResultsComponent } from './search-results/search-results.component';
import { StockroomComponent } from './stockroom/stockroom.component';
import { UserProfileComponent } from './user-profile-Erling/user-profile.component';

const routes: Routes = [
  { path:"cart",
    component:CartComponent
  }
  ,
  { path:"checkout",
    component:CheckoutComponent
  }
  ,
  { path:"darkMode",
    component:DarkModeComponent
  }
  ,
  { path:"discounted",
    component:DiscountedOmniyaComponent
  }
  ,
  { path:"login",
    component:LoginComponent
  }
  ,
  { path:"menu",
    component:MenuComponent
  }
  ,
  { path:"newUser",
    component:NewUserComponent
  }
  ,
  { path:"owner",
    component:OwnerPanelComponent
  }
  ,
  { path:"salesLog",
    component:SalesLogComponent
  }
  ,
  { path:"searchBar",
    component:SearchBarComponent
  }
  ,
  { path:"searchResults",
    component:SearchResultsComponent
  }
  ,
  { path:"stockroom",
    component:StockroomComponent
  }
  ,
  { path:"userProfile",
    component:UserProfileComponent
  }

  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
