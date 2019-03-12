package co.finalfour.beerme.entity.beer;

public class Adjunct {

	private int id;
	private String name;
	private String category;
	private String categoryDisplay;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Adjunct [id=" + id + ", name=" + name + ", category=" + category + ", categoryDisplay="
				+ categoryDisplay + "]";
	}
	
	
	
	
	
}
