package hesap;

/**
 * Entry is an item that can either be a number, string or a symbol.
 *
 * @author Eren
 *
 */
public class Entry {  // Three possible entries are declared.

  private Float number = null;
  private String str = null;
  private Symbol other = null;

  public Entry(Symbol oy) {
    other = oy;
  }

  public Entry(String os) {
    str = os;
  }

  public Entry(Float of) {
    number = of;
  }

  /**
   * Get the number if the entry is constructed with a number.
   *
   * @return the number
   *
   */
  public Float getNumber() throws Exception { 
    if (number == null) {
      throw new Exception();
    }

    return number;
  }

  /**
   * Get the string if the entry is constructed with a string.
   *
   * @return the string
   *
   */
  public String getStr() throws Exception {
    if (str == null) {
      throw new Exception();

    }
    return str;
  }

  /**
   * Get the symbol if the entry is constructed with a symbol.
   *
   * @return the symbol
   *
   */
  public Symbol getOther() throws Exception {
    if (other == null) {
      throw new Exception();
    }
    return other;
  }

  /**
   * Check if the passed-in entry is equal to this one.
   *
   * @return if the entry is equal to "this" entry
   *
   */
  public boolean equals(Entry e) {
    // We use try catch in case the type of e is not equal to type of "this".
    // In that case, we return false because they cannot be equal.
    try {
      if (number != null) {
        return Float.compare(this.getNumber(), e.getNumber()) == 0;
      } else if (str != null) {
        return this.getStr() == e.getStr();
      } else if (other != null) {
        return this.getOther() == e.getOther();
      }
      return false;
    } catch (Exception ignore) {
      return false;
    }

  }

}
