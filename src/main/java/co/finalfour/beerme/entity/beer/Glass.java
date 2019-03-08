package co.finalfour.beerme.entity.beer;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Glass{
	
	@Column(name="objGlassCreateDate")
   	private String createDate;
   	@Column(name="objGlassId", unique=true)
   	private Number id;
   	@Column(name="objGlassName")
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
		return "Glass [createDate=" + createDate + ", id=" + id + ", name=" + name + "]";
	}
	
}
