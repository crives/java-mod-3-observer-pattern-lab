import java.util.ArrayList;
import java.util.List;

public class HotelFactory {
    public static HotelRoom makeHotelRoom() {
        return new HotelRoom();
    }
    public static HotelFloor makeHotelFloor() {
        return new HotelFloor();
    }
}
