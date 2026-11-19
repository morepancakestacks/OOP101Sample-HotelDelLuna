public class Main {
    public static void main(String[] args) {
        StandardRoom standardRoom = new StandardRoom(101);
        DeluxeRoom deluxeRoom = new DeluxeRoom(201);
        SuiteRoom suiteRoom = new SuiteRoom(301);

        System.out.println("Standard Room:");
        standardRoom.displayDetails();
        standardRoom.displayFeatures();
        System.out.println("\nDeluxe Room:");
        deluxeRoom.displayDetails();
        deluxeRoom.displayFeatures();
        System.out.println("\nSuite Room:");
        suiteRoom.displayDetails();
        suiteRoom.displayFeatures();
    }
}