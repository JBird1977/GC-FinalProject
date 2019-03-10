package co.finalfour.beerme.entity.beer;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Country{
	
	@Column(name="objCountryCreateDate")
   	private String createDate;
	@Column(name="objCountryDisplayName")
   	private String displayName;
	@Column(name="objCountryIsoCode")
   	private String isoCode;
	@Column(name="objCountryIsoThree")
   	private String isoThree;
	@Column(name="objCountryIsoName")
   	private String name;
	@Column(name="objCountryIsoNumberCode")
   	private Integer numberCode;
	@Column(name="objCountryUrlTitle")
   	private String urlTitle;

 	public String getCreateDate(){
		return this.createDate;
	}
	
 	public void setCreateDate(String createDate){
		this.createDate = createDate;
	}
 	
 	public String getDisplayName(){
		return this.displayName;
	}
	
 	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}
 	
 	public String getIsoCode(){
		return this.isoCode;
	}
	
 	public void setIsoCode(String isoCode){
		this.isoCode = isoCode;
	}
 	
 	public String getIsoThree(){
		return this.isoThree;
	}
	
 	public void setIsoThree(String isoThree){
		this.isoThree = isoThree;
	}
 	
 	public String getName(){
		return this.name;
	}
	
 	public void setName(String name){
		this.name = name;
	}
 	
 	public Integer getNumberCode(){
		return this.numberCode;
	}
	
 	public void setNumberCode(Integer numberCode){
		this.numberCode = numberCode;
	}
 	
 	public String getUrlTitle(){
		return this.urlTitle;
	}
	
 	public void setUrlTitle(String urlTitle){
		this.urlTitle = urlTitle;
	}
	
	@Override
	public String toString() {
		return "Country [createDate=" + createDate + ", displayName=" + displayName + ", isoCode=" + isoCode
				+ ", isoThree=" + isoThree + ", name=" + name + ", numberCode=" + numberCode + ", urlTitle=" + urlTitle
				+ "]";
	}
	
}
