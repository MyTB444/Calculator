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
  
  /**
   * Gets a symbol from character.
   *
   * @param c
   *
   */
  
  public static Symbol getSymbol(Character c) {
    switch (c) {
      case '+':
        return Symbol.PLUS;
      case '-':
        return Symbol.MINUS;
      case '*':
        return Symbol.TIMES;
      case '{':
        return Symbol.LEFT_BRACKET;
      case '}':
        return Symbol.RIGHT_BRACKET;
      case '/':
        return Symbol.DIVIDE;
      default:
        return Symbol.INVALID;
    }
  }
}
