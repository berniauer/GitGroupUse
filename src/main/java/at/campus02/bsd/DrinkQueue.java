package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * The DrinkQueue class represents a queue of drinks.
 * It provides methods to add, retrieve, and inspect elements in the queue.
 */
public class DrinkQueue {

    /**
     * The list of drink elements in the queue.
     */
    private List<Drink> elements = new ArrayList<>();

    /**
     * Constructs a new DrinkQueue object with default settings.
     */
    public DrinkQueue() {
        // Default constructor
    }

    /**
     * Retrieves, but does not remove, the head of the queue, or returns null if the queue is empty.
     *
     * @return the head of the queue, or null if the queue is empty
     */
    public Drink peek() {
        if (elements.isEmpty()) {
            return null;
        } else {
            return elements.get(0);
        }
    }

    /**
     * Retrieves, but does not remove, the head of the queue.
     *
     * @return the head of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Drink element() {
        Drink element = peek();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        } else {
            return element;
        }
    }

    /**
     * Adds a drink to the queue.
     *
     * @param obj the drink to add
     * @return true if the drink was added successfully
     */
    public boolean offer(Drink obj) {
        elements.add(obj);
        return true;
    }

    /**
     * Retrieves and removes the head of the queue, or returns null if the queue is empty.
     *
     * @return the head of the queue, or null if the queue is empty
     */
    public Drink poll() {
        if (elements.isEmpty()) {
            return null;
        } else {
            return elements.remove(0);
        }
    }

    /**
     * Retrieves and removes the head of the queue.
     *
     * @return the head of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Drink remove() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("there's no element any more");
        } else {
            return elements.remove(0);
        }
    }

}
