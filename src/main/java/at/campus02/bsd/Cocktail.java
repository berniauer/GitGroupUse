package at.campus02.bsd;

import java.util.List;

public class Cocktail extends Drink{
    private List<Liquid> liquids;

    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     */
    public Cocktail(String name, List<Liquid> liquids) {
        super(name);
        this.liquids = liquids;
    }

    @Override
    public double getVolume() {
        double totalVolume = 0;
        for (Liquid liquid : liquids) {
            totalVolume += liquid.getVolume();
        }
        return totalVolume;
    }

    @Override
    public double getAlcoholPercent() {
        double totalAlcoholVolume = 0;
        for (Liquid liquid : liquids) {
            totalAlcoholVolume += liquid.getVolume() * liquid.getAlcoholPercent() / 100;
        }
        return totalAlcoholVolume / getVolume() * 100;
    }

    @Override
    public boolean isAlcoholic() {
        return getAlcoholPercent() > 0;
    }
}
