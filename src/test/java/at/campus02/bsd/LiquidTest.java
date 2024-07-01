package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LiquidTest {

    @Test
    public void testGetName() {
        Liquid water = new Liquid("Water", 1.0, 0.0);
        assertEquals("Water", water.getName());
    }

    @Test
    public void testSetName() {
        Liquid water = new Liquid("Water", 1.0, 0.0);
        water.setName("Juice");
        assertEquals("Juice", water.getName());
    }

    @Test
    public void testGetVolume() {
        Liquid water = new Liquid("Water", 1.0, 0.0);
        assertEquals(1.0, water.getVolume());
    }

    @Test
    public void testSetVolume() {
        Liquid water = new Liquid("Water", 1.0, 0.0);
        water.setVolume(1.5);
        assertEquals(1.5, water.getVolume());
    }

    @Test
    public void testGetAlcoholPercent() {
        Liquid juice = new Liquid("Juice", 1.0, 0.0);
        assertEquals(0.0, juice.getAlcoholPercent());

        Liquid wine = new Liquid("Wine", 0.75, 12.0);
        assertEquals(12.0, wine.getAlcoholPercent());
    }

    @Test
    public void testSetAlcoholPercent() {
        Liquid wine = new Liquid("Wine", 0.75, 12.0);
        wine.setAlcoholPercent(14.0);
        assertEquals(14.0, wine.getAlcoholPercent());
    }
}
