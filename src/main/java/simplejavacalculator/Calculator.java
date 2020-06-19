/**
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
        /**
         * variable names.
         */
        normal, add, minus, multiply, divide, xPowerOfY
    }
    public enum MonoOperatorModes {
        /**
         * variables.
         */
        square, squareRoot, oneDividedBy, cos, sin, tan, log, rate, abs
    }

    /** num1.*/
    private Double num1;
    /** num2.*/
    private Double num2;
    /** mode.*/
    private BiOperatorModes mode = BiOperatorModes.normal;

    private Double calculateBiImpl() {
        if (mode == BiOperatorModes.normal) {
            return num2;
        }
        if (mode == BiOperatorModes.add) {
            if (num2 != 0) {
                return num1 + num2;
            }

            return num1;
        }
        if (mode == BiOperatorModes.minus) {
            return num1 - num2;
        }
        if (mode == BiOperatorModes.multiply) {
            return num1 * num2;
        }
        if (mode == BiOperatorModes.divide) {
            return num1 / num2;
        }
        if (mode == BiOperatorModes.xPowerOfY) {
            return pow(num1, num2);
        }

        // never reach
        throw new Error();
    }

    /** calculateBi.*/
    public Double calculateBi(final BiOperatorModes newMode, final Double num) {
        if (mode == BiOperatorModes.normal) {
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

    public Double calculateEqual(final Double num) {
        return calculateBi(BiOperatorModes.normal, num);
    }

    public Double reset() {
        num2 = 0.0;
        num1 = 0.0;
        mode = BiOperatorModes.normal;

        return NaN;
    }

    public Double calculateMono(final MonoOperatorModes newMode,
                                final Double num) {
        if (newMode == MonoOperatorModes.square) {
            return num * num;
        }
        if (newMode == MonoOperatorModes.squareRoot) {
            return Math.sqrt(num);
        }
        if (newMode == MonoOperatorModes.oneDividedBy) {
            return 1 / num;
        }
        if (newMode == MonoOperatorModes.cos) {
            return Math.cos(num);
        }
        if (newMode == MonoOperatorModes.sin) {
            return Math.sin(num);
        }
        final int degree = 180;
        final int degree9 = 90;
        if (newMode == MonoOperatorModes.tan) {
            if (num == 0 || num % degree == 0) {
                return 0.0;
            }
            if (num % degree9 == 0 && num % degree != 0) {
                return NaN;
            }

            return Math.tan(num);
        }
        if (newMode == MonoOperatorModes.log) {
            return log10(num);
        }
        final int hundred = 100;
        if (newMode == MonoOperatorModes.rate) {
           return num / hundred;
        }
        if (newMode == MonoOperatorModes.abs) {
            return Math.abs(num);
        }

        // never reach
        throw new Error();
    }

}
