package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DrinkQueueTest {

    private DrinkQueue queue;
    private Liquid water;
    private SimpleDrink drink1;
    private SimpleDrink drink2;

    @BeforeEach
    public void setUp() {
        queue = new DrinkQueue(2);
        water = new Liquid("Water", 1.0, 0.0);
        drink1 = new SimpleDrink("Water", water);
        drink2 = new SimpleDrink("Juice", water);
    }

    @Test
    public void testOffer() {
        assertTrue(queue.offer(drink1));
        assertEquals(drink1, queue.peek()); // Check if the first drink is the correct one

        assertTrue(queue.offer(drink2));
        assertEquals(drink1, queue.peek()); // The first drink should still be the same

        SimpleDrink drink3 = new SimpleDrink("Wine", water);
        assertFalse(queue.offer(drink3)); // The queue should be full, so offer should return false
    }

    @Test
    public void testPoll() {
        queue.offer(drink1);
        queue.offer(drink2);

        assertEquals(drink1, queue.poll());
        assertEquals(drink2, queue.poll());
        assertNull(queue.poll());
    }

    @Test
    public void testRemove() {
        queue.offer(drink1);
        queue.offer(drink2);

        assertEquals(drink1, queue.remove());
        assertEquals(drink2, queue.remove());
        assertThrows(NoSuchElementException.class, queue::remove);
    }

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