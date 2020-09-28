package study.jeanwang2dev;

public class Room {

    private Bed bed;
    private FloorLamp lamp;
    private Bookshelf bookshelf;

    public Room(Bed bed, FloorLamp lamp, Bookshelf bookshelf) {
        this.bed = bed;
        this.lamp = lamp;
        this.bookshelf = bookshelf;
    }

    public Bed getBed() {
        return bed;
    }

    public FloorLamp getLamp() {
        return lamp;
    }

    public Bookshelf getBookshelf() {
        return bookshelf;
    }

    public void makeBed(){
        System.out.println("In the room, make the bed");
        bed.make();
    }

}
