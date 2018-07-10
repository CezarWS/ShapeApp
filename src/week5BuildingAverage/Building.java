package week5BuildingAverage;

public class Building {
   private String name;
   private Category category;
   private double price;
   private String neighborhood;

   public Building(String name, Category category, double price, String neighborhood){
       this.name = name;
       this.category = category;
       this.price = price;
       this.neighborhood = neighborhood;
   }

   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name = name;
   }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", neighborhood='" + neighborhood + '\'' +
                '}';
    }
}
