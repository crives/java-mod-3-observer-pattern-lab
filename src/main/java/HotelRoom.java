import java.util.ArrayList;
import java.util.List;

class HotelRoom implements HotelRoomInterface {
    private int roomNum;

    private String guestName;
    private List<RoomCheckinObserver> checkinObservers = new ArrayList<RoomCheckinObserver>();

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getGuestName() {
        return guestName;
    }

    public void checkIn(String guestName) {
        this.guestName = guestName;
        Logger.getInstance().log(guestName + "checked in");
    }

    public void addCheckinObserver(RoomCheckinObserver checkinObserver) {
        checkinObservers.add(checkinObserver);
    }

    public void removeCheckinObserver(RoomCheckinObserver checkinObserver) {
        checkinObservers.remove(checkinObserver);
    }
    public void book(String guestName) {
        Logger.getInstance().log("Booked a room for " + guestName);
    }
    public void clean() {
        Logger.getInstance().log("Cleaned room");
    }
}
