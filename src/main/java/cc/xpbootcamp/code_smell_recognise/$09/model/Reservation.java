package cc.xpbootcamp.code_smell_recognise.$09.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Reservation {
    private String id;
    private String customerName;
    private String email;
    private Date from;
    private int bookingDays;
    private Room room;
}
