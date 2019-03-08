package co.finalfour.beerme.entity.beer;

import java.util.List;

public class IngredientsList {

	private List<Ingredient> data;

	public List<Ingredient> getData() {
		return data;
	}

	public void setData(List<Ingredient> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "IngredientsList [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
