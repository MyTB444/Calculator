package hesap;

public class Main {

  public static void main(String[] args) {
    CalcModel calc = new CalcModel();
    
    try {
      float result = calc.evaluate("5 8 * 6 +", true);
      System.out.println(result);
    } catch (Exception e) {
      System.out.println(e);
    }

  }

}
