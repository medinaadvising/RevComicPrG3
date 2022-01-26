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
	private int character_id;
	private String character;
	
	
	
	@Override
	public String toString() {
		return "Characters [character_id=" + character_id + ", character=" + character + "]";
	}



	public Characters() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Characters(int character_id, String character) {
		super();
		this.character_id = character_id;
		this.character = character;
	}



	public int getCharacter_id() {
		return character_id;
	}



	public void setCharacter_id(int character_id) {
		this.character_id = character_id;
	}



	public String getCharacter() {
		return character;
	}



	public void setCharacter(String character) {
		this.character = character;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((character == null) ? 0 : character.hashCode());
		result = prime * result + character_id;
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
		if (character_id != other.character_id)
			return false;
		return true;
	}
	
	

}
