import { Component, OnInit } from '@angular/core';
import { DarkthemeService } from 'src/app/Service/darktheme.service';

@Component({
  selector: 'app-theme-toggle',
  templateUrl: './theme-toggle.component.html',
  styleUrls: ['./theme-toggle.component.css']
})
export class ThemeToggleComponent implements OnInit {

  theme: string = 'bootstrap';

  constructor(private ts: DarkthemeService) { }

  ngOnInit(): void {
  }

  toggleTheme() {
    if (this.theme === 'bootstrap') {
      this.theme = 'bootstrap-dark';
    } else  {
      this.theme = 'bootstrap';
    }

    this.ts.setTheme(this.theme)
  }


}
