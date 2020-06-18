package simplejavacalculator;

import org.junit.Test;

import org.junit.Assert;
import static java.lang.Double.NaN;


public class CalculatorTest {
    @Test
    public void Testing0() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.square, 5.0);
        Assert.assertEquals((Double) 25.0, result);
    }
    @Test
    public void Testing1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.squareRoot, 25.0);
        Assert.assertEquals((Double) 5.0, result);
    }
    @Test
    public void Testing2() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.oneDividedBy, 5.0);
        Assert.assertEquals((Double) 0.20, result);
    }
    @Test
    public void Testing3() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.cos, Math.PI/3);
        Assert.assertEquals((Double) 0.5000000000000001, result);
    }
    @Test
    public void Testing4() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.sin, Math.PI/6);
        Assert.assertEquals((Double) 0.49999999999999994, result);
    }
    @Test
    public void Testing5() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.tan, Math.PI/4);
        Assert.assertEquals((Double) 0.9999999999999999, result);
    }
    @Test
    public void Testing6() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.tan, 0.0);
        Assert.assertEquals((Double) 0.0, result);
    }
    @Test
    public void Testing7() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.tan, 90.0);
        Assert.assertEquals((Double) NaN, result);
    }
    @Test
    public void Testing8() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.log, 10000.0);
        Assert.assertEquals((Double) 4.0, result);
    }
    @Test
    public void Testing9() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.rate, 10.0);
        Assert.assertEquals((Double) 0.1, result);
    }
    @Test
    public void Testing10() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.abs, -3.0);
        Assert.assertEquals((Double) 3.0, result);
    }
    @Test
    public void Testing11() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.normal, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) NaN, result);
    }
    @Test
    public void Testing12() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.add, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) 5.0, result);
    }
    @Test
    public void Testing13() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.add, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 0.0);
        Assert.assertEquals((Double) 2.0, result);
    }
    @Test
    public void Testing14() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.minus, 5.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) 2.0, result);
    }
    @Test
    public void Testing15() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.multiply, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) 6.0, result);
    }
    @Test
    public void Testing16() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.divide, 6.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) 2.0, result);
    }
    @Test
    public void Testing17() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.xPowerOfY, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) 8.0, result);
    }
    @Test
    public void Testing18() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.add, 2.0);
        c.calculateBi(Calculator.BiOperatorModes.add, 4.0);
        Double result = c.calculateEqual( 3.0);
        Assert.assertEquals((Double) 9.0, result);
    }
    @Test
    public void Testing19() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.add, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.add, 3.0);
        Assert.assertEquals((Double) 5.0, result);
        Assert.assertEquals((Double) NaN, c.reset());
    }

}