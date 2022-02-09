package com.revature.models;

import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Items {
	
	@Id //This will make the field a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our PK serial
	private int item_id;
	private String image;
	private String title;
	private String description;
	private String comic_link;
	private String creatorName;
	private String characterName;
	private int year_published;
	private double price;
	private int qty_at_seller;
	
	
	//One to Many (technically many to one) relationship with Director - one Director can have many movies 
	//We need to make this a foreign key to the Director table
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "creator_id") //This is how you establish relationships and foreign keys - 
											  //the name attribute must equal the name of the id of Director in the DB
	//@Column(name = "director_id_fk") //gonna see if this works...
	public Creators creator;  
		//original DB table name: creators. See Java class Creators
	
	//One to Many (technically many to one) relationship with Director - one Director can have many movies 
	//We need to make this a foreign key to the Director table
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "genre_id") //This is how you establish relationships and foreign keys - 
												  //the name attribute must equal the name of the id of Director in the DB
	//@Column(name = "director_id_fk") //gonna see if this works...
	public Genres genre;  
	//original DB table name: genres. See Java class Genres
		
	//One to Many (technically many to one) relationship with Director - one Director can have many movies 
	//We need to make this a foreign key to the Director table
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "character_id") //This is how you establish relationships and foreign keys - 
												  //the name attribute must equal the name of the id of Director in the DB
	//@Column(name = "director_id_fk") //gonna see if this works...
	public Characters character;  
	//original DB table name: characters. See Java class Characters
	
	//One to Many (technically many to one) relationship with Director - one Director can have many movies 
	//We need to make this a foreign key to the Director table
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "promo_type_id") //This is how you establish relationships and foreign keys - 
												  //the name attribute must equal the name of the id of Director in the DB
	//@Column(name = "director_id_fk") //gonna see if this works...
	public PromoTypes promotype;  
	//original DB table name: promo_types. See Java class PromoType
	
	
	

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Items(int item_id, String image, String title, String description, String comic_link, String creatorName,
			String characterName, int year_published, double price, int qty_at_seller, Creators creator, Genres genre,
			Characters character, PromoTypes promotype) {
		super();
		this.item_id = item_id;
		this.image = image;
		this.title = title;
		this.description = description;
		this.comic_link = comic_link;
		this.creatorName = creatorName;
		this.characterName = characterName;
		this.year_published = year_published;
		this.price = price;
		this.qty_at_seller = qty_at_seller;
		this.creator = creator;
		this.genre = genre;
		this.character = character;
		this.promotype = promotype;
	}
	public Items(String image, String title, String description, String comic_link, String creatorName,
			String characterName, int year_published, double price, int qty_at_seller, Creators creator, Genres genre,
			Characters character, PromoTypes promotype) {
		super();
		this.image = image;
		this.title = title;
		this.description = description;
		this.comic_link = comic_link;
		this.creatorName = creatorName;
		this.characterName = characterName;
		this.year_published = year_published;
		this.price = price;
		this.qty_at_seller = qty_at_seller;
		this.creator = creator;
		this.genre = genre;
		this.character = character;
		this.promotype = promotype;
	}
	@Override
	public String toString() {
		return "Items [item_id=" + item_id + ", image=" + image + ", title=" + title + ", description=" + description
				+ ", comic_link=" + comic_link + ", creatorName=" + creatorName + ", characterName=" + characterName
				+ ", year_published=" + year_published + ", price=" + price + ", qty_at_seller=" + qty_at_seller
				+ ", creator=" + creator + ", genre=" + genre + ", character=" + character + ", promotype=" + promotype
				+ "]";
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getComic_link() {
		return comic_link;
	}
	public void setComic_link(String comic_link) {
		this.comic_link = comic_link;
	}
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public int getYear_published() {
		return year_published;
	}
	public void setYear_published(int year_published) {
		this.year_published = year_published;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty_at_seller() {
		return qty_at_seller;
	}
	public void setQty_at_seller(int qty_at_seller) {
		this.qty_at_seller = qty_at_seller;
	}
	public Creators getCreator() {
		return creator;
	}
	public void setCreator(Creators creator) {
		this.creator = creator;
	}
	public Genres getGenre() {
		return genre;
	}
	public void setGenre(Genres genre) {
		this.genre = genre;
	}
	public Characters getCharacter() {
		return character;
	}
	public void setCharacter(Characters character) {
		this.character = character;
	}
	public PromoTypes getPromotype() {
		return promotype;
	}
	public void setPromotype(PromoTypes promotype) {
		this.promotype = promotype;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((character == null) ? 0 : character.hashCode());
		result = prime * result + ((characterName == null) ? 0 : characterName.hashCode());
		result = prime * result + ((comic_link == null) ? 0 : comic_link.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result + ((creatorName == null) ? 0 : creatorName.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + item_id;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((promotype == null) ? 0 : promotype.hashCode());
		result = prime * result + qty_at_seller;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year_published;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		if (character == null) {
			if (other.character != null)
				return false;
		} else if (!character.equals(other.character))
			return false;
		if (characterName == null) {
			if (other.characterName != null)
				return false;
		} else if (!characterName.equals(other.characterName))
			return false;
		if (comic_link == null) {
			if (other.comic_link != null)
				return false;
		} else if (!comic_link.equals(other.comic_link))
			return false;
		if (creator == null) {
			if (other.creator != null)
				return false;
		} else if (!creator.equals(other.creator))
			return false;
		if (creatorName == null) {
			if (other.creatorName != null)
				return false;
		} else if (!creatorName.equals(other.creatorName))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (item_id != other.item_id)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (promotype == null) {
			if (other.promotype != null)
				return false;
		} else if (!promotype.equals(other.promotype))
			return false;
		if (qty_at_seller != other.qty_at_seller)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year_published != other.year_published)
			return false;
		return true;
	}
	
	

	
	
	
	
	

	

}
