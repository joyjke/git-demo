package application;

public class Calculator {

    //***************Simple methods************************
    public static void main(String[] args) {

    }

    public int add(int a, int b) {

        return a + b;
    }

    //TODO add method for subtraction
    public int subsctract(int a, int b) {

        return a + b;
    }

    //TODO add method for multiplication
    public int multiply(int a, int b) {

        return a * b;
    }

    //TODO add method for division
    public int division(int a, int b) {

        return a / b;
    }

    //TODO add method for square root (use Math class)
    public int squareRoot(double a) {

        return (int) Math.sqrt(a);
    }

    //TODO add method for x^2
    public int degreeNumber(double x, double exponent) {
        return (int) (int) Math.pow(x, exponent);
    }
    //***************Medium methods************************

    //TODO (*) |average value| add method which calculate average value of 3 numbers
    public int average(int a, int b, int c, int sumOfNumbers) {
        int quantityOfNumbers = 3;
        int average = (a + b + c) / quantityOfNumbers;
        return average;
    }

    //TODO (*) |even or odd| add method which get 1 number as parameter and return true if it even, and false - if odd
    public int evenOrOdd(int value) {
        if (value % 2 == 0);
        else;
        return value;
    }

    //TODO (*) |biggest value| add method which get 2 number as parameters and return bigger of them, or 0 if they equals
    public void biggestValue(int a, int b) {
        if (a > b) ;
        if (else(a==b));
    }
}
    //***************Hard methods************************

    //TODO (**) |addition with multiple parameters| add method which return sum of any quantity of parameter

    //TODO (*) |divide by zero case| add method for division (check division by zero case
    // - if we try to divide by zero - return -100;










