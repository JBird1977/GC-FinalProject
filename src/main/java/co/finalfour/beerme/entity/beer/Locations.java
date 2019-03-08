package co.finalfour.beerme.entity.beer;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import org.hibernate.annotations.Type;

@Embeddable
public class Locations{
	
	@Embedded @Type(type="Country")
	@Column(name="objLocationsCountry")
   	private Country country;
	@Column(name="objLocationsCountryIsoCode")
   	private String countryIsoCode;
	@Column(name="objLocationsCreateDate")
   	private String createDate;
   	@Column(name="objLocationsId", unique=true)
   	private String id;
   	@Column(name="objLocationsInPlanning")
   	private String inPlanning;
   	@Column(name="objLocationsIsClosed")
   	private String isClosed;
   	@Column(name="objLocationsIsPrimary")
   	private String isPrimary;
   	@Column(name="objLocationsLatitude")
   	private Number latitude;
   	@Column(name="objLocationsLocality")
   	private String locality;
   	@Column(name="objLocationsLocationType")
   	private String locationType;
   	@Column(name="objLocationsLocationTypeDisplay")
   	private String locationTypeDisplay;
   	@Column(name="objLocationsLongitude")
   	private Number longitude;
   	@Column(name="objLocationsName")
   	private String name;
   	@Column(name="objLocationsOpenToPublic")
   	private String openToPublic;
   	@Column(name="objLocationsPostalCode")
   	private String postalCode;
   	@Column(name="objLocationsRegion")
   	private String region;
   	@Column(name="objLocationsStatus")
   	private String status;
   	@Column(name="objLocationsStatusDisplay")
   	private String statusDisplay;
   	@Column(name="objLocationsUpdateDate")
   	private String updateDate;
   	@Column(name="objLocationsWebsite")
   	private String website;
   	@Column(name="objLocationsYearOpened")
   	private String yearOpened;

 	public Country getCountry(){
		return this.country;
	}
	public void setCountry(Country country){
		this.country = country;
	}
 	public String getCountryIsoCode(){
		return this.countryIsoCode;
	}
	public void setCountryIsoCode(String countryIsoCode){
		this.countryIsoCode = countryIsoCode;
	}
 	public String getCreateDate(){
		return this.createDate;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate;
	}
 	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
 	public String getInPlanning(){
		return this.inPlanning;
	}
	public void setInPlanning(String inPlanning){
		this.inPlanning = inPlanning;
	}
 	public String getIsClosed(){
		return this.isClosed;
	}
	public void setIsClosed(String isClosed){
		this.isClosed = isClosed;
	}
 	public String getIsPrimary(){
		return this.isPrimary;
	}
	public void setIsPrimary(String isPrimary){
		this.isPrimary = isPrimary;
	}
 	public Number getLatitude(){
		return this.latitude;
	}
	public void setLatitude(Number latitude){
		this.latitude = latitude;
	}
 	public String getLocality(){
		return this.locality;
	}
	public void setLocality(String locality){
		this.locality = locality;
	}
 	public String getLocationType(){
		return this.locationType;
	}
	public void setLocationType(String locationType){
		this.locationType = locationType;
	}
 	public String getLocationTypeDisplay(){
		return this.locationTypeDisplay;
	}
	public void setLocationTypeDisplay(String locationTypeDisplay){
		this.locationTypeDisplay = locationTypeDisplay;
	}
 	public Number getLongitude(){
		return this.longitude;
	}
	public void setLongitude(Number longitude){
		this.longitude = longitude;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public String getOpenToPublic(){
		return this.openToPublic;
	}
	public void setOpenToPublic(String openToPublic){
		this.openToPublic = openToPublic;
	}
 	public String getPostalCode(){
		return this.postalCode;
	}
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}
 	public String getRegion(){
		return this.region;
	}
	public void setRegion(String region){
		this.region = region;
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
 	public String getYearOpened(){
		return this.yearOpened;
	}
	public void setYearOpened(String yearOpened){
		this.yearOpened = yearOpened;
	}
	
	@Override
	public String toString() {
		return "Locations [country=" + country + ", countryIsoCode=" + countryIsoCode + ", createDate=" + createDate
				+ ", id=" + id + ", inPlanning=" + inPlanning + ", isClosed=" + isClosed + ", isPrimary=" + isPrimary
				+ ", latitude=" + latitude + ", locality=" + locality + ", locationType=" + locationType
				+ ", locationTypeDisplay=" + locationTypeDisplay + ", longitude=" + longitude + ", name=" + name
				+ ", openToPublic=" + openToPublic + ", postalCode=" + postalCode + ", region=" + region + ", status="
				+ status + ", statusDisplay=" + statusDisplay + ", updateDate=" + updateDate + ", website=" + website
				+ ", yearOpened=" + yearOpened + "]";
	}
	
}
