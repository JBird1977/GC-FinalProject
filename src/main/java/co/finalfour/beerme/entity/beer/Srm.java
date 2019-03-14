package co.finalfour.beerme.entity.beer;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Srm {

	@Column(name="objSrmId", unique=true)
	private Integer id;
	@Column(name="objSrmName")
	private String name;
	private String hex;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHex() {
		return hex;
	}
	public void setHex(String hex) {
		this.hex = hex;
	}
	
	@Override
	public String toString() {
		return "Srm [id=" + id + ", name=" + name + ", hex=" + hex + "]";
	}
	
}
