package co.finalfour.beerme.entity.beer;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import org.hibernate.annotations.Type;

@Embeddable 
public class Style{
	
	@Column(name="objStyleAbvMax")
   	private String abvMax;
	@Column(name="objStyleAbvMin")
   	private String abvMin;
   	@Embedded @Type(type="Category")
   	@Column(name="objStyleCategory")
   	private Category category;
   	@Column(name="objStyleCategoryId")
   	private Long categoryId;
   	@Column(name="objStyleCreateDate")
   	private String createDate;
   	@Column(name="objStyleDescription")
   	@Type(type="text")
   	private String description;
   	@Column(name="objStyleFgMax")
   	private String fgMax;
   	@Column(name="objStyleFgMin")
   	private String fgMin;
   	@Column(name="objStyleIbuMax")
   	private String ibuMax;
   	@Column(name="objStyleIbuMin")
   	private String ibuMin;
   	@Column(name="objStyleId")
   	private Long id;
   	@Column(name="objStyleName")
   	private String name;
   	@Column(name="objStyleOgMin")
   	private String ogMin;
   	@Column(name="objStyleSrmMax")
   	private String srmMax;
   	@Column(name="objStyleSrmMin")
   	private String srmMin;

 	public String getAbvMax(){
		return this.abvMax;
	}
	
 	public void setAbvMax(String abvMax){
		this.abvMax = abvMax;
	}
 	
 	public String getAbvMin(){
		return this.abvMin;
	}
	
 	public void setAbvMin(String abvMin){
		this.abvMin = abvMin;
	}
 	
 	public Category getCategory(){
		return this.category;
	}
	
 	public void setCategory(Category category){
		this.category = category;
	}
 	
 	public Long getCategoryId(){
		return this.categoryId;
	}
	
 	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
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
 	
 	public String getFgMax(){
		return this.fgMax;
	}
	
 	public void setFgMax(String fgMax){
		this.fgMax = fgMax;
	}
 	
 	public String getFgMin(){
		return this.fgMin;
	}
	
 	public void setFgMin(String fgMin){
		this.fgMin = fgMin;
	}
 	
 	public String getIbuMax(){
		return this.ibuMax;
	}
	
 	public void setIbuMax(String ibuMax){
		this.ibuMax = ibuMax;
	}
 	
 	public String getIbuMin(){
		return this.ibuMin;
	}
	
 	public void setIbuMin(String ibuMin){
		this.ibuMin = ibuMin;
	}
 	
 	public Number getId(){
		return this.id;
	}
	
 	public void setId(Long id){
		this.id = id;
	}
 	
 	public String getName(){
		return this.name;
	}
	
 	public void setName(String name){
		this.name = name;
	}
 	
 	public String getOgMin(){
		return this.ogMin;
	}
	
 	public void setOgMin(String ogMin){
		this.ogMin = ogMin;
	}
 	
 	public String getSrmMax(){
		return this.srmMax;
	}
	
 	public void setSrmMax(String srmMax){
		this.srmMax = srmMax;
	}
 	
 	public String getSrmMin(){
		return this.srmMin;
	}
	
 	public void setSrmMin(String srmMin){
		this.srmMin = srmMin;
	}
	
	@Override
	public String toString() {
		return "Style [abvMax=" + abvMax + ", abvMin=" + abvMin + ", category=" + category + ", categoryId="
				+ categoryId + ", createDate=" + createDate + ", description=" + description + ", fgMax=" + fgMax
				+ ", fgMin=" + fgMin + ", ibuMax=" + ibuMax + ", ibuMin=" + ibuMin + ", id=" + id + ", name=" + name
				+ ", ogMin=" + ogMin + ", srmMax=" + srmMax + ", srmMin=" + srmMin + "]";
	}
	
}
