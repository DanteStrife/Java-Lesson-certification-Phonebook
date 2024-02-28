//Вычислить n-ое треугольного число(сумма чисел от 1 до n).
//
//Внутри класса Answer напишите метод countNTriangle, который принимает
//число n и возвращает его n-ое треугольное число.
//Если число n < 1 (ненатуральное) метод должен вернуть -1.
//
//Пример
//
//        n = 4 -> 10
//
//        n = 5 -> 15


class Answer {
    public int countNTriangle(int n) {
        // Введите свое решение ниже
        if (n < 1) return -1;
        int result = 0;
        for (int i = 1; i <= Math.abs(n); i++) {
            result += i;
        }
        return result;

    }
}

