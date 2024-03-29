//Реализуйте простой калькулятор
//
//В методе calculate класса Calculator реализовать калькулятор,
//который будет выполнять математические операции (+, -, *, /)
//над двумя целыми числами и возвращать результат вещественного типа.
//
//В классе Printer необходимо реализовать проверку переданного
//оператора, при некорректном операторе программа должна вывести
//сообщение об ошибке "Некорректный оператор: 'оператор'".
//
//Аргументы, передаваемые в метод/функцию:
//
//        '3'
//        '+'
//        '7'
//На выходе:
//
//
//        10.0

import javax.swing.*;

class Calculator {
    public double calculate(char op, int a, int b) {
        // Введите свое решение ниже
        double result;
        switch (op) {
            case '+':
                ;
                result = a + b;
                break;
            case '-':
                ;
                result = a - b;
                break;
            case '*':
                ;
                result = a * b;
                break;
            case '/':
                ;
                result = a / b;
                break;
            default :
                System.out.println("Некорректный оператор: 'оператор'");
            result = calculate(op, a, b);
        }
        return result;
    }
}

