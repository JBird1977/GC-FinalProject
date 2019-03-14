package co.finalfour.beerme.entity.beer;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Guild {

	@Column(name="objGuildId", unique=true)
    private String id;
	@Column(name="objGuildName")
    private String name;
	@Column(name="objGuildDescription")
    private String description;
	@Column(name="objGuildEstablished")
    private Integer established;
	@Column(name="objGuildWebsite")
    private String website;
    @Column(name="objGuildStatus")
    private String status;
    @Column(name="objGuildStatusDisplay")
    private String statusDisplay;
//    private String createDate;
//    private String updateDate;
    private char isCertifiedCraftBrewer;
    
   	//private Images images;
    
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
	
	public Integer getEstablished() {
		return established;
	}
	
	public void setEstablished(Integer established) {
		this.established = established;
	}
	
	public String getWebsite() {
		return website;
	}
	
	public void setWebsite(String website) {
		this.website = website;
	}
	
//	public Images getImages() {
//		return images;
//	}
//	
//	public void setImages(Images images) {
//		this.images = images;
//	}
	
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
	
//	public String getCreateDate() {
//		return createDate;
//	}
//	
//	public void setCreateDate(String createDate) {
//		this.createDate = createDate;
//	}
//	
//	public String getUpdateDate() {
//		return updateDate;
//	}
//	
//	public void setUpdateDate(String updateDate) {
//		this.updateDate = updateDate;
//	}

	public char getIsCertifiedCraftBrewer() {
		return isCertifiedCraftBrewer;
	}

	public void setIsCertifiedCraftBrewer(char isCertifiedCraftBrewer) {
		this.isCertifiedCraftBrewer = isCertifiedCraftBrewer;		
	}

	@Override
	public String toString() {
		return "Guild [id=" + id + ", name=" + name + ", description=" + description + ", established=" + established
				+ ", website=" + website + ", status=" + status + ", statusDisplay="
				+ statusDisplay 
				+ ", isCertifiedCraftBrewer=" + isCertifiedCraftBrewer + "]";
	}
	
}
