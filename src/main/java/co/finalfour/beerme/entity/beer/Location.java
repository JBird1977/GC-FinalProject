package co.finalfour.beerme.entity.beer;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import org.hibernate.annotations.Type;

@Embeddable
public class Location{
	
	@Embedded @Type(type="Country")
	@Column(name="objLocationsCountry")
   	private Country country;
	@Column(name="objLocationsCountryIsoCode")
   	private String countryIsoCode;
	@Column(name="objLocationsCreateDate")
   	private String createDate;
   	@Column(name="objLocationsId")
   	private String id;
   	@Column(name="objLocationsInPlanning")
   	private char inPlanning;
   	@Column(name="objLocationsIsClosed")
   	private char isClosed;
   	@Column(name="objLocationsIsPrimary")
   	private char isPrimary;
   	@Column(name="objLocationsLatitude")
   	private Double latitude;
   	@Column(name="objLocationsLocality")
   	private String locality;
   	@Column(name="objLocationsLocationType")
   	private String locationType;
   	@Column(name="objLocationsLocationTypeDisplay")
   	private String locationTypeDisplay;
   	@Column(name="objLocationsLongitude")
   	private Double longitude;
   	@Column(name="objLocationsName")
   	private String name;
   	@Column(name="objLocationsOpenToPublic")
   	private char openToPublic;
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
 	
 	public char getInPlanning(){
		return this.inPlanning;
	}
	
 	public void setInPlanning(char inPlanning){
		this.inPlanning = inPlanning;
	}
 	
 	public char getIsClosed(){
		return this.isClosed;
	}
	
 	public void setIsClosed(char isClosed){
		this.isClosed = isClosed;
	}
 	
 	public char getIsPrimary(){
		return this.isPrimary;
	}
	
 	public void setIsPrimary(char isPrimary){
		this.isPrimary = isPrimary;
	}
 	
 	public Double getLatitude(){
		return this.latitude;
	}
	
 	public void setLatitude(Double latitude){
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
 	
 	public Double getLongitude(){
		return this.longitude;
	}
	
 	public void setLongitude(Double longitude){
		this.longitude = longitude;
	}
 	
 	public String getName(){
		return this.name;
	}
	
 	public void setName(String name){
		this.name = name;
	}
 	
 	public char getOpenToPublic(){
		return this.openToPublic;
	}
	
 	public void setOpenToPublic(char openToPublic){
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
		return  name + (yearOpened == null ? "": " - Established " + yearOpened) + " : "
				+ locality + ", " + region + " " + postalCode + " " + country.getDisplayName()
				+ (inPlanning == 'Y' ? "Coming Soon! ": " ") + (isClosed == 'Y' ? "Sorry, this location is closed. ": " ")
				+ (isPrimary == 'Y' ? "Primary Location ": " ")
				+ locationTypeDisplay
				+ (openToPublic == 'Y' ? " Open to the public. ": " ");

	}
	
}
