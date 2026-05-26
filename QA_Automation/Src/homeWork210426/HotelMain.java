package homeWork210426;

public class HotelMain {
        public static void main(String[] args) {

            Room[] rooms = {
                    new Room(101, false),
                    new Room(102, false),
                    new Room(103, true)
            };

            BookingService service = new BookingService(rooms);

            Guest g = new Guest(20);
            Room requestedRoom = rooms[0];

            try {
                service.bookRoom(g, requestedRoom);
            } catch (UnderAgeException e) {
                System.out.println("ERROR: " + e.getMessage());
            } catch (RoomUnavailableException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }

class RoomUnavailableException extends Exception {
    public RoomUnavailableException(String message) {
        super(message);
    }
}

class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}
class Guest {
    int age;

    public Guest(int age) {
        this.age = age;
    }
}

class Room {
    int number;
    boolean isAvailable;

    public Room(int number, boolean isAvailable) {
        this.number = number;
        this.isAvailable = isAvailable;
    }
}
class BookingService {

    Room[] rooms;

    public BookingService(Room[] rooms) {
        this.rooms = rooms;
    }

    public void bookRoom(Guest g, Room r)
            throws UnderAgeException, RoomUnavailableException {

        if (g.age < 18) {
            throw new UnderAgeException("Guest is under 18");
        }

        if (r.isAvailable) {
            r.isAvailable = false;
            System.out.println("Room booked: " + r.number);
            return;
        }

        for (Room room : rooms) {
            if (room.isAvailable) {
                room.isAvailable = false;
                System.out.println("Requested room unavailable.");
                System.out.println("Alternative room booked: " + room.number);
                return;
            }
        }

        throw new RoomUnavailableException("No rooms available");
    }
}
