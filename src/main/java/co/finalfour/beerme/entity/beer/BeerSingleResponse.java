package co.finalfour.beerme.entity.beer;

public class BeerSingleResponse {

	private Beer data;

	public Beer getData() {
		return data;
	}

	public void setData(Beer data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "BeerSingleResponse [data=" + data + "]";
	}
	
}
