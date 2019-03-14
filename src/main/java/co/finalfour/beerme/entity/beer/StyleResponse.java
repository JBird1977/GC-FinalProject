package co.finalfour.beerme.entity.beer;

import java.util.ArrayList;
import java.util.List;

public class StyleResponse {

	private List<Style> data = new ArrayList<>();
	private String status = "failure";

	public List<Style> getData() {
		return data;
	}

	public void setData(List<Style> data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "StyleResponse [data=" + data + "]";
	}
	
}
