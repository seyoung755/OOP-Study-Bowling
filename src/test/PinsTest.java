package test;

import main.domain.Pins;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PinsTest {

    @Test
    public void 볼링핀이_쓰러진다() throws Exception {
        Pins pins = new Pins();
        int hitPinCount = 5;
        
        Method method = Pins.class.getDeclaredMethod("hitBowlingPin", int.class);
        method.setAccessible(true);
        method.invoke(pins, hitPinCount);

        Field field = Pins.class.getDeclaredField("bowlingPins");
        field.setAccessible(true);

        int resultPin = (int) field.get(pins);
        assertEquals(resultPin, 10 - hitPinCount);
    }
}
