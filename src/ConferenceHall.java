public class ConferenceHall implements Bookable, Maintainable {
    private String hallName;
    private boolean isBooked;

    public ConferenceHall(String hallName) {
        this.hallName = hallName;
        this.isBooked = false;
    }

// from Bookable Interface
    @Override
    public void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println(hallName + " successfully booked!");
        } else {
            System.out.println(hallName + " is already booked.");
        }
    }

    @Override
    public void cancelBooking() {
        if (isBooked) {
            isBooked = false;
            System.out.println(hallName + " booking cancelled.");
        } else {
            System.out.println("No active booking.");
        }
    }

    @Override
    public void cleanRoom() {
        System.out.println("Cleaning the conference hall...");
    }
}