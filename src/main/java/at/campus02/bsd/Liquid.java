package at.campus02.bsd;

/**
 * Represents a liquid that can be used in drinks.
 * This class stores details about the liquid such as its name, volume, and alcohol percentage.
 */
public class Liquid {

    /**
     * The name of the liquid.
     */
    private String name;
    /**
     * The volume of the liquid.
     */
    private double volume;
    /**
     * The alcohol percentage of the liquid.
     */
    private double alcoholPercent;

    /**
     * Constructs a new Liquid object with specified properties.
     *
     * @param name the name of the liquid
     * @param volume the volume of the liquid in liters
     * @param alcoholPercent the alcohol content percentage of the liquid
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Retrieves the name of the liquid.
     *
     * @return the name of the liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the liquid.
     *
     * @param name the new name for the liquid
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the volume of the liquid.
     *
     * @return the volume of the liquid
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the liquid.
     *
     * @param volume the new volume of the liquid
     */

    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Retrieves the alcohol content percentage of the liquid.
     *
     * @return the alcohol percentage of the liquid
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Sets the alcohol content percentage of the liquid.
     *
     * @param alcoholPercent the new alcohol percentage for the liquid
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
