package test;

import main.domain.Player;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    void 플레이어_이름이_작성된다() throws Exception {
        String expectedName = "Suntory";
        Player player = new Player(expectedName);

        Field field = player.getClass().getDeclaredField("name");
        field.setAccessible(true);

        assertEquals((String) field.get(player), expectedName);
    }
}
