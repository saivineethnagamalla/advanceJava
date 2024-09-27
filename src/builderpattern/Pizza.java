package builderpattern;

import java.util.ArrayList;
import java.util.List;

// Product Class
public class Pizza {
	private String dough;
	private String sauce;
	private List<String> toppings;

	public List<String> getToppings() {
		return toppings;
	}

	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}

	public String getDough() {
		return dough;
	}

	public String getSauce() {
		return sauce;
	}

	public Pizza() {
		this.toppings = new ArrayList<>();
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public void addTopping(String topping) {
		this.toppings.add(topping);
	}

	// Other methods...
}