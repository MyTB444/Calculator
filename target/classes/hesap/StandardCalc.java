package hesap;

/**
 * Mathematical Expression Evaluator using two Stacks Version: 1.1
 */

import java.util.*;

class StandardCalc implements Calculator {
  static List<Symbol> precedence;
  private NumStack values;

  public StandardCalc() {
    values = new NumStack();
    precedence = new ArrayList<Symbol>();
    precedence.add(Symbol.PLUS);
    precedence.add(Symbol.MINUS);
    precedence.add(Symbol.TIMES);
    precedence.add(Symbol.DIVIDE);
  }

  /**
   * Check if op2 has higher precedence than op1
   */
  private static boolean hasPrecedence(Symbol op1, Symbol op2) {
    return precedence.indexOf(op2) >= precedence.indexOf(op1);
  }

  private static float getValue(float val1, float val2, Symbol op) throws Exception {
    float result = 0;

    switch (op.toString()) {
      case "+":
        result = val1 + val2;
        break;
      case "-":
        result = val2 - val1;
        break;
      case "*":
        result = val1 * val2;
        break;
      case "/":
        if (val1 == 0) {
          throw new Exception("divide by zero");
        }
        result = val2 / val1;
    }

    return result;
  }

  @Override
  public float evaluate(String expression) throws Exception {
    OpStack opStack = new OpStack();

    char[] tokens = expression.toCharArray();

    for (Character c : tokens) {
      if (c == ' ')
        continue;

      if (c >= '0' && c <= '9') { // digit
        values.push(Float.parseFloat(c.toString()));
      } else { // operator
        Symbol s = Symbol.getSymbol(c);
        
        while (opStack.opStack.size() != 0 && hasPrecedence(s, opStack.opStack.top().getOther())) {
          try {
            values.push(getValue(values.pop(), values.pop(), opStack.pop()));
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
        
        opStack.push(s);
      }

    }

    while (opStack.opStack.size() != 0) {
      try {
        values.push(getValue(values.pop(), values.pop(), opStack.pop()));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    // Last value in valueStack is final answer
    if (values.numStack.size() != 0)
      return values.pop();
    return 0;
  }
}
