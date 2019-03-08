package co.finalfour.beerme.entity.beer;


public class Ingredient {

	private Number id;
	private String name;
	private String category;
	private String categoryDisplay;
	private String createDate;
	
	public Number getId() {
		return id;
	}
	public void setId(Number id) {
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
