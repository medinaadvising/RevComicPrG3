package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="genres")
public class Genres {
	
	@Id //This will make the field a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our PK serial
	@Column(name = "genre_id") //usually I'll just call a field what I want it to be called instead of doing this...
	private int genre_id;
	
	@Column(unique = true, nullable = false)
	private String genre;

	@Override
	public String toString() {
		return "Genres [genre_id=" + genre_id + ", genre=" + genre + "]";
	}

	public Genres() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Genres(int genre_id, String genre) {
		super();
		this.genre_id = genre_id;
		this.genre = genre;
	}

	public int getGenre_id() {
		return genre_id;
	}

	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + genre_id;
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
		Genres other = (Genres) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (genre_id != other.genre_id)
			return false;
		return true;
	}

	
}
