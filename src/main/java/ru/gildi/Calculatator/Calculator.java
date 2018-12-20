package ru.gildi.Calculatator;

/**
 * Created by Serhii Hildi on 20.12.18.
 */
public class Calculator implements ICalculator {

    private double result;

    public double getResult() {
        return this.result;
    }

    public void add(double first, double second) {
        this.result = first + second;
    }

    public void substract(double first, double second) {
        this.result = first - second;
    }

    public void div(double first, double second) {
        this.result = first / second;
    }

    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public void exp(double first, double second) {
        double result = first;

        for (int i = 1; i != second; ++i) {
            result *= first;
        }

        this.result = result;
    }
}
