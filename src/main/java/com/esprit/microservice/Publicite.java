package com.esprit.microservice;
import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Publicite implements Serializable{
private static final long serialVersionUID = 795450928237931201L;
	
	@Id
	@GeneratedValue
	private int id;
	private String  description, type, image;
	private String date_debut;
	private String date_fin;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}
	public String getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}
	public Publicite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*public Publicite(int id, String description, String type, String image, String date_debut, String date_fin) {
		super();
		this.id = id;
		this.description = description;
		this.type = type;
		this.image = image;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}*/
	
}
