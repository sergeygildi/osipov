package ru.gildi.Calculatator;

/**
 * Created by Serhii Hildi on 20.12.18.
 */
public interface ICalculator {

    double getResult();

    public void add(double first, double second);
    public void substract(double first, double second);
    public void div(double first, double second);
    public void multiple(double first, double second);
    public void exp(double first, double second);
}
