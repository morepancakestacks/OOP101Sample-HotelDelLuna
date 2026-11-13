classDiagram
    class Bookable {
        <<interface>>
        +bookRoom() void
        +cancelBooking() void
    }

    class HotelRoom {
        <<abstract>>
        -int roomNumber
        -RoomType roomType
        -double pricePerStay
        -RoomStatus status
        +HotelRoom(int, RoomType, double)
        +bookRoom() void
        +cancelBooking() void
        +displayFeatures()* void
        +displayDetails() void
    }

    class StandardRoom {
        -boolean hasWorkDesk
        -boolean hasWiFi
        +StandardRoom(int)
        +displayFeatures() void
    }

    class DeluxeRoom {
        -boolean hasBalcony
        -boolean breakfastIncluded
        +DeluxeRoom(int)
        +displayFeatures() void
    }

    class SuiteRoom {
        -double livingRoomArea
        -int numberOfBathrooms
        +SuiteRoom(int)
        +displayFeatures() void
    }

    class ConferenceHall {
        -String hallName
        -boolean isBooked
        +ConferenceHall(String)
        +bookRoom() void
        +cancelBooking() void
    }

    class RoomType {
        <<enumeration>>
        STANDARD
        DELUXE
        SUITE
    }

    class RoomStatus {
        <<enumeration>>
        AVAILABLE
        OCCUPIED
        UNDER_MAINTENANCE
    }

    HotelRoom ..|> Bookable : implements
    ConferenceHall ..|> Bookable : implements

    StandardRoom --|> HotelRoom : extends
    DeluxeRoom --|> HotelRoom : extends
    SuiteRoom --|> HotelRoom : extends

    HotelRoom ..> RoomType : uses
    HotelRoom ..> RoomStatus : uses
