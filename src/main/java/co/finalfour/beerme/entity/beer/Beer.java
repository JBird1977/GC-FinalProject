package co.finalfour.beerme.entity.beer;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;

@Entity
public class Beer{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long beerId;
	
   	private String abv;
   	@Embedded @Type(type="Available")
   	private Available available;
   	private Number availableId;
   	private String createDate;
//   	@Column @Type(type="text")
   	@Transient
   	private String description;
	private String foodPairings;
	@Embedded @Type(type="Glass")
   	private Glass glass;
   	private Number glasswareId;
	private String ibu;
	@Column(unique=true)
   	private String id;
   	private String isOrganic;
   	private String name;
	private Number originalGravity;
   	private String status;
   	private String statusDisplay;
   	@Embedded @Type(type="Style")
   	private Style style;
   	private Number styleId;
	private String type;
   	private String updateDate;
   	@ElementCollection 
	private List<Brewery> breweries;
   	@Embedded @Type(type="Images")
	private Images labels;
   	
   	private Integer rating;

	public Long getBeerId() {
		return beerId;
	}



	public void setBeerId(Long beerId) {
		this.beerId = beerId;
	}



	public String getAbv() {
		return abv;
	}



	public void setAbv(String abv) {
		this.abv = abv;
	}



	public Available getAvailable() {
		return available;
	}



	public void setAvailable(Available available) {
		this.available = available;
	}



	public Number getAvailableId() {
		return availableId;
	}



	public void setAvailableId(Number availableId) {
		this.availableId = availableId;
	}



	public String getCreateDate() {
		return createDate;
	}



	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getFoodPairings() {
		return foodPairings;
	}



	public void setFoodPairings(String foodPairings) {
		this.foodPairings = foodPairings;
	}



	public Glass getGlass() {
		return glass;
	}



	public void setGlass(Glass glass) {
		this.glass = glass;
	}



	public Number getGlasswareId() {
		return glasswareId;
	}



	public void setGlasswareId(Number glasswareId) {
		this.glasswareId = glasswareId;
	}



	public String getIbu() {
		return ibu;
	}



	public void setIbu(String ibu) {
		this.ibu = ibu;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getIsOrganic() {
		return isOrganic;
	}



	public void setIsOrganic(String isOrganic) {
		this.isOrganic = isOrganic;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Number getOriginalGravity() {
		return originalGravity;
	}



	public void setOriginalGravity(Number originalGravity) {
		this.originalGravity = originalGravity;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getStatusDisplay() {
		return statusDisplay;
	}



	public void setStatusDisplay(String statusDisplay) {
		this.statusDisplay = statusDisplay;
	}



	public Style getStyle() {
		return style;
	}



	public void setStyle(Style style) {
		this.style = style;
	}



	public Number getStyleId() {
		return styleId;
	}



	public void setStyleId(Number styleId) {
		this.styleId = styleId;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getUpdateDate() {
		return updateDate;
	}



	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}



	public List<Brewery> getBreweries() {
		return breweries;
	}



	public void setBreweries(List<Brewery> breweries) {
		this.breweries = breweries;
	}



	public Images getLabels() {
		return labels;
	}



	public void setLabels(Images labels) {
		this.labels = labels;
	}



	public Integer getRating() {
		return rating;
	}



	public void setRating(Integer rating) {
		this.rating = rating;
	}



	@Override
	public String toString() {
		return "Beer [abv=" + abv + ", ibu=" + ibu + " available=" + available
				+ ", availableId=" + availableId + ", type=" + type
				+ ", createDate=" + createDate + ", description=" + description
				+ ", foodPairings=" + foodPairings + ", glass=" + glass
				+ ", glasswareId=" + glasswareId + ", id=" + id
				+ ", isOrganic=" + isOrganic + ", originalGravity=" + originalGravity
				+ ", name=" + name + ", status=" + status + ", statusDisplay=" + statusDisplay
				+ ", style=" + style + ", styleId=" + styleId + ", updateDate=" + updateDate
				+ ", breweries=" + breweries + "]";
	}
}
