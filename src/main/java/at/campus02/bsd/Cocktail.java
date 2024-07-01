package at.campus02.bsd;

import java.util.List;

/**
 * The {@code Cocktail} class represents a cocktail drink composed of various liquids.
 * It extends the {@code Drink} class, inheriting its basic properties and adding a list
 * of {@code Liquid} objects to represent the ingredients of the cocktail.
 */
public class Cocktail extends Drink{

    /**
     * The list of {@code Liquid} objects representing the ingredients of the cocktail.
     */
    private List<Liquid> liquids;

    /**
     * Constructs a new {@code Cocktail} object with the specified name and list of liquids.
     *
     * @param name    the name of the cocktail
     * @param liquids a list of {@code Liquid} objects that are the ingredients of the cocktail
     */
    public Cocktail(String name, List<Liquid> liquids) {
        super(name);
        this.liquids = liquids;
    }


    /**
     * Calculates and returns the total volume of the cocktail based on the volume of each liquid ingredient.
     *
     * @return the total volume of all liquids in the cocktail in liters
     */
    @Override
    public double getVolume() {
        double totalVolume = 0;
        for (Liquid liquid : liquids) {
            totalVolume += liquid.getVolume();
        }
        return totalVolume;
    }

    /**
     * Calculates and returns the overall alcohol percentage of the cocktail.
     * This is computed based on the alcohol percentage and volume of each liquid ingredient.
     *
     * @return the alcohol percentage of the cocktail
     */
    @Override
    public double getAlcoholPercent() {
        double totalAlcoholVolume = 0;
        for (Liquid liquid : liquids) {
            totalAlcoholVolume += liquid.getVolume() * liquid.getAlcoholPercent() / 100;
        }
        return totalAlcoholVolume / getVolume() * 100;
    }

    /**
     * Determines whether the cocktail is alcoholic.
     * A cocktail is considered alcoholic if its overall alcohol percentage is greater than zero.
     *
     * @return {@code true} if the cocktail has an alcohol percentage greater than 0, otherwise {@code false}
     */
    @Override
    public boolean isAlcoholic() {
        return getAlcoholPercent() > 0;
    }
}
