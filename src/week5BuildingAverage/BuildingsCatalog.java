package week5BuildingAverage;


import java.util.*;

public class BuildingsCatalog {
          public static double getAvgPrice(List<Building> buildingsList){
             int sum = 0;
             if(buildingsList == null)
                 return sum;
              for (Building build: buildingsList) {
                  sum += build.getPrice();
              }
              return sum/buildingsList.size();
          }
        public static double getBuildingAvgPrice(List<Building> buildingList,Category category){
              int sum = 0;
              int counter = 0;
              if (buildingList == null)
                  return sum;
            for (Building building: buildingList) {
                if (category.equals(building.getCategory())) {
                    sum+= building.getPrice();
                    counter++;
                }

            }
            if (counter == 0)
                return 0;
            return sum/counter;
        }

        public static double getBuildingAvgByNeighborhood(List<Building> buildingList, String neighborhood) {
              int sum = 0;
              int counter = 0;
              if(buildingList == null){
                  return sum;
              }
            for (Building building: buildingList) {
                  if(neighborhood.equals(building.getNeighborhood())){
                      sum+=building.getPrice();
                      counter++;
                  }

            }
            if (counter == 0)return 0;
              return sum/counter;

        }
        public static List<String> uniqueBuildings(List<Building> listBuildings){
              List<String> buildings = new ArrayList<>();
              if (listBuildings == null) {
                  return buildings;
              }
            for (Building build : listBuildings) {
                  buildings.add(build.getNeighborhood());

            }
            return buildings;
        }



}
