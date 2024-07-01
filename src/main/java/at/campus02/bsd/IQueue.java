package at.campus02.bsd;

/**
 * Interface for a generic queue. This interface defines the basic operations for managing a queue of strings.
 */
public interface IQueue {

  /**
   * Attempts to add the specified element to this queue.
   *
   * @param obj the string element to be added to the queue
   * @return true if the element was successfully added to the queue, otherwise false
   * @implSpec Implementations should return false if the queue cannot add any more elements due to capacity restrictions.
   */
  public abstract boolean offer(String obj);

  /**
   * Retrieves and removes the head of this queue, or returns null if the queue is empty.
   *
   * @return the head of the queue, or null if the queue is empty
   * @implSpec The element returned is removed from the queue.
   */
  public abstract String poll();

  /**
   * Retrieves and removes the head of this queue. This method differs from {@code poll()} in that it throws an exception if the queue is empty.
   *
   * @return the head of the queue
   */
  public abstract String remove();

  /**
   * Retrieves, but does not remove, the head of this queue, or returns null if the queue is empty.
   *
   * @return the head of the queue, or null if the queue is empty
   */
  public abstract String peek();

  /**
   * Retrieves, but does not remove, the head of this queue. This method differs from {@code peek()} in that it throws an exception if the queue is empty.
   *
   * @return the head of the queue
   */
  public abstract String element();
}
