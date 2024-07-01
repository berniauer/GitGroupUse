package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue{

    private List<Drink> elements = new ArrayList<>();
    private int maxSize;


    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    public Drink peek() {
        if (elements.isEmpty()) {
            return null;
        } else {
            return elements.get(0);
        }
    }

    public Drink element() {
        Drink element = peek();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        } else {
            return element;
        }
    }
}
