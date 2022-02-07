import { Injectable, Renderer2, RendererFactory2 } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ThemeService {
 
  private renderer: Renderer2;
  private colorTheme: any;

  constructor(rendererFactory: RendererFactory2) {
    this.renderer = rendererFactory.createRenderer(null, null);
   }

   initTheme() {
     this.getColorTheme();
     this.renderer.addClass(document.body, this.colorTheme);
   }

   update(theme: 'dark-mode' | 'light-mode'){
     this.setColorTheme(theme)
     const previousColorTheme = (theme === 'dark-mode'? 'light-mode' : 'dark-mode');
    this.renderer.removeClass(document.body, previousColorTheme);
    this.renderer.addClass(document.body, theme);
   }

   isDarkMode(){
     return this.colorTheme === 'dark-mode';
   }

   private setColorTheme(theme: string){
    this.colorTheme = theme; 
    localStorage.setItem('user-Theme', theme)
   }

   private getColorTheme(){
     if (localStorage.getItem('user-Theme')){
       this.colorTheme = localStorage.getItem('user-Theme');
     } else {
       this.colorTheme = 'light-mode';
     }
     
   }
}





/*
-added angular material from git terminal
-copied angular material(from website) into the style css
-generated a theme service ts file, skipping tests
-imported Renderer2, RendererFactory2
-created 2 private variables in the themeservice class
    private renderer: Renderer2;
    private colorTheme: string
-added the RendererFactory2 import through the renderfactory variable as a paramter for the constructor
    within the constructor body placed a this keyword 
    this.renderer = rendererFactory.createRenderer(null, null);
-created a setter for colortheme with theme as the paramter REDLINE

*/ 