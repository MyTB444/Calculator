package hesap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.Test;

class TestStackClasses {

  @Test // Test1: Testing for NumStack class Push method to see if we can push.
  public void testNumStackPush() throws Exception {
    NumStack numStack = new NumStack();
    numStack.push(3f);
    assertEquals(numStack.pop(), 3.0f, 0.1f);
  }

  @Test // Test2: Testing for EmptyStackException throw if the NumStack is empty.
  public void testNumStackEmptyPop() {
    NumStack numStack = new NumStack();
    assertThrows(EmptyStackException.class, () -> numStack.pop());
  }

  @Test // Test3: Testing for OpStack class Push method to see if we can push.
  public void testOpStackPush() throws Exception {
    OpStack opStack = new OpStack();
    opStack.push(Symbol.PLUS);
    assertEquals(opStack.pop(), Symbol.PLUS);
  }

  @Test // Test4: Testing for EmptyStackException throw if the OpStack is empty.
  public void testOpStackEmptyPop() {
    OpStack opStack = new OpStack();
    assertThrows(EmptyStackException.class, () -> opStack.pop());
  }

  @Test // Test5: Testing for StrStack class Push method to see if we can push.
  public void testStrStackPush() throws Exception {
    StrStack strStack = new StrStack();
    strStack.push("testing");
    assertEquals(strStack.pop(), "testing");
  }

  @Test // Test6: Testing for EmptyStackException throw if the StrStack is empty.
  public void testStrStackEmptyPop() {
    StrStack strStack = new StrStack();
    assertThrows(EmptyStackException.class, () -> strStack.pop());
  }

  @Test // Test 7: Testing for multiple push and pop
  public void testMultipleNumPushAndPop() {
    NumStack numStack = new NumStack();
    for (int i = 1; i < 100; i++) {
      numStack.push(i);
    }
    assertEquals(numStack.pop(), 99, 0.1f);
    assertEquals(numStack.pop(), 98, 0.1f);
  }

}
