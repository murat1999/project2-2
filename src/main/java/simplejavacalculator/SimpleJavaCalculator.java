/*
 * @name        Simple Java Calculator
 * @file        SimpleJavaCalculator.java
 * @author      Soria Pierre-Henry
 * @copyright   Copyright Pierre-Henry Soria, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0).
 */

package simplejavacalculator;

public final class SimpleJavaCalculator {
   private SimpleJavaCalculator() {
      //not called
   }
   /**
    * @param args .
    */
   public static void main(final String[] args) {
      try {
         UI uiCal = new UI();
         uiCal.init();
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}
