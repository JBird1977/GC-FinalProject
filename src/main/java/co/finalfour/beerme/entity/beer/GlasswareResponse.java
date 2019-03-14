package co.finalfour.beerme.entity.beer;

import java.util.ArrayList;
import java.util.List;

public class GlasswareResponse {

	private List<Glass> data = new ArrayList<>();
	private String status = "failure";

	public List<Glass> getData() {
		return data;
	}

	public void setData(List<Glass> data) {
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
		return "GlassResponse [data=" + data + "]";
	}
		
}
