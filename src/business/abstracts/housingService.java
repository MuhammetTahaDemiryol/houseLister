package business.abstracts;


import entity.abstracts.abstractHouse;

import java.util.List;

public interface housingService {

     int getHouseTotal();
     int getVillaTotal();
     int getSummerHouseTotal();
     int getAllTotal();

     float getHouseAvgSqmt();
     float getVillaAvgSqmt();
     float getSummerHouseAvgSqmt();
     float getAllAvgSqmt();

     List<abstractHouse> filter(int r, int l);
}
