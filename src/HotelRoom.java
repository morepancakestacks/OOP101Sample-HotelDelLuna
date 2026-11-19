public class HotelRoom {
    private int roomNumber;
    protected RoomType roomType;
    private double pricePerStay;
    private RoomStatus status;

    public HotelRoom(int roomNumber, RoomType roomType,
                     double pricePerStay) {
        System.out.println("Calling the parent constructor.");
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerStay = pricePerStay;
        this.status = RoomStatus.AVAILABLE;
    }

    public void checkIn() {
        if (status == RoomStatus.AVAILABLE) {
            status = RoomStatus.OCCUPIED;
            System.out.println("Room successfully booked!");
        } else {
            System.out.println("Room is not available.");
        }
    }

    public void checkOut() {
        if (status == RoomStatus.OCCUPIED) {
            status = RoomStatus.AVAILABLE;
            System.out.println("Booking cancelled.");
        } else {
            System.out.println("No active booking to cancel.");
        }
    }

    public void displayDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price per Stay: Php " + pricePerStay);
        System.out.println("Status: " + status);
    }

    public void displayFeatures() {
        System.out.println("Generic feature of a generic HotelRoom");
    }
}