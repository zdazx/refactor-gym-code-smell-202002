package cc.xpbootcamp.code_smell_recognise.$21;

import java.util.List;

public class DiseaseControlCenter {
    private List<Community> communities;

    public boolean hasPatient() {
        return communities.stream()
                .flatMap(community -> community.getBuildings().stream())
                .flatMap(building -> building.getRooms().stream())
                .flatMap(room -> room.getPersons().stream())
                .anyMatch(Person::isInfected);
    }
}
