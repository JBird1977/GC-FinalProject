package co.finalfour.beerme.entity.beer;

import java.util.List;

public class Beer{

   	private String abv;
   	private Available available;
   	private Number availableId;
   	private String createDate;
   	private String description;
	private String foodPairings;
   	private Glass glass;
   	private Number glasswareId;
	private String ibu;
   	private String id;
   	private String isOrganic;
   	private String name;
	private Number originalGravity;
   	private String status;
   	private String statusDisplay;
   	private Style style;
   	private Number styleId;
	private String type;
   	private String updateDate;
	private List<Brewery> breweries;
	private Images labels;

 	public List<Brewery> getBreweries() {
		return breweries;
	}

	public void setBreweries(List<Brewery> breweries) {
		this.breweries = breweries;
	}

	public String getAbv(){
		return this.abv;
	}
	public void setAbv(String abv){
		this.abv = abv;
	}
 	public Available getAvailable(){
		return this.available;
	}
	public void setAvailable(Available available){
		this.available = available;
	}
 	public Number getAvailableId(){
		return this.availableId;
	}
	public void setAvailableId(Number availableId){
		this.availableId = availableId;
	}
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
	public String getFoodPairings() {
		return this.foodPairings;
	}
	public void setFoodPairings(String foodPairings) {
		this.foodPairings = foodPairings;
	}
 	public Glass getGlass(){
		return this.glass;
	}
	public void setGlass(Glass glass){
		this.glass = glass;
	}
 	public Number getGlasswareId(){
		return this.glasswareId;
	}
	public void setGlasswareId(Number glasswareId){
		this.glasswareId = glasswareId;
	}
	public String getIbu() {
		return this.ibu;
	}
	public void setIbu(String ibu) {
		this.ibu = ibu;
	}
 	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
 	public String getIsOrganic(){
		return this.isOrganic;
	}
	public void setIsOrganic(String isOrganic){
		this.isOrganic = isOrganic;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Number getOriginalGravity() {
		return this.originalGravity;
	}
	public void setOriginalGravity(Number originalGravity) {
		this.originalGravity = originalGravity;
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
 	public Style getStyle(){
		return this.style;
	}
	public void setStyle(Style style){
		this.style = style;
	}
 	public Number getStyleId(){
		return this.styleId;
	}
	public void setStyleId(Number styleId){
		this.styleId = styleId;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
 	public String getUpdateDate(){
		return this.updateDate;
	}
	public void setUpdateDate(String updateDate){
		this.updateDate = updateDate;
	}

	public Images getLabels() {
		return labels;
	}

	public void setLabels(Images images) {
		this.labels = images;
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
