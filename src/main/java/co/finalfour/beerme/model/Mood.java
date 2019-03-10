package co.finalfour.beerme.model;

import java.util.ArrayList;
import java.util.List;

public class Mood 
{
	ArrayList moods = new ArrayList();

	public ArrayList getMoods() {
		return moods;
	}

	public void setMoods(ArrayList moods) {
		this.moods = moods;
	}

	@Override
	public String toString() {
		return "Mood [moods=" + moods + "]";
	}
}
