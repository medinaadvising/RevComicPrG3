import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { ThemeService } from './theme.service';

@Component({
  selector: 'app-dark-mode',
  templateUrl: './dark-mode.component.html',
  styleUrls: ['./dark-mode.component.scss'],
  //encapsulation: ViewEncapsulation.None
  //this veiw encapsulation is just to show DARK MODE WORK, but will affect the whole app css, DO NOT RUN
})

export class DarkModeComponent implements OnInit {
  isDarkMode: boolean;
  /*
  isDarkMode: boolean = false;
  
  toggleDarkMode(): void{
    this.isDarkMode =  !this.isDarkMode; 
  }
  
  */
  toggleDarkMode(){
    this.isDarkMode = this.themeService.isDarkMode();

    this.isDarkMode ? this.themeService.update('light-mode') : this.themeService.update('dark-mode');
  }

  constructor(private themeService: ThemeService){
    //we are going to call the initTheme function on this constructor
    this.themeService.initTheme();
    //now we will go ahead and asign isDarkMode to help switch from on an off
    //with the isDarkMode function
    this.isDarkMode = this.themeService.isDarkMode();
  }
  

  ngOnInit(): void {
  }

  
//document.documentElement.style.setProperty('--ion-color-primary', this.config.primaryColor);
}


/*
When typescrit give your this issue 

"Property '(function name)' has no initializer
 and is not definitely assigned in the constructor." 

 its complaining that you need to initialize that variable. 
you can use exclamation mark in between function and colon so that you dont have
to init it.

ORRRR

you can just give it an initial value....in this case you could give 

isDarkMode: boolean = false;


*/