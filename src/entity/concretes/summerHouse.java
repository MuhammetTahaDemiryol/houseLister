package entity.concretes;

import entity.abstracts.abstractHouse;

public class summerHouse extends abstractHouse {
    public summerHouse(int price, int sqmt, int room, int livingRoom, String type) {
        super(price, sqmt, type, room, livingRoom);
    }
}
