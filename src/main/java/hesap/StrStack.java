package hesap;

import java.util.EmptyStackException;

public class StrStack {

  Stack strStack;

  public StrStack() {
    if (strStack == null) {
      strStack = new Stack();
    }
  }

  /**
   * Pop the top element of the stack as type of String
   *
   * @return the symbol
   *
   */

  public String Pop() {
    Entry poppedEntry = strStack.pop();
    String str = null;
    try {
      str = poppedEntry.getStr();
    } catch (Exception e) {
      throw new EmptyStackException();
    }
    return str;
  }

  public void Push(String str) {
    strStack.push(new Entry(str));
  }
}
