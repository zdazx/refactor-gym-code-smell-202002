package cc.xpbootcamp.code_smell_recognise.$21;

import lombok.Data;

import java.util.List;

@Data
public class Building {
    private String buildingNo;
    private Person buildingManager;
    private List<Room> rooms;
}
