import java.util.ArrayList;
import java.util.List;

public class HotelManager {
    /*
    Add 3 floors to the hotel.
    Add 5 rooms to each floor.
    Give each floor a unique sequential number.
    Give each room on each floor a unique sequential number.
    Check 4 different guests in (you can hardcode which room they check into).
    Use the output of your program to demonstrate that the emails and push
    notifications are handled appropriately upon check-in.
     */
    public static void main(String[] args) {
        Logger.getInstance().log("Managing hotel...");
        Hotel hotel = new Hotel();

        // Add 3 floors to the hotel
        HotelFactory hotelFactory = new HotelFactory();
        for(int i = 0; i < 3; i++) {
            HotelFloor hotelFloor = hotelFactory.makeHotelFloor();
            hotel.addFloor(hotelFloor);
        }
        // Add 5 rooms to each floor.
        for(int i = 0; i < 5; i++) {
            HotelRoom hotelRoom = hotelFactory.makeHotelRoom();
            hotel.addRoomToEachFloor(hotelRoom);
        }

        // Give each floor a unique sequential number.
        hotel.addFloorNumToEachFloor();

        //  Give each room on each floor a unique sequential number.
        hotel.numberRoomsOnEachFloor();
        hotel.createEmailNotificationServices();

        //  Check 4 different guests in (you can hardcode which room they check into).

        // Use the output of your program to demonstrate that the emails and push
        // notifications are handled appropriately upon check-in.
    }
}
