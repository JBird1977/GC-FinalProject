package co.finalfour.beerme.entity.beer;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Images{
	
	@Column(name="objImagesIcon")
   	private String icon;
	@Column(name="objImagesLarge")
   	private String large;
	@Column(name="objImagesMedium")
   	private String medium;

 	public String getIcon(){
		return this.icon;
	}
	
 	public void setIcon(String icon){
		this.icon = icon;
	}
 	
 	public String getLarge(){
		return this.large;
	}
	
 	public void setLarge(String large){
		this.large = large;
	}
 	
 	public String getMedium(){
		return this.medium;
	}
	
 	public void setMedium(String medium){
		this.medium = medium;
	}
	
	@Override
	public String toString() {
		return "Images [icon=" + icon + ", large=" + large + ", medium=" + medium + "]";
	}
	
}
