public class SuiteRoom extends HotelRoom {
    public SuiteRoom(int roomNumber) {
        super(roomNumber, RoomType.SUITE, 5000.00);
    }

    @Override
    public void displayFeatures() {
        System.out.println("Suite Room Features:");
        System.out.println("- Living Room Area");
        System.out.println("- Multiple Bathrooms");
    }
    
}