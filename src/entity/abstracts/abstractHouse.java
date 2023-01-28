package entity.abstracts;


// Abstract class is used because all the entities are similar with minute differences, this class made the child classes
// much smaller.
public abstract class abstractHouse {

    private int price;
    private int sqmt;
    private int room;
    private int livingRoom;

    private String type;

    public abstractHouse (int price, int sqmt, String type, int room, int livingRoom) {
        this.price = price;
        this.sqmt = sqmt;
        this.type = type;
        this.room = room;
        this.livingRoom = livingRoom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSqmt() {
        return sqmt;
    }

    public void setSqmt(int sqmt) {
        this.sqmt = sqmt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(int livingRoom) {
        this.livingRoom = livingRoom;
    }

    @Override
    public String toString() {
        return "Asset{"
                + "Type=" + this.type
                + ", Rooms=" + this.room + "+" + this.livingRoom
                + ", squareMeters=" + this.sqmt
                + ", price=" + this.price
                + "}";
    }

}