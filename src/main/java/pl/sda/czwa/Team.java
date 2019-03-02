package pl.sda.czwa;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<String> names = new ArrayList<>();

    public void addTeamMember(String name) {
        names.add(name);
    }

    public List<String> getTeamMembers() {
        return names;
    }
}
