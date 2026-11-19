public class StandardRoom extends HotelRoom {
    public StandardRoom(int roomNumber) {
        super(roomNumber, RoomType.STANDARD, 1500.00);
    }

    @Override
    public void displayFeatures() {
        System.out.println("Standard Room Features:");
        System.out.println("- Work Desk");
        System.out.println("- WiFi Access");
    }
    
}
