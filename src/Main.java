public class Main {
    public static void main(String[] args) {
        HotelRoom standardRoom = new StandardRoom(101);
        HotelRoom deluxeRoom = new DeluxeRoom(201);
        HotelRoom suiteRoom = new SuiteRoom(301);

        standardRoom.displayFeatures();
        System.out.println();
        deluxeRoom.displayFeatures();
        System.out.println();
        suiteRoom.displayFeatures();

    }
}