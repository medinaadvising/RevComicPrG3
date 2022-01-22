package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="characters")
public class Characters {
	
	
	@Id //This will make the field a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our PK serial
	@Column(name = "character_id") //usually I'll just call a field what I want it to be called instead of doing this...
	private int id;
	
	@Column(unique = true, nullable = false)
	private String character;

	
	//boilerplate code below.....................
	
	//Classes come with a no args constructor by default
	//BUT if you add a single constructor, that default constructor goes away
	//So we would need to add a no args (just in case)
	
	public Characters() {
		super();
		// TODO Auto-generated constructor stub
	}


	//left out ID field, so that we can insert values
	public Characters(String character) {
		super();
		this.character = character;
	}


	public Characters(int id, String character) {
		super();
		this.id = id;
		this.character = character;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCharacter() {
		return character;
	}


	public void setCharacter(String character) {
		this.character = character;
	}


	@Override
	public String toString() {
		return "Characters [id=" + id + ", character=" + character + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((character == null) ? 0 : character.hashCode());
		result = prime * result + id;
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
		Characters other = (Characters) obj;
		if (character == null) {
			if (other.character != null)
				return false;
		} else if (!character.equals(other.character))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	

}
