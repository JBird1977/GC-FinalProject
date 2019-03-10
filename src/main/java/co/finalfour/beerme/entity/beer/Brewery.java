package co.finalfour.beerme.entity.beer;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Brewery{
	
    @JsonIgnore
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long breweryId;
	
   	private String createDate;
   	@Column @Type(type="text")
   	private String description;
   	private String established;
   	@Column(name="objBreweryId", unique=true)
   	private String id;
   	@Embedded @Type(type="Images")
   	private Images images;
   	private String isOrganic;
   	@ElementCollection 
   	private List<Location> locations;
   	private String name;
   	private String status;
   	private String statusDisplay;
   	private String updateDate;
   	private String website;
   	
   	private Integer rating;
   	
    @ManyToMany(cascade =
        {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "beer_brewery",
        joinColumns = {
            @JoinColumn(
                name = "beer_id",
                referencedColumnName = "id"
            )
        },
        inverseJoinColumns = {
            @JoinColumn(
                name = "brewery_id",
                referencedColumnName = "id"
            )
        }
    )
	private List<Beer> beers = new ArrayList<Beer>();

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
 	
 	public List<Location> getLocations(){
		return this.locations;
	}
	
 	public void setLocations(List<Location> locations){
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
	
	public Long getBreweryId() {
		return breweryId;
	}

	public void setBreweryId(Long breweryId) {
		this.breweryId = breweryId;
	}

	public List<Beer> getBeers() {
		return beers;
	}

	public void setBeers(List<Beer> beers) {
		this.beers = beers;
	}
	
	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Brewery [createDate=" + createDate + ", description=" + description + ", established=" + established
				+ ", id=" + id + ", images=" + images + ", isOrganic=" + isOrganic + ", locations=" + locations
				+ ", name=" + name + ", status=" + status + ", statusDisplay=" + statusDisplay + ", updateDate="
				+ updateDate + ", website=" + website + "]";
	}
	
}
