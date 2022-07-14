import java.util.ArrayList;
import java.util.List;

class HotelFloor implements HotelRoomInterface {


    private List<HotelRoom> hotelRooms = new ArrayList<HotelRoom>();

    private int currentRoom = 100;
    private int floorNum;

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }
    public void book(String guestName) {
        hotelRooms.forEach(child -> {
            child.book(guestName);
        });
    }
    public void clean() {
        hotelRooms.forEach(child -> child.clean());
    }

    public void addHotelRoom(HotelRoom hotelRoom) {
        hotelRooms.add(hotelRoom);
        Logger.getInstance().log("Added hotel room:" + hotelRoom);
    }

    public void removeHotelRoom(HotelRoom hotelRoom) {
        hotelRooms.remove(hotelRoom);
        Logger.getInstance().log("Removed hotel room:" + hotelRoom);
    }

    public void addRoomNumToEachRoom(int floorNum) {
        hotelRooms.forEach((hotelRoom) -> hotelRoom.setRoomNum(floorNum * currentRoom++));
    }

    public void addEmailNotificationService(HotelEmailService emailService, HotelPushNotificationService notificationService) {
        hotelRooms.forEach((hotelRoom) -> hotelRoom.addCheckinObserver(emailService));
        hotelRooms.forEach((hotelRoom) -> hotelRoom.addCheckinObserver(notificationService));
    }
}