package ru.geekbrains.android1homeworkaplication2;

public class Calculator {

    public double calculate (String value1, String value2, char operation) {
        double a = Double.parseDouble(value1);
        double b = Double.parseDouble(value2);

        if (operation == '+') {
            return a + b;
        } else if (operation == '-') {
            return a - b;
        } else if (operation == '/') {
            return a / b;
        } else if (operation == '*') {
            return a * b;
        }
        return 0;
    }
}
