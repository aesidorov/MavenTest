package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class footballTests {

    @Test
    public void teamCount(){
        int teamHome = 18;
        int teamGuest = 13;
        Assertions.assertEquals(31, teamHome + teamGuest);
    }

    @Test
    @Tag("dinamo")
    public void lombokTest(){
        Player player = Player.builder()
                .name("Smolov")
                .age(12)
                .role("Forvard")
                .build();
        System.out.println(player.getName());
    }
}
