package hesap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStandardCalc {

  private StandardCalc sc;

  @BeforeEach
  public void setup() {
    sc = new StandardCalc();
  }

  @Test
  void testHasPrecedence() throws Exception {
    float a = sc.evaluate("6 * 3");
    assertEquals(a, 18.0);
    float b = sc.evaluate("2 * 8 / 4 + 2 / 2");
    assertEquals(b, 5.0);

  }

}
