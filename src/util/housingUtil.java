package util;

import entity.abstracts.abstractHouse;
import entity.concretes.*;


import java.util.ArrayList;
import java.util.List;


// Utility class used as data access and utility functions
public class housingUtil {

    public  List<abstractHouse> allHouses = new ArrayList<>();
    public  List<house> houseList = new ArrayList<>();
    public  List<villa> villaList = new ArrayList<>();
    public  List<summerHouse> summerHouseList = new ArrayList<>();

    public housingUtil() {
        generate();
    }


    public  List<abstractHouse> getAllHouses() {
        return allHouses;
    }
    public  List<house> getHouseList() {
        return houseList;
    }
    public  List<villa> getVillaList() {
        return villaList;
    }
    public  List<summerHouse> getSummerHouseList() {
        return summerHouseList;
    }



    private  List<abstractHouse> generate() {
        houseList = generateHouse();
        villaList = generateVilla();
        summerHouseList = generateSummerHouse();


        allHouses.addAll(houseList);
        allHouses.addAll(villaList);
        allHouses.addAll(summerHouseList);

        return allHouses;

    }


    private  List<house> generateHouse() {
        List<house> generated = new ArrayList<>();
        house h1 = new house(100, 135, 1, 1, "house");
        house h2 = new house(120, 150, 2, 1, "house");
        house h3 = new house(130, 170, 3, 1, "house");

        generated.add(h1);
        generated.add(h2);
        generated.add(h3);

        return generated;
    }

    private  List<villa> generateVilla() {
        List<villa> generated = new ArrayList<>();
        villa v1 = new villa(200, 300, 3, 1, "Villa");
        villa v2 = new villa(300, 450, 4, 2, "Villa");
        villa v3 = new villa(400, 630, 4, 3, "Villa");

        generated.add(v1);
        generated.add(v2);
        generated.add(v3);

        return generated;
    }

    private  List<summerHouse> generateSummerHouse() {
        List<summerHouse> generated = new ArrayList<>();
        summerHouse s1 = new summerHouse(300, 300, 4, 3, "Summer House");
        summerHouse s2 = new summerHouse(420, 400, 5, 4, "Summer House");
        summerHouse s3 = new summerHouse(600, 500, 5, 5, "Summer House");

        generated.add(s1);
        generated.add(s2);
        generated.add(s3);

        return generated;
    }


}
