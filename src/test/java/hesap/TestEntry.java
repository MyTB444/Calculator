package hesap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestEntry {

  @Test
  void testNumbers() throws Exception { //Test1: Tests if we can get a number entry value correctly.
    Entry e = new Entry(5.0f);
    assertThrows(Exception.class, () -> e.getStr());
    assertThrows(Exception.class, () -> e.getOther());
    assertEquals(e.getNumber(), 5.0f);
  }

  @Test
  void testStrings() throws Exception { //Test2: Tests if we can get a string entry value correctly.
    Entry e = new Entry("Eren");
    assertThrows(Exception.class, () -> e.getNumber());
    assertThrows(Exception.class, () -> e.getOther());
    assertEquals(e.getStr(), "Eren");
  }

  @Test
  void testSymbol() throws Exception { //Test3: Tests if we can get a symbol entry value correctly.
    Entry e = new Entry(Symbol.DIVIDE);
    assertThrows(Exception.class, () -> e.getStr());
    assertThrows(Exception.class, () -> e.getNumber());
    assertEquals(e.getOther(), Symbol.DIVIDE);
  }

  @Test
  void testEquals() throws Exception { // Test 4: Tests if two separate entries are equal.
    Entry e = new Entry(5.0f);
    Entry e2 = new Entry("Eren");
    Entry e3 = new Entry(5.0f);
    Entry e4 = new Entry(6.0f);

    assertFalse(e.equals(e2));
    assertTrue(e.equals(e3));
    assertFalse(e.equals(e4));
  }
}
