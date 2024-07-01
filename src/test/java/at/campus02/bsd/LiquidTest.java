package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Liquid class.
 */
public class LiquidTest {
    /**
     * Tests the getName method.
     * Verifies that the name of the liquid is returned correctly.
     */
    @Test
    public void testGetName() {
        Liquid water = new Liquid("Water", 1.0, 0.0);
        assertEquals("Water", water.getName());
    }
    /**
     * Tests the setName method.
     * Verifies that the name of the liquid is set correctly.
     */
    @Test
    public void testSetName() {
        Liquid water = new Liquid("Water", 1.0, 0.0);
        water.setName("Juice");
        assertEquals("Juice", water.getName());
    }
    /**
     * Tests the getVolume method.
     * Verifies that the volume of the liquid is returned correctly.
     */
    @Test
    public void testGetVolume() {
        Liquid water = new Liquid("Water", 1.0, 0.0);
        assertEquals(1.0, water.getVolume());
    }
    /**
     * Tests the setVolume method.
     * Verifies that the volume of the liquid is set correctly.
     */
    @Test
    public void testSetVolume() {
        Liquid water = new Liquid("Water", 1.0, 0.0);
        water.setVolume(1.5);
        assertEquals(1.5, water.getVolume());
    }
    /**
     * Tests the getAlcoholPercent method.
     * Verifies that the alcohol percentage of the liquid is returned correctly.
     */
    @Test
    public void testGetAlcoholPercent() {
        Liquid juice = new Liquid("Juice", 1.0, 0.0);
        assertEquals(0.0, juice.getAlcoholPercent());

        Liquid wine = new Liquid("Wine", 0.75, 12.0);
        assertEquals(12.0, wine.getAlcoholPercent());
    }
    /**
     * Tests the setAlcoholPercent method.
     * Verifies that the alcohol percentage of the liquid is set correctly.
     */
    @Test
    public void testSetAlcoholPercent() {
        Liquid wine = new Liquid("Wine", 0.75, 12.0);
        wine.setAlcoholPercent(14.0);
        assertEquals(14.0, wine.getAlcoholPercent());
    }
}
