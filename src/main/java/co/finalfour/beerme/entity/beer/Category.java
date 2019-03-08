package co.finalfour.beerme.entity.beer;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Category{
	
	@Column(name="objCategoryCreateDate")
   	private String createDate;
   	@Column(name="objCategoryId", unique=true)
   	private Number id;
   	@Column(name="objCategoryName")
   	private String name;

 	public String getCreateDate(){
		return this.createDate;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate;
	}
 	public Number getId(){
		return this.id;
	}
	public void setId(Number id){
		this.id = id;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Category [createDate=" + createDate + ", id=" + id + ", name=" + name + "]";
	}
	
}
