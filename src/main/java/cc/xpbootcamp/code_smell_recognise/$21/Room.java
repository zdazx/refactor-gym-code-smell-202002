package cc.xpbootcamp.code_smell_recognise.$21;

import lombok.Data;

import java.util.List;

@Data
public class Room {
    private String roomNo;
    private float square;
    private List<Person> persons;
}
