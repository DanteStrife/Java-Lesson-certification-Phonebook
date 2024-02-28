//Напишите функцию printPrimeNums, которая выведет на экран все
//простые числа в промежутке от 1 до 1000, каждое на новой строке.
//
//Напишите свой код в методе printPrimeNums класса Answer.
//
//Пример
//
//2
//        3
//        5
//        7
//        11
//        ...


class Answer_2 {
    public void printPrimeNums() {
        // Напишите свое решение ниже
        for (int i = 2; i <= 1000; i++) {
            boolean question = false;
            for (int j = 2; j * j <= i; j++) {
                question = (i % j == 0);
                if (question) {
                    break;
                }
            }
            if (!question) {
                System.out.println(i);
            }
        }

    }
}
