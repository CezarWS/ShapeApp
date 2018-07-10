package week5BuildingAverage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args ){
        List<Building> buildings = new ArrayList<>();
        Building office = new Building("Centris", Category.OFFICE, 100000.0, "Center" );
        Building flat = new Building("Tower", Category.RESIDENTIAL, 50000.0, "Copou");
        Building penthouse = new Building("Penthouse",Category.RESIDENTIAL, 80000.0, "Pacurari");
        Building church = new Building("church",Category.CHURCH, 1000000.0 , "Copou");

        buildings.add(office);
        buildings.add(flat);
        buildings.add(penthouse);
        buildings.add(church);

        double averagePrice = BuildingsCatalog.getAvgPrice(buildings);

        System.out.println("The average price is : " +averagePrice);

        double categoryAvgPrice = BuildingsCatalog.getBuildingAvgPrice(buildings, Category.RESIDENTIAL);
        System.out.println("The average price by category is : " + categoryAvgPrice);

        double avgPriceNeighborhood = BuildingsCatalog.getBuildingAvgByNeighborhood(buildings, "Copou");
        System.out.println("The average price by neighborhood: " + avgPriceNeighborhood);

       List uniqueNeighood = BuildingsCatalog.uniqueBuildings(buildings);
        System.out.println("The unique neighbourhoods are : " + uniqueNeighood);

    }


}
