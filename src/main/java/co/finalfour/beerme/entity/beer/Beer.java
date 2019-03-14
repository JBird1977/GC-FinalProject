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
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Type;

@Entity
public class Beer {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long beerId;
	
	@Column(name="objBeerId", unique=true)
   	private String id;
	@Column(name="objBeerName")
   	private String name;
   	private String abv;
	private String ibu;
   	@Column(name="objBeerDescription") @Type(type="text")
   	private String description;
	private String foodPairings;
	private String type;
   	private String updateDate;
   	private String createDate;
   	@Column(name="objBeerStatus")
   	private String status;
   	@Column(name="objBeerStatusDisplay")
   	private String statusDisplay;
	private Double originalGravity;
   	@Embedded @Type(type="Available")
   	private Available available;
   	private Integer availableId;
   	@Embedded @Type(type="Srm")
   	private Srm srm;
   	private Integer srmId;
	@Embedded @Type(type="Glassware")
   	private Glass glass;
   	private Integer glasswareId;
   	@Embedded @Type(type="Style")
   	private Style style;
   	private Integer styleId;
   	private char isOrganic;
   	@Embedded @Type(type="Images")
	private Images labels;
   	private char hasLabels;
   	@ElementCollection
   	private List<String> socialAccounts;
   	private char withSocialAccounts;
   	private char withIngredients;
   	private Integer year;
   	
   	private Integer rating;
   	
    @ManyToMany(mappedBy="beers",
        	cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Brewery> breweries = new ArrayList<>();
    private char withBreweries;
    
//    @OneToMany(mappedBy="beer",
//    		cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    @JoinColumn(name="beer_id")
    @ElementCollection
    private List<Ingredient> ingredients = new ArrayList<>();

	public Long getBeerId() {
		return beerId;
	}

	public void setBeerId(Long beerId) {
		this.beerId = beerId;
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

	public String getAbv() {
		return abv;
	}

	public void setAbv(String abv) {
		this.abv = abv;
	}

	public String getIbu() {
		return ibu;
	}

	public void setIbu(String ibu) {
		this.ibu = ibu;
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

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
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

	public Double getOriginalGravity() {
		return originalGravity;
	}

	public void setOriginalGravity(Double originalGravity) {
		this.originalGravity = originalGravity;
	}

	public Available getAvailable() {
		return available;
	}

	public void setAvailable(Available available) {
		this.available = available;
	}

	public Integer getAvailableId() {
		return availableId;
	}

	public void setAvailableId(Integer availableId) {
		this.availableId = availableId;
	}

	public Srm getSrm() {
		return srm;
	}

	public void setSrm(Srm srm) {
		this.srm = srm;
	}

	public Integer getSrmId() {
		return srmId;
	}

	public void setSrmId(Integer srmId) {
		this.srmId = srmId;
	}

	public Glass getGlass() {
		return glass;
	}

	public void setGlass(Glass glass) {
		this.glass = glass;
	}

	public Integer getGlasswareId() {
		return glasswareId;
	}

	public void setGlasswareId(Integer glasswareId) {
		this.glasswareId = glasswareId;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	public Integer getStyleId() {
		return styleId;
	}

	public void setStyleId(Integer styleId) {
		this.styleId = styleId;
	}

	public char getIsOrganic() {
		return isOrganic;
	}

	public void setIsOrganic(char isOrganic) {
		this.isOrganic = isOrganic;
	}

	public Images getLabels() {
		return labels;
	}

	public void setLabels(Images labels) {
		this.labels = labels;
	}

	public char getHasLabels() {
		return hasLabels;
	}

	public void setHasLabels(char hasLabels) {
		this.hasLabels = hasLabels;
	}

	public List<String> getSocialAccounts() {
		return socialAccounts;
	}

	public void setSocialAccounts(List<String> socialAccounts) {
		this.socialAccounts = socialAccounts;
	}

	public char getWithSocialAccounts() {
		return withSocialAccounts;
	}

	public void setWithSocialAccounts(char withSocialAccounts) {
		this.withSocialAccounts = withSocialAccounts;
	}

	public char getWithIngredients() {
		return withIngredients;
	}

	public void setWithIngredients(char withIngredients) {
		this.withIngredients = withIngredients;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public List<Brewery> getBreweries() {
		return breweries;
	}

	public void setBreweries(List<Brewery> breweries) {
		this.breweries = breweries;
	}

	public char getWithBreweries() {
		return withBreweries;
	}

	public void setWithBreweries(char withBreweries) {
		this.withBreweries = withBreweries;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Beer [beerId=" + beerId + ", id=" + id + ", name=" + name + ", abv=" + abv + ", ibu=" + ibu
				+ ", description=" + description + ", foodPairings=" + foodPairings + ", type=" + type + ", updateDate="
				+ updateDate + ", createDate=" + createDate + ", status=" + status + ", statusDisplay=" + statusDisplay
				+ ", originalGravity=" + originalGravity + ", available=" + available + ", availableId=" + availableId
				+ ", srm=" + srm + ", srmId=" + srmId + ", glass=" + glass + ", glasswareId=" + glasswareId + ", style="
				+ style + ", styleId=" + styleId + ", isOrganic=" + isOrganic + ", labels=" + labels + ", hasLabels="
				+ hasLabels + ", socialAccounts=" + socialAccounts + ", withSocialAccounts=" + withSocialAccounts
				+ ", withIngredients=" + withIngredients + ", year=" + year + ", rating=" + rating + ", breweries="
				+ breweries + ", withBreweries=" + withBreweries + ", ingredients=" + ingredients + "]";
	}
	
}
