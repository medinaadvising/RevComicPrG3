import { Component, HostBinding} from '@angular/core';
import { FormControl } from '@angular/forms';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  title = 'frontEnd';

  toggleControl = new FormControl(false);

  @HostBinding('class') className = '';

  ngOnInit(): void{
    this.toggleControl.valueChanges.subscribe(val => {
      this.className = val ? 'darkMode' : '';
    });
  }
}
