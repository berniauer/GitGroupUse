package at.campus02.bsd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test class for the Cocktail class.
 */
public class CocktailTest {
    /**
     * Tests the getVolume method.
     * Verifies that the total volume of the cocktail is calculated correctly.
     */
    @Test
    void testGetVolume() {
        Liquid liquid1 = new Liquid("Rum", 0.05, 40);
        Liquid liquid2 = new Liquid("Cola", 0.15, 0);
        Cocktail cocktail = new Cocktail("Rum and Cola", Arrays.asList(liquid1, liquid2));
        assertEquals(0.2, cocktail.getVolume(), 0.001);
    }
    /**
     * Tests the getAlcoholPercent method.
     * Verifies that the alcohol percentage of the cocktail is calculated correctly.
     */
    @Test
    void testGetAlcoholPercent() {
        Liquid liquid1 = new Liquid("Rum", 0.05, 40);
        Liquid liquid2 = new Liquid("Cola", 0.15, 0);
        Cocktail cocktail = new Cocktail("Rum and Cola", Arrays.asList(liquid1, liquid2));
        assertEquals(10, cocktail.getAlcoholPercent(), 0.001);
    }
    /**
     * Tests the isAlcoholic method.
     * Verifies that the cocktail is identified as alcoholic or non-alcoholic correctly.
     */
    @Test
    void testIsAlcoholic() {
        Liquid liquid1 = new Liquid("Rum", 0.05, 40);
        Liquid liquid2 = new Liquid("Cola", 0.15, 0);
        Cocktail cocktail = new Cocktail("Rum and Cola", Arrays.asList(liquid1, liquid2));
        assertTrue(cocktail.isAlcoholic());

        Liquid liquid3 = new Liquid("Orange Juice", 0.2, 0);
        Cocktail nonAlcoholicCocktail = new Cocktail("Orange Juice", Arrays.asList(liquid3));
        assertFalse(nonAlcoholicCocktail.isAlcoholic());
    }


}
