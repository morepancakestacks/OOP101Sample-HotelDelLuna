public class Main {
    public static void main(String[] args) {
        HotelRoom standardRoom = new StandardRoom(101);
        SuiteRoom suiteRoom = new SuiteRoom(201);
        HotelRoom deluxeRoom = new DeluxeRoom(301);

        standardRoom.displayFeatures();
        standardRoom.displayDetails();
        System.out.println();
        suiteRoom.displayFeatures();
        suiteRoom.displayDetails();
        System.out.println();
        deluxeRoom.displayFeatures();
    }
}