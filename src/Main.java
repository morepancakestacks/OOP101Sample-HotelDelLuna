public class Main {
    public static void main(String[] args) {
        HotelRoom hotelRoom = new SuiteRoom(101);
        ConferenceHall conferenceHall = new ConferenceHall("Function Room A");

        System.out.println("Hotel Room:");
        hotelRoom.bookRoom(); // from Bookable
        hotelRoom.cleanRoom(); // from Maintainable
        hotelRoom.reviewRoom(); // from Reviewable

        System.out.println("\nConference Hall:");
        conferenceHall.bookRoom(); // from Bookable
        conferenceHall.cleanRoom(); // from Maintainable
    }
}