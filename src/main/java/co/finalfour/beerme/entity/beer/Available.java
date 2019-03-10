package co.finalfour.beerme.entity.beer;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Type;

@Embeddable
public class Available{
	
	@Column(name="objAvailableDescription")
	@Type(type="text")
   	private String description;
   	@Column(name="objAvailableId")
   	private String id;
   	@Column(name="objAvailableName")
   	private String name;

 	public String getDescription(){
		return this.description;
	}
 	
	public void setDescription(String description){
		this.description = description;
	}
 	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
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
		return "Available [description=" + description + ", id=" + id + ", name=" + name + "]";
	}
	
}
