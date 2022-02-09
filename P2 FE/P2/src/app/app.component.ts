import { DarkthemeService } from './Service/darktheme.service';
import { Component, OnInit, Renderer2 } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{

 constructor (private ts: DarkthemeService, private renderer: Renderer2) {}

  ngOnInit(): void {
    this.ts.themeChanges().subscribe(theme => {
      if (theme.oldValue) {
        this.renderer.removeClass(document.body, theme.oldValue);
      }
      this.renderer.addClass(document.body, theme.newValue);
    })
  }
  title = 'P2';
}
