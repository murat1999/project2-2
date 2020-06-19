/*
 * @name        Simple Java Calculator
 * @file        Calculator.java
 * @author      Soria Pierre-Henry
 * @copyright   Copyright Pierre-Henry Soria, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0).
 */

package simplejavacalculator;

import static java.lang.Double.NaN;
import static java.lang.Math.log10;
import static java.lang.Math.pow;

public final class Calculator {

    public enum BiOperatorModes {
        /** normal mode.*/
        NORMAL,
        /** add operation.*/
        ADD,
        /** minus operation.*/
        MINUS,
        /** multiply operation.*/
        MULTIPLY,
        /** divide operation.*/
        DIVIDE,
        /** x power of y operation.*/
        X_POWER_OF_Y
    }
    public enum MonoOperatorModes {
        /** square operation.*/
        SQUARE,
        /** square root operation.*/
        SQUARE_ROOT,
        /** one divided by operation.*/
        ONE_DIVIDED_BY,
        /** cos operation.*/
        COS,
        /** sin operation.*/
        SIN,
        /** tan operation.*/
        TAN,
        /** log operation.*/
        LOG,
        /** rate operation.*/
        RATE,
        /** abs operation.*/
        ABS
    }

    /** num1.*/
    private Double num1;
    /** num2.*/
    private Double num2;
    /** mode.*/
    private BiOperatorModes mode = BiOperatorModes.NORMAL;

    private Double calculateBiImpl() {
        if (mode == BiOperatorModes.NORMAL) {
            return num2;
        }
        if (mode == BiOperatorModes.ADD) {
            if (num2 != 0) {
                return num1 + num2;
            }

            return num1;
        }
        if (mode == BiOperatorModes.MINUS) {
            return num1 - num2;
        }
        if (mode == BiOperatorModes.MULTIPLY) {
            return num1 * num2;
        }
        if (mode == BiOperatorModes.DIVIDE) {
            return num1 / num2;
        }
        if (mode == BiOperatorModes.X_POWER_OF_Y) {
            return pow(num1, num2);
        }

        // never reach
        throw new Error();
    }

    /** @return number from operation from resulting operations on two number.
     * @param num number needed.
     * @param newMode type of operation.
     */
    public Double calculateBi(final BiOperatorModes newMode, final Double num) {
        if (mode == BiOperatorModes.NORMAL) {
            num2 = 0.0;
            num1 = num;
            mode = newMode;
            return NaN;
        } else {
            num2 = num;
            num1 = calculateBiImpl();
            mode = newMode;
            return num1;
        }
    }

    /** @return number from bi operation.
     * @param num number needed.
     */
    public Double calculateEqual(final Double num) {
        return calculateBi(BiOperatorModes.NORMAL, num);
    }

    /** @return NaN.*/
    public Double reset() {
        num2 = 0.0;
        num1 = 0.0;
        mode = BiOperatorModes.NORMAL;

        return NaN;
    }

    /** @return result from operation on number.
     * @param num number needed.
     * @param newMode type of operation.
     */
    public Double calculateMono(final MonoOperatorModes newMode,
                                final Double num) {
        if (newMode == MonoOperatorModes.SQUARE) {
            return num * num;
        }
        if (newMode == MonoOperatorModes.SQUARE_ROOT) {
            return Math.sqrt(num);
        }
        if (newMode == MonoOperatorModes.ONE_DIVIDED_BY) {
            return 1 / num;
        }
        if (newMode == MonoOperatorModes.COS) {
            return Math.cos(num);
        }
        if (newMode == MonoOperatorModes.SIN) {
            return Math.sin(num);
        }
        final int degree = 180;
        final int degree9 = 90;
        if (newMode == MonoOperatorModes.TAN) {
            if (num == 0 || num % degree == 0) {
                return 0.0;
            }
            if (num % degree9 == 0 && num % degree != 0) {
                return NaN;
            }

            return Math.tan(num);
        }
        if (newMode == MonoOperatorModes.LOG) {
            return log10(num);
        }
        final int hundred = 100;
        if (newMode == MonoOperatorModes.RATE) {
           return num / hundred;
        }
        if (newMode == MonoOperatorModes.ABS) {
            return Math.abs(num);
        }

        // never reach
        throw new Error();
    }

}
