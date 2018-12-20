package ru.gildi.Calculatator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Serhii Hildi on 20.12.18.
 */
public class CalculateTest {

    @Test
    public void testWhenPassArgToAddItShouldReturnSum(){
        final ICalculator calculator = new Calculator();
        calculator.add(4, 4);
        final double result = calculator.getResult();
        assertThat(result, is(8d));
    }

    @Test
    public void testWhenPassArgToSubstractItShouldReturnSubstract(){
        final ICalculator calculator = new Calculator();
        calculator.substract(8, 4);
        final double res = calculator.getResult();
        assertThat(res, is(4d));
    }

    @Test
    public void testWhenPassArgToMultipleItShouldReturnMultiple(){
        final ICalculator calculator = new Calculator();
        calculator.multiple(4, 5);
        final double result = calculator.getResult();
        assertThat(result, is(20d));
    }

    @Test
    public void testWhenPassArgToDivItShouldReturnDiv(){
        final ICalculator calculator = new Calculator();
        calculator.div(12, 4);
        final double result = calculator.getResult();
        assertThat(result, is(3d));
    }

    @Test
    public void testWhenPassArgOneToExpItShouldReturnExp() {
        final ICalculator calculator = new Calculator();
        calculator.exp(1, 3);
        final double result = calculator.getResult();
        assertThat(result, is(1d));
    }

    @Test
    public void testWhenPassArgOneToOneExpItShouldReturnExp() {
        final ICalculator calculator = new Calculator();
        calculator.exp(1, 1);
        final double result = calculator.getResult();
        assertThat(result, is(1d));
    }

    @Test
    public void testWhenPassArgToExpItShouldReturnExp() {
        final ICalculator calculator = new Calculator();
        calculator.exp(3, 3);
        final double result = calculator.getResult();
        assertThat(result, is(27d));
    }
}
