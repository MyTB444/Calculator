package hesap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestStack {
  private Stack rs;

  @BeforeEach
  public void setup() {
    rs = new Stack();
  }

  @Test
  void testSize() { //Test1: Tests if the initial size is 0.
    Stack rs = new Stack();
    assertEquals(rs.size(), 0);
  }
  
  @Test
  void testPush() { //Test2: Tests if the correct new size is returned after an entry is pushed.
    Entry e = new Entry(5.0f);
    rs.push(e);
    assertEquals(rs.size(), 1);
  }

  @Test
  void testEmptyPop() { //Test3: Tests if the size becomes zero after an entry is popped.
    assertThrows(EmptyStackException.class, () -> rs.pop());
  }

  @Test
  void pushThenPop() throws Exception { //Test4: Tests if we can push and then pop.
    Entry e = new Entry(5.0f);          
    rs.push(e);
    assertEquals(rs.pop().getNumber(), e.getNumber());
    assertEquals(rs.size(), 0);
    assertThrows(EmptyStackException.class, () -> rs.pop());
  }

  @Test
  void pushTwice() throws Exception { //Test5: Tests if we can push 2 entries.
    Entry e = new Entry(5.0f);
    Entry e2 = new Entry("Eren");
    rs.push(e);
    rs.push(e2);
    assertEquals(rs.size(), 2);
    assertEquals(rs.pop().getStr(), e2.getStr());
    assertEquals(rs.pop().getNumber(), e.getNumber());
    assertEquals(rs.size(), 0);
    assertThrows(EmptyStackException.class, () -> rs.pop());
  }

  @Test
  void pushLots() { //Test6: Tests if we can push a lot of entries.
    for (int index = 0; index < 1000; index++) {
      Entry e = new Entry((float) index);
      rs.push(e);
      assertEquals(rs.size(), index + 1);
    }
  }
}
