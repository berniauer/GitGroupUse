package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
/**
 * Test class for the StringQueue class.
 */
class StringQueueTest {
    /**
     * Tests the offer method.
     * Verifies that elements are added to the queue correctly and that the queue handles reaching its maximum size.
     */
    @Test
    void testOffer() {
        StringQueue queue = new StringQueue(3);
        assertTrue(queue.offer("first"));
        assertTrue(queue.offer("second"));
        assertTrue(queue.offer("third"));
        assertFalse(queue.offer("fourth"));
    }

    /**
     * Tests the poll method.
     * Verifies that the head of the queue is retrieved and removed correctly.
     */
    @Test
    void testPoll() {
        StringQueue queue = new StringQueue(3);
        queue.offer("first");
        queue.offer("second");
        assertEquals("first", queue.poll());
        assertEquals("second", queue.poll());
        assertNull(queue.poll());
    }

    /**
     * Tests the remove method.
     * Verifies that the head of the queue is retrieved and removed correctly, and that an exception is thrown when the queue is empty.
     */
    @Test
    void testRemove() {
        StringQueue queue = new StringQueue(3);
        queue.offer("first");
        queue.offer("second");
        assertEquals("first", queue.remove());
        assertEquals("second", queue.remove());
        assertThrows(NoSuchElementException.class, queue::remove);
    }
    /**
     * Tests the peek method.
     * Verifies that the head of the queue is retrieved without removing it, and that null is returned when the queue is empty.
     */
    @Test
    void testPeek() {
        StringQueue queue = new StringQueue(3);
        queue.offer("first");
        queue.offer("second");
        assertEquals("first", queue.peek());
        queue.poll();
        assertEquals("second", queue.peek());
        queue.poll();
        assertNull(queue.peek());
    }
    /**
     * Tests the element method.
     * Verifies that the head of the queue is retrieved without removing it, and that an exception is thrown when the queue is empty.
     */
    @Test
    void testElement() {
        StringQueue queue = new StringQueue(3);
        queue.offer("first");
        queue.offer("second");
        assertEquals("first", queue.element());
        queue.poll();
        assertEquals("second", queue.element());
        queue.poll();
        assertThrows(NoSuchElementException.class, queue::element);
    }

}
