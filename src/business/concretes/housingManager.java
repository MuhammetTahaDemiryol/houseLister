package business.concretes;

import business.abstracts.housingService;
import entity.abstracts.abstractHouse;
import entity.concretes.*;
import util.housingUtil;

import java.util.ArrayList;
import java.util.List;


//The business layer is the where all the logic rests, I implemented an interface for scalability
public class housingManager implements housingService {

    housingUtil util = new housingUtil();

    @Override
    public int getHouseTotal() {
        int temp = 0;
        for(house h : util.houseList){
             temp += h.getPrice();
        }
        return temp;
    }

    @Override
    public int getVillaTotal() {
        int temp = 0;
        for(villa v : util.villaList){
            temp += v.getPrice();
        }
        return temp;
    }

    @Override
    public int getSummerHouseTotal() {
        int temp = 0;
        for(summerHouse s : util.summerHouseList){
            temp += s.getPrice();
        }
        return temp;
    }

    @Override
    public int getAllTotal() {
        int temp = 0;
        for(abstractHouse a : util.allHouses){
            temp += a.getPrice();
        }
        return temp;
    }

    @Override
    public float getHouseAvgSqmt() {
        float temp = 0;

        int index =0;

        for(house h : util.houseList){
            temp += h.getSqmt();
            index++;
        }

        return  (float) temp / index;
    }

    @Override
    public float getVillaAvgSqmt() {
        float temp = 0;

        int index =0;

        for(villa v : util.villaList){
            temp += v.getSqmt();
            index++;
        }

        return  (float) temp / index;
    }

    @Override
    public float getSummerHouseAvgSqmt() {
        float temp = 0;

        int index =0;

        for(summerHouse s : util.summerHouseList){
            temp += s.getSqmt();
            index++;
        }

        return  (float) temp / index;
    }

    @Override
    public float getAllAvgSqmt() {
        float temp = 0;

        int index =0;

        for(abstractHouse a : util.allHouses){
            temp += a.getSqmt();
            index++;
        }

        return (float) temp / index;
    }

    @Override
    public List<abstractHouse> filter(int r, int l) {
        List<abstractHouse> f = new ArrayList<>();

        for (abstractHouse a : util.allHouses){
            if (a.getLivingRoom()==l && a.getRoom()==r){
                f.add(a);
            }
        }
        return f;
    }
}
