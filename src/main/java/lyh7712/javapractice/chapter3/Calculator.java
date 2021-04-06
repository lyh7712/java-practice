package lyh7712.javapractice.chapter3;

import java.util.Calendar;

public class Calculator {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Calculator class started");

        Calculator cal = new Calculator();
        cal.add(a, b);
        cal.subtract(a, b);
        cal.multiply(a, b);
        cal.divide(a, b);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
