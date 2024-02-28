//Калькулятор с отменой последней операции
//
//Инструкция по использованию платформы
//
//
//
//В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
//
//Отмена последней операции должна быть реализована следующим образом: если передан оператор '<' калькулятор должен вывести результат предпоследней операции.
//
//
//calculate('+', 3, 7)
//calculate('+', 4, 7)
//calculate('<', 0, 0)
//
//// 10.0
//// 11.0
//// 10.0
//
//calculate('*', 3, 2)
//calculate('-', 7, 4)
//calculate('<', 0, 0)
//
//// 6.0
//// 3.0
//// 6.0

import java.util.Deque;

class Calculator {
    public double calculate(char op, double a, double b, Deque<Double> answ) {
        // Напишите свое решение ниже
        switch (op) {
            case '+':
                answ.addFirst(a + b);
                answ.pollLast();
                return answ.peekFirst();
            case '-':
                answ.addFirst(a - b);
                answ.pollLast();
                return answ.peekFirst();
            case '*':
                answ.addFirst(a * b);
                answ.pollLast();
                return answ.peekFirst();
            case '/':
                answ.addFirst(a / b);
                answ.pollLast();
                return answ.peekFirst();
            case '<':
                return answ.peekLast();
            default:
                System.out.println("Некорректный оператор: " + op);
                break;
        }
        return -1.00;
    }
}


