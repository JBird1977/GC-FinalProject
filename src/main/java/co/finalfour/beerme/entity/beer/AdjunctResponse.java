package co.finalfour.beerme.entity.beer;

import java.util.List;

public class AdjunctResponse {

	
	private List<Adjunct> data;

	@Override
	public String toString() {
		return "AdjunctResponse [data=" + data + "]";
	}

	public List<Adjunct> getData() {
		return data;
	}

	public void setData(List<Adjunct> data) {
		this.data = data;
	}
}
