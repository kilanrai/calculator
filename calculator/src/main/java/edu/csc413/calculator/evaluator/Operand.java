package edu.csc413.calculator.evaluator;
/**
 * Operand class used to represent an operand
 * in a valid mathmetical expression.
 */
public class Operand {
  private int value;

  /**
  * construct operand from string token.
  */  
  public Operand( String token ) {
    value = Integer.parseInt(token);//convert string to integer
  }
  /**
   * construct operand from integer
   */
  public Operand( int value ) {
    this.value = value; //set value
  }
  /**
   * return value of opernad
   */
  public int getValue() {
      return value;
  }
  /**
   * Check to see if given token is a valid
   * operand.
   */
  public static boolean check( String token ) {
    try {
      Integer.parseInt(token);//if it fails return false otherwise it returns true
      return true;
    } catch(NumberFormatException err) {
      return false;
    }
  }
}
