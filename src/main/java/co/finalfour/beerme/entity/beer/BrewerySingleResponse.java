package co.finalfour.beerme.entity.beer;

public class BrewerySingleResponse {

	private Brewery data;

	public Brewery getData() {
		return data;
	}

	public void setData(Brewery data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "BrewerySingleResponse [data=" + data + "]";
	}
	
}
