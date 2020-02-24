package cc.xpbootcamp.code_smell_recognise.$09;

import cc.xpbootcamp.code_smell_recognise.$09.model.Room;

import java.util.Date;

public class RoomChecker {
    public Boolean isRoomBooked(Room room, Date date) {
        return room.getBookingStatus().get(date);
    }
}
