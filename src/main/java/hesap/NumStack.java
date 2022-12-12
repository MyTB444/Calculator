package hesap;

import java.util.EmptyStackException;

public class NumStack {

  Stack numStack;
  float number = 0;



  public NumStack() {
    if (numStack == null) {
      numStack = new Stack();
    }
  }

  /**
   * Pop the top element of the stack as type of number.
   *
   * @return the number
   *
   */

  public float pop() {
    Entry poppedEntry = numStack.pop();

    try {
      number = poppedEntry.getNumber();
    } catch (Exception e) {
      throw new EmptyStackException();
    }
    return number;
  }

  /**
   * Push an element into the NumStack.
   *
   *
   */

  public void push(float number) {
    numStack.push(new Entry(number));
  }

}
