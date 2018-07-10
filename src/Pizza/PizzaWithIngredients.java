package Pizza;

public class PizzaWithIngredients extends Pizza {
	private double ingredientsPrice;

	public PizzaWithIngredients(String description, double basePrice, int ingredientsPrice) {
		super(description, basePrice);
		this.ingredientsPrice = ingredientsPrice;

	}

	public String getDescription() {
		return super.getDescription() + "ingredients";
	}

	public double getBasePrice() {
		return super.getBasePrice() + ingredientsPrice;
	}

	@Override
	public String toString() {
		return "PizzaWithIngredients [ingredientsPrice=" + ingredientsPrice + "]";
	}

	public double getIngredientsPrice() {
		return ingredientsPrice;
	}

	public void setIngredientsPrice(int ingredientsPrice) {
		this.ingredientsPrice = ingredientsPrice;
	}

}
