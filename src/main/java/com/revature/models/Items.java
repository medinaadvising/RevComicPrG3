package com.revature.models;

import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
	@Column(name = "item_id") //usually I'll just call a field what I want it to be called instead of doing this...
	private int id;

	@Column(unique = true, nullable = false)
	private String item_name;
	
	private String title;
	
	private String item_description;
	
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

	
		
	//boilerplate code below.....................
	
	//Classes come with a no args constructor by default
	//BUT if you add a single constructor, that default constructor goes away
	//So we would need to add a no args (just in case)
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//left out ID field, so that we can insert values
	public Items(String item_name, String title, String item_description, String title_link, String image_link,
			Blob cover_image, int year_published, int num_of_pages, int qty_at_seller, Creators creator, Genres genre,
			Characters character, PromoTypes promotype) {
		super();
		this.item_name = item_name;
		this.title = title;
		this.item_description = item_description;
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


	public Items(int id, String item_name, String title, String item_description, String title_link, String image_link,
			Blob cover_image, int year_published, int num_of_pages, int qty_at_seller, Creators creator, Genres genre,
			Characters character, PromoTypes promotype) {
		super();
		this.id = id;
		this.item_name = item_name;
		this.title = title;
		this.item_description = item_description;
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


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getItem_description() {
		return item_description;
	}


	public void setItem_description(String item_description) {
		this.item_description = item_description;
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
	public String toString() {
		return "Items [id=" + id + ", item_name=" + item_name + ", title=" + title + ", item_description="
				+ item_description + ", title_link=" + title_link + ", image_link=" + image_link + ", cover_image="
				+ cover_image + ", year_published=" + year_published + ", num_of_pages=" + num_of_pages
				+ ", qty_at_seller=" + qty_at_seller + ", creator=" + creator + ", genre=" + genre + ", character="
				+ character + ", promotype=" + promotype + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((character == null) ? 0 : character.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + id;
		result = prime * result + ((image_link == null) ? 0 : image_link.hashCode());
		result = prime * result + ((item_description == null) ? 0 : item_description.hashCode());
		result = prime * result + ((item_name == null) ? 0 : item_name.hashCode());
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
		if (character == null) {
			if (other.character != null)
				return false;
		} else if (!character.equals(other.character))
			return false;
		if (creator == null) {
			if (other.creator != null)
				return false;
		} else if (!creator.equals(other.creator))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (id != other.id)
			return false;
		if (image_link == null) {
			if (other.image_link != null)
				return false;
		} else if (!image_link.equals(other.image_link))
			return false;
		if (item_description == null) {
			if (other.item_description != null)
				return false;
		} else if (!item_description.equals(other.item_description))
			return false;
		if (item_name == null) {
			if (other.item_name != null)
				return false;
		} else if (!item_name.equals(other.item_name))
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
