package com.revature.models;

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
@Table(name = "items")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private int id;
	
	@Column(unique = true, nullable = false)
	private String title;
	private String description;
	private int creator_id;
	private int genre_id;
	private int character_id;
	private int promo_type_id;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "creator_id") 
	//@Column(name = "creator_id_fk")
	public Creator creator;
	
    @JoinColumn(name = "genre_id") 
	//@Column(name = "genre_id_fk")
	public Genre genre;

    @JoinColumn(name = "character_id") 
    //@Column(name = "character_id_fk")
    public Character character;

    @JoinColumn(name = "promo_type_id") 
    //@Column(name = "promo_type_id_fk")
    public Promo_Type promo_ype;

	
	public Item() {
		super();
	}


	public Item(String title, String description, int creator_id, int genre_id, int character_id, int promo_type_id,
			Creator creator, Genre genre, Character character, Promo_Type promo_type) {
		super();
		this.title = title;
		this.description = description;
		this.creator_id = creator_id;
		this.genre_id = genre_id;
		this.character_id = character_id;
		this.promo_type_id = promo_type_id;
		this.creator = creator;
		this.genre = genre;
		this.character = character;
		this.promo_ype = promo_ype;
	}



	public Item(int id, String title, String description, int creator_id, int genre_id, int character_id,
			int promo_type_id, Creator creator, Genre genre, Character character, Promo_Type promo_ype) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.creator_id = creator_id;
		this.genre_id = genre_id;
		this.character_id = character_id;
		this.promo_type_id = promo_type_id;
		this.creator = creator;
		this.genre = genre;
		this.character = character;
		this.promo_ype = promo_ype;
	}


	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public int getCreator_id() {
		return creator_id;
	}


	public void setCreator_id(int creator_id) {
		this.creator_id = creator_id;
	}


	public int getGenre_id() {
		return genre_id;
	}


	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}


	public int getCharacter_id() {
		return character_id;
	}


	public void setCharacter_id(int character_id) {
		this.character_id = character_id;
	}


	public int getPromo_type_id() {
		return promo_type_id;
	}


	public void setPromo_type_id(int promo_type_id) {
		this.promo_type_id = promo_type_id;
	}


	public Creator getCreator() {
		return creator;
	}


	public void setCreator(Creator creator) {
		this.creator = creator;
	}


	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}


	public Character getCharacter() {
		return character;
	}


	public void setCharacter(Character character) {
		this.character = character;
	}


	public Promo_Type getPromo_ype() {
		return promo_ype;
	}


	public void setPromo_ype(Promo_Type promo_ype) {
		this.promo_ype = promo_ype;
	}


	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", description=" + description + ", creator_id=" + creator_id
				+ ", genre_id=" + genre_id + ", character_id=" + character_id + ", promo_type_id=" + promo_type_id
				+ ", character=" + character + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((character == null) ? 0 : character.hashCode());
		result = prime * result + character_id;
		result = prime * result + creator_id;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + genre_id;
		result = prime * result + id;
		result = prime * result + promo_type_id;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Item other = (Item) obj;
		if (character == null) {
			if (other.character != null)
				return false;
		} else if (!character.equals(other.character))
			return false;
		if (character_id != other.character_id)
			return false;
		if (creator_id != other.creator_id)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (genre_id != other.genre_id)
			return false;
		if (id != other.id)
			return false;
		if (promo_type_id != other.promo_type_id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


	
}


	
	

	