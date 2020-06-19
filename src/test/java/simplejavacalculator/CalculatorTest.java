package simplejavacalculator;

import org.junit.Test;

import org.junit.Assert;
import static java.lang.Double.NaN;


public class CalculatorTest {
    @Test
    public void TestingSquare() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.SQUARE, 5.0);
        Assert.assertEquals((Double) 25.0, result);
    }
    @Test
    public void TestingSquareRoot() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.SQUARE_ROOT, 25.0);
        Assert.assertEquals((Double) 5.0, result);
    }
    @Test
    public void TestingOneDividedBy() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.ONE_DIVIDED_BY, 5.0);
        Assert.assertEquals((Double) 0.20, result);
    }
    @Test
    public void TestingCos() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.COS, Math.PI/3);
        Assert.assertEquals((Double) 0.5000000000000001, result);
    }
    @Test
    public void TestingSin() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.SIN, Math.PI/6);
        Assert.assertEquals((Double) 0.49999999999999994, result);
    }
    @Test
    public void TestingTan() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.TAN, Math.PI/4);
        Assert.assertEquals((Double) 0.9999999999999999, result);
    }
    @Test
    public void TestingTan2() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.TAN, 0.0);
        Assert.assertEquals((Double) 0.0, result);
    }
    @Test
    public void TestingTan3() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.TAN, 90.0);
        Assert.assertEquals((Double) NaN, result);
    }
    @Test
    public void TestingLog() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.LOG, 10000.0);
        Assert.assertEquals((Double) 4.0, result);
    }
    @Test
    public void TestingRate() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.RATE, 10.0);
        Assert.assertEquals((Double) 0.1, result);
    }
    @Test
    public void TestingAbs() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.ABS, -3.0);
        Assert.assertEquals((Double) 3.0, result);
    }
    @Test
    public void TestingNormal() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.normal, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) NaN, result);
    }
    @Test
    public void TestingAdd() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.ADD, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) 5.0, result);
    }
    @Test
    public void TestingAdd2() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.ADD, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 0.0);
        Assert.assertEquals((Double) 2.0, result);
    }
    @Test
    public void TestingMinus() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.MINUS, 5.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) 2.0, result);
    }
    @Test
    public void TestingMultiply() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.MULTIPLY, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) 6.0, result);
    }
    @Test
    public void TestingDivide() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.DIVIDE, 6.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) 2.0, result);
    }
    @Test
    public void TestingXPowerOfY() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.X_POWER_OF_Y, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) 8.0, result);
    }
    @Test
    public void TestingAdd4() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.ADD, 2.0);
        c.calculateBi(Calculator.BiOperatorModes.ADD, 4.0);
        Double result = c.calculateEqual( 3.0);
        Assert.assertEquals((Double) 9.0, result);
    }
    @Test
    public void TestingReset() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.ADD, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.ADD, 3.0);
        Assert.assertEquals((Double) 5.0, result);
        Assert.assertEquals((Double) NaN, c.reset());
    }

}