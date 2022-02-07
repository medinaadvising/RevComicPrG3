import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-featured-omniya',
  templateUrl: './featured-omniya.component.html',
  styleUrls: ['./featured-omniya.component.css']
})

export class FeaturedOmniyaComponent implements OnInit {

  public Featured: any ="placeholder";



getFeaturedTitile():void{
  console.log("clicks")
}


  constructor() { }

  ngOnInit(): void {
  }

}
