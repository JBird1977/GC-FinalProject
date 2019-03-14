package co.finalfour.beerme.entity.beer;

import java.util.ArrayList;
import java.util.List;

public class SrmResponse {

	private List<Srm> data = new ArrayList<>();
	private String status = "failure";

	public List<Srm> getData() {
		return data;
	}

	public void setData(List<Srm> data) {
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
		return "SrmResponse [data=" + data + "]";
	}
	
}
