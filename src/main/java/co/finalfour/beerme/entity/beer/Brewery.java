package co.finalfour.beerme.entity.beer;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Brewery{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long breweryId;
	
   	private String createDate;
   	private String description;
   	private String established;
   	@Column(unique=true)
   	private String id;
   	@Embedded @Type(type="Images")
   	private Images images;
   	private String isOrganic;
   	@ElementCollection 
   	private List<Locations> locations;
   	private String name;
   	private String status;
   	private String statusDisplay;
   	private String updateDate;
   	private String website;

 	public String getCreateDate(){
		return this.createDate;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate;
	}
 	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}
 	public String getEstablished(){
		return this.established;
	}
	public void setEstablished(String established){
		this.established = established;
	}
 	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
 	public Images getImages(){
		return this.images;
	}
	public void setImages(Images images){
		this.images = images;
	}
 	public String getIsOrganic(){
		return this.isOrganic;
	}
	public void setIsOrganic(String isOrganic){
		this.isOrganic = isOrganic;
	}
 	public List<Locations> getLocations(){
		return this.locations;
	}
	public void setLocations(List<Locations> locations){
		this.locations = locations;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public String getStatus(){
		return this.status;
	}
	public void setStatus(String status){
		this.status = status;
	}
 	public String getStatusDisplay(){
		return this.statusDisplay;
	}
	public void setStatusDisplay(String statusDisplay){
		this.statusDisplay = statusDisplay;
	}
 	public String getUpdateDate(){
		return this.updateDate;
	}
	public void setUpdateDate(String updateDate){
		this.updateDate = updateDate;
	}
 	public String getWebsite(){
		return this.website;
	}
	public void setWebsite(String website){
		this.website = website;
	}
	
	@Override
	public String toString() {
		return "Brewery [createDate=" + createDate + ", description=" + description + ", established=" + established
				+ ", id=" + id + ", images=" + images + ", isOrganic=" + isOrganic + ", locations=" + locations
				+ ", name=" + name + ", status=" + status + ", statusDisplay=" + statusDisplay + ", updateDate="
				+ updateDate + ", website=" + website + "]";
	}
	
}
