package co.finalfour.beerme.entity.beer;

import java.util.List;

public class HopResponse {

	private List<Hop> data;

	public List<Hop> getData() {
		return data;
	}

	public void setData(List<Hop> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "HopResponse [data=" + data + "]";
	}
	
	
}
