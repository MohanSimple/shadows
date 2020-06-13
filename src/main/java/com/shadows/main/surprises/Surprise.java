package com.shadows.main.surprises;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="surprises")
public class Surprise {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private int price;
	
	public int getId() {
		return id;
	}
	@Column(name="image")
	private String image;
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Surprise [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", image=" + image + "]";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Surprise(String name, String description, int price, String image) {
		super();
		this.name = name;
		this.description = description;
		this.image=image;
		this.price = price;
	}
	
	
	public Surprise(){}
	
}
