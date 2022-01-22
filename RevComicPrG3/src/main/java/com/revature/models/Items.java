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
	private String title;
	private String description;
	private String title_link;
	private String image_link;
	private Blob cover_image;  // java.sql
	private int year_published;
	private int num_of_pages;
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
	//original DB table name: promo_types. See Java class PromoTypes

	@Override
	public String toString() {
		return "Items [item_id=" + item_id + ", title=" + title + ", description=" + description + ", title_link="
				+ title_link + ", image_link=" + image_link + ", cover_image=" + cover_image + ", year_published="
				+ year_published + ", num_of_pages=" + num_of_pages + ", qty_at_seller=" + qty_at_seller
				+ ", promotype=" + promotype + "]";
	}

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Items(int item_id, String title, String description, String title_link, String image_link, Blob cover_image,
			int year_published, int num_of_pages, int qty_at_seller, Creators creator, Genres genre,
			Characters character, PromoTypes promotype) {
		super();
		this.item_id = item_id;
		this.title = title;
		this.description = description;
		this.title_link = title_link;
		this.image_link = image_link;
		this.cover_image = cover_image;
		this.year_published = year_published;
		this.num_of_pages = num_of_pages;
		this.qty_at_seller = qty_at_seller;
		this.creator = creator;
		this.genre = genre;
		this.character = character;
		this.promotype = promotype;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
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

	public String getTitle_link() {
		return title_link;
	}

	public void setTitle_link(String title_link) {
		this.title_link = title_link;
	}

	public String getImage_link() {
		return image_link;
	}

	public void setImage_link(String image_link) {
		this.image_link = image_link;
	}

	public Blob getCover_image() {
		return cover_image;
	}

	public void setCover_image(Blob cover_image) {
		this.cover_image = cover_image;
	}

	public int getYear_published() {
		return year_published;
	}

	public void setYear_published(int year_published) {
		this.year_published = year_published;
	}

	public int getNum_of_pages() {
		return num_of_pages;
	}

	public void setNum_of_pages(int num_of_pages) {
		this.num_of_pages = num_of_pages;
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
		result = prime * result + ((cover_image == null) ? 0 : cover_image.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((image_link == null) ? 0 : image_link.hashCode());
		result = prime * result + item_id;
		result = prime * result + num_of_pages;
		result = prime * result + ((promotype == null) ? 0 : promotype.hashCode());
		result = prime * result + qty_at_seller;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((title_link == null) ? 0 : title_link.hashCode());
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
		if (cover_image == null) {
			if (other.cover_image != null)
				return false;
		} else if (!cover_image.equals(other.cover_image))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (image_link == null) {
			if (other.image_link != null)
				return false;
		} else if (!image_link.equals(other.image_link))
			return false;
		if (item_id != other.item_id)
			return false;
		if (num_of_pages != other.num_of_pages)
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
		if (title_link == null) {
			if (other.title_link != null)
				return false;
		} else if (!title_link.equals(other.title_link))
			return false;
		if (year_published != other.year_published)
			return false;
		return true;
	}
	
	

}
