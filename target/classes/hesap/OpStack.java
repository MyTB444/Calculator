package hesap;

import java.util.EmptyStackException;

/**
 * OpStack is a list of symbols with a first-in last-out principle.
 *
 * @author Eren
 *
 */

public class OpStack {

  Stack opStack;

  /**
   * Constructor for opStack.
   */

  public OpStack() {
    if (opStack == null) {
      opStack = new Stack();
    }
  }

  /**
   * Pop the top element of the stack as type of Symbol.
   *
   * @return the symbol
   *
   */

  public Symbol pop() {
    Entry poppedEntry = opStack.pop();
    Symbol other = null;
    try {
      other = poppedEntry.getOther();
    } catch (Exception e) {
      throw new EmptyStackException();
    }
    return other;
  }

  /**
   * Push an element into the OpStack.
   *
   *
   */

  public void push(Symbol other) {
    opStack.push(new Entry(other));
  }

}
