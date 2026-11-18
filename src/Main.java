public class Main {
    public static void main(String[] args) {
        HotelRoom hotelRoom301 = new SuiteRoom(301);
        HotelRoom hotelRoom201 = new DeluxeRoom(201);
        HotelRoom hotelRoom101 = new StandardRoom(101);
        ConferenceHall conferenceHall = new ConferenceHall("Function Room A");

        System.out.println("Hotel Rooms:");
        hotelRoom301.bookRoom(); 
        hotelRoom301.cleanRoom(); 
        hotelRoom301.reviewRoom(); 
        System.out.println();
        hotelRoom201.bookRoom(); 
        hotelRoom201.cleanRoom(); 
        hotelRoom201.reviewRoom();
        System.out.println();
        hotelRoom101.bookRoom(); 
        hotelRoom101.cleanRoom(); 
        hotelRoom101.reviewRoom(); 


        System.out.println("\nConference Hall:");
        conferenceHall.bookRoom(); 
        conferenceHall.cleanRoom(); 
        conferenceHall.reviewRoom();
    }
}