package simplejavacalculator;

import org.junit.Test;

import org.junit.Assert;
import static java.lang.Double.NaN;


public class CalculatorTest {
    public final Calculator c = new Calculator();
    @Test
    public void TestingSquare() {
        Double result = c.calculateMono(Calculator.MonoOperatorModes.SQUARE, 5.0);
        Assert.assertEquals((Double) 25.0, result);
    }
    @Test
    public void TestingSquareRoot() {
        Double result = c.calculateMono(Calculator.MonoOperatorModes.SQUARE_ROOT, 25.0);
        Assert.assertEquals((Double) 5.0, result);
    }
    @Test
    public void TestingOneDividedBy() {
        Double result = c.calculateMono(Calculator.MonoOperatorModes.ONE_DIVIDED_BY, 5.0);
        Assert.assertEquals((Double) 0.20, result);
    }
    @Test
    public void TestingCos() {
        Double result = c.calculateMono(Calculator.MonoOperatorModes.COS, Math.PI/3);
        Assert.assertEquals((Double) 0.5000000000000001, result);
    }
    @Test
    public void TestingSin() {
        Double result = c.calculateMono(Calculator.MonoOperatorModes.SIN, Math.PI/6);
        Assert.assertEquals((Double) 0.49999999999999994, result);
    }
    @Test
    public void TestingTan() {
        Double result = c.calculateMono(Calculator.MonoOperatorModes.TAN, Math.PI/4);
        Assert.assertEquals((Double) 0.9999999999999999, result);
    }
    @Test
    public void TestingTan2() {
        Double result = c.calculateMono(Calculator.MonoOperatorModes.TAN, 0.0);
        Assert.assertEquals((Double) 0.0, result);
    }
    @Test
    public void TestingTan3() {
        Double result = c.calculateMono(Calculator.MonoOperatorModes.TAN, 90.0);
        Assert.assertEquals((Double) NaN, result);
    }
    @Test
    public void TestingTan4() {
        Double result = c.calculateMono(Calculator.MonoOperatorModes.TAN, 180.0);
        Assert.assertEquals((Double) 0.0, result);
    }
    @Test
    public void TestingTan5() {
        Double result = c.calculateMono(Calculator.MonoOperatorModes.TAN, 270.0);
        Assert.assertEquals((Double) NaN, result);
    }
    @Test
    public void TestingLog() {
        Double result = c.calculateMono(Calculator.MonoOperatorModes.LOG, 10000.0);
        Assert.assertEquals((Double) 4.0, result);
    }
    @Test
    public void TestingRate() {
        Double result = c.calculateMono(Calculator.MonoOperatorModes.RATE, 10.0);
        Assert.assertEquals((Double) 0.1, result);
    }
    @Test
    public void TestingAbs() {
        Double result = c.calculateMono(Calculator.MonoOperatorModes.ABS, 3.0);
        Double result2 = c.calculateMono(Calculator.MonoOperatorModes.ABS, -3.0);
        Assert.assertEquals((Double) 3.0, result);
        Assert.assertEquals((Double) 3.0, result2);
    }
    @Test
    public void TestingNormal() {
        c.calculateBi(Calculator.BiOperatorModes.NORMAL, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.NORMAL, 3.0);
        Assert.assertEquals((Double) NaN, result);
    }
    @Test
    public void TestingAdd() {
        c.calculateBi(Calculator.BiOperatorModes.ADD, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.NORMAL, 3.0);
        Assert.assertEquals((Double) 5.0, result);
    }
    @Test
    public void TestingAdd2() {
        c.calculateBi(Calculator.BiOperatorModes.ADD, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.NORMAL, 0.0);
        Assert.assertEquals((Double) 2.0, result);
    }
    @Test
    public void TestingMinus() {
        c.calculateBi(Calculator.BiOperatorModes.MINUS, 5.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.NORMAL, 3.0);
        Assert.assertEquals((Double) 2.0, result);
    }
    @Test
    public void TestingMultiply() {
        c.calculateBi(Calculator.BiOperatorModes.MULTIPLY, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.NORMAL, 3.0);
        Assert.assertEquals((Double) 6.0, result);
    }
    @Test
    public void TestingDivide() {
        c.calculateBi(Calculator.BiOperatorModes.DIVIDE, 6.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.NORMAL, 3.0);
        Assert.assertEquals((Double) 2.0, result);
    }
    @Test
    public void TestingXPowerOfY() {
        c.calculateBi(Calculator.BiOperatorModes.X_POWER_OF_Y, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.NORMAL, 3.0);
        Assert.assertEquals((Double) 8.0, result);
    }
    @Test
    public void TestingEqual() {
        c.calculateBi(Calculator.BiOperatorModes.ADD, 2.0);
        Double result = c.calculateEqual( 9.0);
        Assert.assertEquals((Double) 11.0, result);
    }
    @Test
    public void TestingReset() {
        c.calculateBi(Calculator.BiOperatorModes.ADD, 2.0);
        Assert.assertEquals((Double) NaN, c.reset());
    }

}