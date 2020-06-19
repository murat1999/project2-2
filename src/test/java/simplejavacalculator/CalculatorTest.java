package simplejavacalculator;

import org.junit.Test;

import org.junit.Assert;
import static java.lang.Double.NaN;


public class CalculatorTest {
    @Test
    public void Testing0() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.SQUARE, 5.0);
        Assert.assertEquals((Double) 25.0, result);
    }
    @Test
    public void Testing1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.SQUAREROOT, 25.0);
        Assert.assertEquals((Double) 5.0, result);
    }
    @Test
    public void Testing2() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.ONEDIVIDEDBY, 5.0);
        Assert.assertEquals((Double) 0.20, result);
    }
    @Test
    public void Testing3() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.COS, Math.PI/3);
        Assert.assertEquals((Double) 0.5000000000000001, result);
    }
    @Test
    public void Testing4() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.SIN, Math.PI/6);
        Assert.assertEquals((Double) 0.49999999999999994, result);
    }
    @Test
    public void Testing5() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.TAN, Math.PI/4);
        Assert.assertEquals((Double) 0.9999999999999999, result);
    }
    @Test
    public void Testing6() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.TAN, 0.0);
        Assert.assertEquals((Double) 0.0, result);
    }
    @Test
    public void Testing7() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.TAN, 90.0);
        Assert.assertEquals((Double) NaN, result);
    }
    @Test
    public void Testing8() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.LOG, 10000.0);
        Assert.assertEquals((Double) 4.0, result);
    }
    @Test
    public void Testing9() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.RATE, 10.0);
        Assert.assertEquals((Double) 0.1, result);
    }
    @Test
    public void Testing10() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.ABS, -3.0);
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
        c.calculateBi(Calculator.BiOperatorModes.ADD, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) 5.0, result);
    }
    @Test
    public void Testing13() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.ADD, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 0.0);
        Assert.assertEquals((Double) 2.0, result);
    }
    @Test
    public void Testing14() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.MINUS, 5.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) 2.0, result);
    }
    @Test
    public void Testing15() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.MULTIPLY, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) 6.0, result);
    }
    @Test
    public void Testing16() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.DIVIDE, 6.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) 2.0, result);
    }
    @Test
    public void Testing17() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.XPOWEROFY, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.normal, 3.0);
        Assert.assertEquals((Double) 8.0, result);
    }
    @Test
    public void Testing18() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.ADD, 2.0);
        c.calculateBi(Calculator.BiOperatorModes.ADD, 4.0);
        Double result = c.calculateEqual( 3.0);
        Assert.assertEquals((Double) 9.0, result);
    }
    @Test
    public void Testing19() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.ADD, 2.0);
        Double result = c.calculateBi(Calculator.BiOperatorModes.ADD, 3.0);
        Assert.assertEquals((Double) 5.0, result);
        Assert.assertEquals((Double) NaN, c.reset());
    }

}