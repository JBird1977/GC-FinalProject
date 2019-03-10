package co.finalfour.beerme.entity.beer;

import javax.persistence.Embeddable;

//import javax.persistence.ManyToOne;

@Embeddable
public class Ingredient {

	private Long id;
	private String name;
	private String category;
	private String categoryDisplay;
	private String createDate;
	
//	@ManyToOne
//	private Beer beer;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	public String getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + ", category=" + category + ", categoryDisplay="
				+ categoryDisplay + ", createDate=" + createDate + "]";
	}
	
}
