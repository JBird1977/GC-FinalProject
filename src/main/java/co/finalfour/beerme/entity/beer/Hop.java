package co.finalfour.beerme.entity.beer;

import javax.persistence.Column;

import org.hibernate.annotations.Type;

public class Hop {
	
	@Column(name="objHopId")
	
	private int id;
	//@Column(name="objHopName")
	private String name;
	@Column(name="objHopDescription")@Type(type="text")
	private String description;
	private String category;
	private String categoryDisplay;
	private String countryOfOrigin;
	//private String country;
	private String forBittering;
	private String forAroma;
	private String forFlavor;
	
	@Override
	public String toString() {
		return "Hop [id=" + id + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", categoryDisplay=" + categoryDisplay + ", countryOfOrigin=" + countryOfOrigin + ", forBittering="
				+ forBittering + ", forAroma=" + forAroma + ", forFlavor=" + forFlavor + "]";
	}
	public int getId() {
		return id;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategoryDisplay() {
		return categoryDisplay;
	}
	public void setCategoryDisplay(String categoryDisplay) {
		this.categoryDisplay = categoryDisplay;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	
	public String getForBittering() {
		return forBittering;
	}
	public void setForBittering(String forBittering) {
		this.forBittering = forBittering;
	}
	public String getForAroma() {
		return forAroma;
	}
	public void setForAroma(String forAroma) {
		this.forAroma = forAroma;
	}
	public String getForFlavor() {
		return forFlavor;
	}
	public void setForFlavor(String forFlavor) {
		this.forFlavor = forFlavor;
	}
	
	
}
