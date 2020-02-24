package cc.xpbootcamp.code_smell_recognise.$09.model;

import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class Room {
    private RoomType roomType;
    private String roomNo;
    private int adultLimit;
    private int childLimit;
    private Map<Date, Boolean> bookingStatus;
}
