package cc.xpbootcamp.code_smell_recognise.$09.model;

import lombok.Data;

import java.util.List;

@Data
public class Hotel {
    private String name;
    private List<Room> rooms;
}
