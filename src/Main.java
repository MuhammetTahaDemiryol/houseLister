import business.concretes.housingManager;
import entity.abstracts.abstractHouse;

public class Main {
    public static void main(String[] args) {
        housingManager manager = new housingManager();

        System.out.println("Total price of all assets = " + manager.getAllTotal() +'\n');
        System.out.println("Total price of all houses = " + manager.getHouseTotal() +'\n');
        System.out.println("Total price of all villas = " + manager.getVillaTotal() +'\n');
        System.out.println("Total price of all summer houses = " + manager.getSummerHouseTotal() +'\n');

        System.out.println("******************************************************************************\n");

        System.out.println("Average square meters of all assets = " + manager.getAllAvgSqmt() +'\n');
        System.out.println("Average square meters of all houses = " + manager.getHouseAvgSqmt() +'\n');
        System.out.println("Average square meters of all villas = " + manager.getVillaAvgSqmt() +'\n');
        System.out.println("Average square meters of all summer houses = " + manager.getSummerHouseAvgSqmt() +'\n');

        System.out.println("******************************************************************************\n");

        System.out.println("Filtering all assets with 3 rooms and 1 living room.");
        for(abstractHouse h : manager.filter(3,1)){
            System.out.println(h.toString());
        }


    }
}