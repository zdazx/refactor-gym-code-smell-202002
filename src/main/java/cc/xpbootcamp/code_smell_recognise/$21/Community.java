package cc.xpbootcamp.code_smell_recognise.$21;

import lombok.Data;

import java.util.List;

@Data
public class Community {
    private String name;
    private List<Building> buildings;
}
