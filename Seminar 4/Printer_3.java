import java.util.ArrayDeque;
import java.util.Deque;

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer_3 {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;
        Deque<Double> answ = new ArrayDeque<>();
        answ.addFirst(1.0);
        answ.addFirst(1.0);

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 20;
            op = '-';
            b = 5;
            c = 4;
            op2 = '*';
            d = 4;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b, answ);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d, answ);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0, answ);
        System.out.println(prevResult);
    }
}
