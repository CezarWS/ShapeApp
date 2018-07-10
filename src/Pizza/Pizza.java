package Pizza;

public class Pizza {
	private String description;
	private double basePrice;

	public Pizza(String description, double basePrice) {
		if (description == null || description.isEmpty()) {
			throw new IllegalArgumentException();
		}
		if (basePrice < 0) {
			throw new IllegalArgumentException();
		}
		this.description = description;
		this.basePrice = basePrice;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Pizza [description=" + description + ", basePrice=" + basePrice + "]";
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

}
