public class Main {
    public static void main(String[] args) {

        Bookable item1 = new StandardRoom(101);
        Bookable item2 = new ConferenceHall("Function Hall A");

        item1.bookRoom();
        item2.bookRoom();
    }
}