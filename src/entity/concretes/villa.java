package entity.concretes;

import entity.abstracts.abstractHouse;

public class villa extends abstractHouse {
    public villa(int price, int sqmt, int room, int livingRoom, String type) {
        super(price, sqmt, type, room, livingRoom);
    }
}
