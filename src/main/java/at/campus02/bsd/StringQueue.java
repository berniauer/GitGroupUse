package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize;

  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  @Override
  public boolean offer(String obj) {
    if (elements.size() < maxSize) {
      elements.add(obj);
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String poll() {
    if (elements.isEmpty()) {
      return null;
    } else {
      return elements.remove(0);
    }
  }

  @Override
  public String remove() {
    if (elements.isEmpty()) {
      throw new NoSuchElementException("there's no element any more");
    } else {
      return elements.remove(0);
    }
  }

  @Override
  public String peek() {
    if (elements.isEmpty()) {
      return null;
    } else {
      return elements.get(0);
    }
  }

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
