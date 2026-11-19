public abstract class HotelRoom {
    private int roomNumber;
    private RoomType roomType;
    private double pricePerStay;
    private RoomStatus status;

    public HotelRoom(int roomNumber, RoomType roomType,
                     double pricePerStay) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerStay = pricePerStay;
        this.status = RoomStatus.AVAILABLE;
    }
/*
    @Override
    public void bookRoom() {
        if (status == RoomStatus.AVAILABLE) {
            status = RoomStatus.OCCUPIED;
            System.out.println("Room successfully booked!");
        } else {
            System.out.println("Room is not available.");
        }
    }

    @Override
    public void cancelBooking() {
        if (status == RoomStatus.OCCUPIED) {
            status = RoomStatus.AVAILABLE;
            System.out.println("Booking cancelled.");
        } else {
            System.out.println("No active booking to cancel.");
        }
    }

*/
    public abstract void displayFeatures();


    public void displayDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price per Stay: Php " + pricePerStay);
        System.out.println("Status: " + status);
    }
}