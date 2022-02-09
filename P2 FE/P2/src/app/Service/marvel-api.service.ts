import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MarvelAPIService {

  
  constructor(private http:HttpClient) { }

  Url = 'https://gateway.marvel.com:443/v1/public/characters?limit=100&ts=1&apikey=09db8c0609e1acf77214f261ade15d8d&hash=321fb8d004021d2dc79ab68fa604faa5';

  allCharacters():Observable<any>{


    return this.http.get(this.Url);
  }

  allComics():Observable<any>
  {

    const comicUrl =`https://gateway.marvel.com:443/v1/public/comics?limit=100&ts=1&apikey=09db8c0609e1acf77214f261ade15d8d&hash=321fb8d004021d2dc79ab68fa604faa5`;
    
    return this.http.get(comicUrl);
  }

  getComicsByCharacter(characterId:string):Observable<any>
  {

    const characterUrl = `https://gateway.marvel.com:443/v1/public/characters/${characterId}/comics?&ts=1&apikey=09db8c0609e1acf77214f261ade15d8d&hash=321fb8d004021d2dc79ab68fa604faa5`;
    return this.http.get(characterUrl);
  }

  getSeriesByCharacter(characterId:string):Observable<any>
  {
    const seriesByCharacterUrl = `https://gateway.marvel.com:443/v1/public/characters/${characterId}/series?ts=1&apikey=09db8c0609e1acf77214f261ade15d8d&hash=321fb8d004021d2dc79ab68fa604faa5`;
    return this.http.get(seriesByCharacterUrl);
  }

  getCharacterByName(characterName:string):Observable<any>
  {
  
    const characterNameUrl = `https://gateway.marvel.com:443/v1/public/characters?name=${characterName}&ts=1&apikey=09db8c0609e1acf77214f261ade15d8d&hash=321fb8d004021d2dc79ab68fa604faa5`;
    return this.http.get(characterNameUrl);
  }

  getCharacterById(characterId:number):Observable<any>
  {
  
    const characterIdUrl = `https://gateway.marvel.com:443/v1/public/characters/${characterId}?&ts=1&apikey=09db8c0609e1acf77214f261ade15d8d&hash=321fb8d004021d2dc79ab68fa604faa5`;
    return this.http.get(characterIdUrl);
  }

  getByCreator(creator:string):Observable<any>
  {
  
    const creatorUrl = `https://gateway.marvel.com:443/v1/public/creators?name=${creator}&ts=1&apikey=09db8c0609e1acf77214f261ade15d8d&hash=321fb8d004021d2dc79ab68fa604faa5`;
    return this.http.get(creatorUrl);
  }

}
