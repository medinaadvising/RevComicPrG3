import { MarvelAPIService } from './../../Service/marvel-api.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-displayproducts',
  templateUrl: './displayproducts.component.html',
  styleUrls: ['./displayproducts.component.css']
})
export class DisplayproductsComponent implements OnInit {

  constructor(private service:MarvelAPIService) { }

  allCharacters:any=[];
  comics:any=[];
  series:any=[];
  showComicsDiv:boolean;
  showSeriesDiv:boolean;
  characterName:string;
  showSearchResult:boolean;
  searchedCharacter:any=[];

  ngOnInit(): void {
    this.showComicsDiv=false;
    this.showSearchResult = false;
    this.service.allCharacters().subscribe((result) =>{
      console.log(result);
      this.allCharacters = result.data.results;
    })
  }

  findCharacter(event:any){
     this.characterName = event.target.value;
     console.log(this.characterName);
     this.service.getCharacterByName(this.characterName).subscribe((result)=>{
       console.log(result);
       if(result.data.count>0)
       {
         this.showSearchResult = true;
         this.searchedCharacter = result.data.results;
       }
       else{
  
         this.ngOnInit();
       }
     })
  }
  
    fetchComicsByCharacter(characterId:string){
      console.log(characterId);
      this.service.getComicsByCharacter(characterId).subscribe((result)=>{
       
        if(result.data.count>0)
        {
          this.comics = result.data.results;
          this.showComicsDiv = true;
        }
      })
    }
    fetchSeriesByCharacter(characterId:string)
    {
      console.log(characterId);
      this.service.getSeriesByCharacter(characterId).subscribe((result)=>{
        //console.log(result);
  
        if(result.data.count>0)
        {
          this.series = result.data.results;
          this.showSeriesDiv = true;
        }
      })
    }
    

}
