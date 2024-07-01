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
        queue = new DrinkQueue();
        water = new Liquid("Water", 1.0, 0.0);
        drink1 = new SimpleDrink("Water", water);
        drink2 = new SimpleDrink("Juice", water);
    }

    @Test
    public void testOffer() {

        assertTrue(queue.offer(drink1));
        assertEquals(drink1, queue.peek());

        assertTrue(queue.offer(drink2));
        assertEquals(drink1, queue.peek());
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