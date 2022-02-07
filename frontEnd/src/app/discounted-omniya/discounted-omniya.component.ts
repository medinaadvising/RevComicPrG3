import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-discounted-omniya',
  templateUrl: './discounted-omniya.component.html',
  styleUrls: ['./discounted-omniya.component.css']
})
export class DiscountedOmniyaComponent implements OnInit {

  // input variable referred to by the two way binding in HTML
public input: number= 0

public discount: any ="placeholder";



getDiscoutedTitile():void{
  console.log("clicks")
}

//nd

  constructor() { }

  ngOnInit(): void {
  }

}
