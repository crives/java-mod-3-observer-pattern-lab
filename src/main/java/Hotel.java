import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private int currentFloor = 1;
    // create hotel email and notification services
    HotelPushNotificationService notificationService = new HotelPushNotificationService();
    HotelEmailService emailService = new HotelEmailService();

    private List<HotelFloor> hotelFloors = new ArrayList<HotelFloor>();

    public void addFloor(HotelFloor hotelFloor) {
        hotelFloors.add(hotelFloor);
        Logger.getInstance().log("Added hotel floor:" + hotelFloor);
    }

    public void addRoomToEachFloor(HotelRoom hotelRoom) {
        hotelFloors.forEach((hotelFloor) -> hotelFloor.addHotelRoom(hotelRoom));
    }

    public void addFloorNumToEachFloor() {
        hotelFloors.forEach((hotelFloor) -> hotelFloor.setFloorNum(currentFloor++));
    }

    public void numberRoomsOnEachFloor() {
        hotelFloors.forEach((hotelFloor) -> hotelFloor.addRoomNumToEachRoom(hotelFloor.getFloorNum()));
    }

    // initialize hotel email and notification services
    public void createEmailNotificationServices() {
        hotelFloors.forEach((hotelFloor) -> {
            hotelFloor.addEmailNotificationService(emailService, notificationService);
        });
    }

}
