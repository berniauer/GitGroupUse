package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * A queue implementation that holds strings.
 * This class encapsulates methods to manipulate queue operations such as adding, removing, and inspecting elements.
 */
public class StringQueue implements IQueue {

  /**
   * List of elements in the queue.
   */
  private List<String> elements = new ArrayList<String>();
  /**
   * The maximum size of the queue.
   */
  private int maxSize;

  /**
   * Constructs a new StringQueue with a specified maximum size.
   *
   * @param maxSize the maximum number of elements the queue can hold
   */
  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  /**
   * Adds a string to the queue if it has not reached the maximum size.
   *
   * @param obj the string element to be added
   * @return true if the element was successfully added, false if the queue is full
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() < maxSize) {
      elements.add(obj);
      return true;
    } else {
      return false;
    }
  }

  /**
   * Retrieves and removes the head of the queue, or returns null if this queue is empty.
   *
   * @return the head of the queue, or null if the queue is empty
   */
  @Override
  public String poll() {
    if (elements.isEmpty()) {
      return null;
    } else {
      return elements.remove(0);
    }
  }

  /**
   * Retrieves and removes the head of this queue. This method differs from {@link #poll poll} in that it throws an exception if this queue is empty.
   *
   * @return the head of the queue
   * @throws NoSuchElementException if the queue is empty
   */
  @Override
  public String remove() {
    if (elements.isEmpty()) {
      throw new NoSuchElementException("there's no element any more");
    } else {
      return elements.remove(0);
    }
  }

  /**
   * Retrieves, but does not remove, the head of the queue, or returns null if this queue is empty.
   *
   * @return the head of the queue, or null if the queue is empty
   */
  @Override
  public String peek() {
    if (elements.isEmpty()) {
      return null;
    } else {
      return elements.get(0);
    }
  }

  /**
   * Retrieves, but does not remove, the head of this queue. This method differs from {@link #peek peek} in that it throws an exception if this queue is empty.
   *
   * @return the head of the queue
   * @throws NoSuchElementException if the queue is empty
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null) {
      throw new NoSuchElementException("there's no element any more");
    } else {
      return element;
    }
  }

}
