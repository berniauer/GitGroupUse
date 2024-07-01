package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class DrinkQueue{

    private List<Drink> elements = new ArrayList<>();



    public DrinkQueue() {

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
    public boolean offer(Drink obj) {
            elements.add(obj);
            return true;
    }
    public Drink poll() {
        if (elements.isEmpty()) {
            return null;
        } else {
            return elements.remove(0);
        }
    }
    public Drink remove() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("there's no element any more");
        } else {
            return elements.remove(0);
        }
    }

}
