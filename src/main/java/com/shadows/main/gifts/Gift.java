package com.shadows.main.gifts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gifts")
public class Gift {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private String price;
	
	@Column(name="image")
	private String image;
	
	protected String getImage() {
		return image;
	}
	protected void setImage(String image) {
		this.image = image;
	}

	@Column(name="midnight")
	private String midnight;
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getDescription() {
		return description;
	}
	protected void setDescription(String description) {
		this.description = description;
	}
	protected String getPrice() {
		return price;
	}
	protected void setPrice(String price) {
		this.price = price;
	}
	protected String getMidnight() {
		return midnight;
	}
	protected void setMidnightAvailabilty(String midnight) {
		this.midnight = midnight;
	}
	public Gift(String name, String description, String price, String image) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.image=image;
	}
	@Override
	public String toString() {
		return "Gift [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", midnight=" + midnight + "]";
	}
	
	public Gift () {}
	
}
