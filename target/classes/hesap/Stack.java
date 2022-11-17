package hesap;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Stack is a list of entries with a first-in last-out principle.
 *
 * @author Eren
 *
 */

public class Stack {

  private int size = 0; // Initial is set to 0.

  private List<Entry> entries = new ArrayList<Entry>();

  /**
   * Calculate the current number of elements in the stack.
   *
   * @return the number of elements in the stack
   */

  public int size() { 
    return size;
  }

  /**
   * Add a new value to the top of the stack.
   *
   * @param e the value to put of the stack
   * 
   */
  public void push(Entry e) { // Increase the size by 1 when a new entry is added.
    entries.add(e);
    size += 1;
  }

  /**
   * Removes the value from the top of the stack.
   *
   * @return the popped entry
   */
  public Entry pop() {   // Pop the top element.
    if (size == 0) {
      throw new EmptyStackException(); // Exception is when the size is 0.
    }
    size = size - 1;
    return entries.remove(size);
  }

  /**
   * Returns the top entry.
   *
   * @return the top entry
   */
  public Entry top() {      // Return the top element.
    if (size == 0) {
      throw new EmptyStackException(); // Exception is when the size is 0.
    }
    return entries.get(size - 1);
  }
}
