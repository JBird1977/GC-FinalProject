package co.finalfour.beerme.entity.beer;

import java.util.List;

public class LocationsResponse {

	private List<Location> data;

	public List<Location> getData() {
		return data;
	}

	public void setData(List<Location> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "LocationsResponse [locations=" + data + "]";
	}
	
}
