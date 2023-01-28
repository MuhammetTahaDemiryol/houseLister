package entity.concretes;

import entity.abstracts.abstractHouse;

public class house extends abstractHouse{
    public house(int price, int sqmt, int room, int livingRoom, String type) {
        super(price, sqmt, type, room, livingRoom);
    }
}

