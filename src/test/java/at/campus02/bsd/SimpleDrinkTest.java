package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Test class for the SimpleDrink class.
 */
public class SimpleDrinkTest {

    /**
     * Tests the getVolume method.
     * Verifies that the volume of the drink is returned correctly.
     */
    @Test
    public void testGetVolume() {
        Liquid water = new Liquid("Water", 1.0, 0.0);
        SimpleDrink drink = new SimpleDrink("Water", water);
        assertEquals(1.0, drink.getVolume());
    }

    /**
     * Tests the getAlcoholPercent method.
     * Verifies that the alcohol percentage of the drink is returned correctly.
     */
    @Test
    public void testGetAlcoholPercent() {
        Liquid juice = new Liquid("Juice", 1.0, 0.0);
        SimpleDrink drink = new SimpleDrink("Juice", juice);
        assertEquals(0.0, drink.getAlcoholPercent());

        Liquid wine = new Liquid("Wine", 0.75, 12.0);
        SimpleDrink drink2 = new SimpleDrink("Wine", wine);
        assertEquals(12.0, drink2.getAlcoholPercent());
    }
    /**
     * Tests the isAlcoholic method.
     * Verifies that the drink is correctly identified as alcoholic or non-alcoholic.
     */
    @Test
    public void testIsAlcoholic() {
        Liquid juice = new Liquid("Juice", 1.0, 0.0);
        SimpleDrink drink = new SimpleDrink("Juice", juice);
        assertFalse(drink.isAlcoholic());

        Liquid wine = new Liquid("Wine", 0.75, 12.0);
        SimpleDrink drink2 = new SimpleDrink("Wine", wine);
        assertTrue(drink2.isAlcoholic());
    }
    /**
     * Tests the getName method.
     * Verifies that the name of the drink is returned correctly.
     */
    @Test
    public void testGetName() {
        Liquid water = new Liquid("Water", 1.0, 0.0);
        SimpleDrink drink = new SimpleDrink("Water", water);
        assertEquals("Water", drink.getName());
    }
    /**
     * Tests the setName method.
     * Verifies that the name of the drink is set correctly.
     */
    @Test
    public void testSetName() {
        Liquid water = new Liquid("Water", 1.0, 0.0);
        SimpleDrink drink = new SimpleDrink("Water", water);
        drink.setName("Sparkling Water");
        assertEquals("Sparkling Water", drink.getName());
    }
}
