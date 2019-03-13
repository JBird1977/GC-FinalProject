package co.finalfour.beerme.entity.beer;

public class HopSingleResponse {
	
	private Hop data;

	@Override
	public String toString() {
		return "HopSingleResponse [data=" + data + "]";
	}

	public Hop getData() {
		return data;
	}

	public void setData(Hop data) {
		this.data = data;
	}
	
	

}
