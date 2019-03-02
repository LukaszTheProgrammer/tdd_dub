package pl.sda.czwa;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TeamTest {

    @Test
    public void shouldTestThatAddedNamesArePresent(){
        Team team = new Team();
        team.addTeamMember("Jim");
        team.addTeamMember("John");
        team.addTeamMember("Bill");

        assertThat(team.getTeamMembers()).contains("Jim")
            .contains("John")
            .contains("Bill");
    }
}
