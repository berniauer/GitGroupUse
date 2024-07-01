package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the DrinkQueue class.
 */
public class DrinkQueueTest {

    private DrinkQueue queue;
    private Liquid water;
    private SimpleDrink drink1;
    private SimpleDrink drink2;

    /**
     * Sets up the test environment before each test.
     * Initializes the DrinkQueue, Liquid, and SimpleDrink objects.
     */
    @BeforeEach
    public void setUp() {
        queue = new DrinkQueue();
        water = new Liquid("Water", 1.0, 0.0);
        drink1 = new SimpleDrink("Water", water);
        drink2 = new SimpleDrink("Juice", water);
    }

    /**
     * Tests the offer method.
     * Verifies that drinks are added to the queue correctly.
     */
    @Test
    public void testOffer() {
        assertTrue(queue.offer(drink1));
        assertEquals(drink1, queue.peek());

        assertTrue(queue.offer(drink2));
        assertEquals(drink1, queue.peek());
    }

    /**
     * Tests the poll method.
     * Verifies that the head of the queue is retrieved and removed correctly.
     */
    @Test
    public void testPoll() {
        queue.offer(drink1);
        queue.offer(drink2);

        assertEquals(drink1, queue.poll());
        assertEquals(drink2, queue.poll());
        assertNull(queue.poll());
    }

    /**
     * Tests the remove method.
     * Verifies that the head of the queue is retrieved and removed correctly,
     * and that an exception is thrown when the queue is empty.
     */
    @Test
    public void testRemove() {
        queue.offer(drink1);
        queue.offer(drink2);

        assertEquals(drink1, queue.remove());
        assertEquals(drink2, queue.remove());
        assertThrows(NoSuchElementException.class, queue::remove);
    }

    /**
     * Tests the peek method.
     * Verifies that the head of the queue is retrieved without removing it,
     * and that null is returned when the queue is empty.
     */
    @Test
    public void testPeek() {
        queue.offer(drink1);
        queue.offer(drink2);

        assertEquals(drink1, queue.peek());
        queue.poll();
        assertEquals(drink2, queue.peek());
        queue.poll();
        assertNull(queue.peek());
    }

    /**
     * Tests the element method.
     * Verifies that the head of the queue is retrieved without removing it,
     * and that an exception is thrown when the queue is empty.
     */
    @Test
    public void testElement() {
        queue.offer(drink1);
        queue.offer(drink2);

        assertEquals(drink1, queue.element());
        queue.poll();
        assertEquals(drink2, queue.element());
        queue.poll();
        assertThrows(NoSuchElementException.class, queue::element);
    }
}
