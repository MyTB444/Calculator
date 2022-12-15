package hesap;

/**
 * This method will be used after revpolish is made.
 *
 * @author Eren
 *
 */
public class CalcModel {

  private StandardCalc standartCalculator;


  public CalcModel() {
    standartCalculator = new StandardCalc();
  }

  /**
   *This method will be used after revpolish is made.
   *
   */
  public float evaluate(String expression, boolean infix) throws Exception {
    float result = 0;
    if (infix) {
      result = standartCalculator.evaluate(expression);
    }

    return result;
  }

}
