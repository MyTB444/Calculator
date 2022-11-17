package hesap;

/**
 * Possible values for a symbol.
 *
 * @author Eren
 *
 */
public enum Symbol {
  LEFT_BRACKET("{"), RIGHT_BRACKET("}"), TIMES("*"), DIVIDE("/"), PLUS("+"), MINUS("-"), INVALID(
      "Invalid"),;
  
  private String string;
  
  Symbol(String name) {
    string = name;
  }
  
  @Override
  public String toString() {
    return string;
  }
  
}
