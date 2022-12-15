package hesap;

import java.util.EmptyStackException;

/**
 * StrStack is a list of strings with a first-in last-out principle.
 *
 * @author Eren
 *
 */
public class StrStack {

  Stack strStack;

  /**
   * Constructor for strStack.
   */
  public StrStack() {
    if (strStack == null) {
      strStack = new Stack();
    }
  }

  /**
   * Pop the top element of the stack as type of String.
   *
   * @return the symbol
   *
   */

  public String pop() {
    Entry poppedEntry = strStack.pop();
    String str = null;
    try {
      str = poppedEntry.getStr();
    } catch (Exception e) {
      throw new EmptyStackException();
    }
    return str;
  }

  public void push(String str) {
    strStack.push(new Entry(str));
  }
}
