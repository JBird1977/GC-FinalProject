package co.finalfour.beerme.model;

import java.util.ArrayList;

public class BeerStyle 
{
	ArrayList beerStyle = new ArrayList();

	public ArrayList getBeerStyle() {
		return beerStyle;
	}

	public void setBeerStyle(ArrayList beerStyle) {
		this.beerStyle = beerStyle;
	}

	@Override
	public String toString() {
		return "BeerStyle [beerStyle=" + beerStyle + "]";
	}
	
	
	
}
