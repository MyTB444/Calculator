package hesap;

public class CalcModel {

  private StandartCalc standartCalculator;
  private RevPolishCalc revPolishCalculator;

  public CalcModel() {
    standartCalculator = new StandartCalc();
    revPolishCalculator = new RevPolishCalc();
  }

  public float evaluate(String expression, boolean infix) throws Exception {
    float result = 0;
    if (infix) {
      result = standartCalculator.evaluate(expression);
    } else {
      result = revPolishCalculator.evaluate(expression);
    }

    return result;
  }

}
