package co.finalfour.beerme.entity.beer;

public class Mood 
{

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mood [name=" + name + "]";
	}
	
	
}
