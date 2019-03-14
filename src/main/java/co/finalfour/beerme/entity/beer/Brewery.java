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
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Brewery{
	
    @JsonIgnore
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long breweryId;
	
   	@Column(name="objBreweryId", unique=true)
   	private String id;
   	@Column(name="objBreweryName")
   	private String name;
   	@Column(name="objBreweryDescription") @Type(type="text")
   	private String description;	
   	private String createDate;
   	@ElementCollection 
   	private List<Location> locations;  
   	@Column(name="objBreweryStatus")
   	private String status;
   	@Column(name="objBreweryStatusDisplay")
   	private String statusDisplay;
   	private String updateDate;
   	@Column(name="objBreweryWebsite")
   	private String website;
   	private char isOrganic;
   	private String socialAccounts;
	private char withSocialAccounts;
//	@Embedded @Type(type="Guild")
//	private Guild brewersAssociation;
	private char withGuilds;
	private char withLocations;
	@ElementCollection
	private List<String> alternativeNames;
	private char withAlternativeNames;
	@Column(name="objBreweryEstablished")
	private Integer established;
   	
   	private Integer rating;
   	@JsonProperty("breweryId")
   	private String breweryIdString;
   	
    public String getBreweryIdString() {
		return breweryIdString;
	}

	public void setBreweryIdString(String breweryIdString) {
		this.breweryIdString = breweryIdString;
	}

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

	public Long getBreweryId() {
		return breweryId;
	}

	public void setBreweryId(Long breweryId) {
		this.breweryId = breweryId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
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

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public char getIsOrganic() {
		return isOrganic;
	}

	public void setIsOrganic(char isOrganic) {
		this.isOrganic = isOrganic;
	}

	public String getSocialAccounts() {
		return socialAccounts;
	}

	public void setSocialAccounts(String socialAccounts) {
		this.socialAccounts = socialAccounts;
	}

	public char getWithSocialAccounts() {
		return withSocialAccounts;
	}

	public void setWithSocialAccounts(char withSocialAccounts) {
		this.withSocialAccounts = withSocialAccounts;
	}

/*	public Guild getBrewersAssociation() {
		return brewersAssociation;
	}

	public void setBrewersAssociation(Guild brewersAssociation) {
		this.brewersAssociation = brewersAssociation;
	}*/

	public char getWithGuilds() {
		return withGuilds;
	}

	public void setWithGuilds(char withGuilds) {
		this.withGuilds = withGuilds;
	}

	public char getWithLocations() {
		return withLocations;
	}

	public void setWithLocations(char withLocations) {
		this.withLocations = withLocations;
	}

	public List<String> getAlternativeNames() {
		return alternativeNames;
	}

	public void setAlternativeNames(List<String> alternativeNames) {
		this.alternativeNames = alternativeNames;
	}

	public char getWithAlternativeNames() {
		return withAlternativeNames;
	}

	public void setWithAlternativeNames(char withAlternativeNames) {
		this.withAlternativeNames = withAlternativeNames;
	}

	public Integer getEstablished() {
		return established;
	}

	public void setEstablished(Integer established) {
		this.established = established;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public List<Beer> getBeers() {
		return beers;
	}

	public void setBeers(List<Beer> beers) {
		this.beers = beers;
	}

	@Override
	public String toString() {
		return "Brewery [breweryId=" + breweryId + ", id=" + id + ", name=" + name + ", description=" + description
				+ ", createDate=" + createDate + ", locations=" + locations + ", status=" + status + ", statusDisplay="
				+ statusDisplay + ", updateDate=" + updateDate + ", website=" + website + ", isOrganic=" + isOrganic
				+ ", socialAccounts=" + socialAccounts + ", withSocialAccounts=" + withSocialAccounts
				+ ", brewersAssociation=" //+ brewersAssociation
				+ ", withGuilds=" + withGuilds + ", withLocations="
				+ withLocations + ", alternativeNames=" + alternativeNames + ", withAlternativeNames="
				+ withAlternativeNames + ", established=" + established + ", rating=" + rating + ", breweryIdString="
				+ breweryIdString + ", beers=" + beers + "]";
	}
	
}
