package at.campus02.bsd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class StringQueueTest {

    @Test
    void testOffer() {
        StringQueue queue = new StringQueue(3);
        assertTrue(queue.offer("first"));
        assertTrue(queue.offer("second"));
        assertTrue(queue.offer("third"));
        assertFalse(queue.offer("fourth"));
    }

    @Test
    void testPoll() {
        StringQueue queue = new StringQueue(3);
        queue.offer("first");
        queue.offer("second");
        assertEquals("first", queue.poll());
        assertEquals("second", queue.poll());
        assertNull(queue.poll());
    }

    @Test
    void testRemove() {
        StringQueue queue = new StringQueue(3);
        queue.offer("first");
        queue.offer("second");
        assertEquals("first", queue.remove());
        assertEquals("second", queue.remove());
        assertThrows(NoSuchElementException.class, queue::remove);
    }

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
