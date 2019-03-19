package co.finalfour.beerme.model;

import java.util.ArrayList;

public class StyleName {

	
	ArrayList styleName = new ArrayList();

	public ArrayList getStyleName() {
		return styleName;
	}

	public void setStyleName(ArrayList styleName) {
		this.styleName = styleName;
	}

	@Override
	public String toString() {
		return "styleName [styleName=" + styleName + "]";
	}
	
	
}
