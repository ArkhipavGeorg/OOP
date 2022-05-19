package N3;


import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private String name;
    HashMap<Integer,Room> rooms = new HashMap<>();
    ArrayList<ReservationInformation> reservationInformations = new ArrayList<>();

    public Hotel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addRoom(final Room room){
        if(rooms.containsKey(room.getRoomNumber())){
            System.out.println("est");
        }
        else {
            rooms.put(room.getRoomNumber(), room);
        }
    }
}
