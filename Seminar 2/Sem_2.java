//Текст задачи:
//Дано четное число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N,
//которая состоит из чередующихся символов c1 и c2, начиная с c1.


import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Sem_2 {
    public static void main(String[] args) {
//        System.out.println(task3Log());
//        System.out.println(task2("432234"));
//        task1("dfkasnd.klfa");
    }

    static String task0(int n, char c1, char c2) {
//Текст задачи:
//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            stringBuilder.append(c1).append(' ').append(c2).append(' ');
        }
        return stringBuilder.toString();
    }

    //    Текст задачи:
//    Напишите метод, который сжимает строку.
//    Пример: вход aaaabbbcdd.
    static void task1(String str) {
//        Текст задачи:
//        Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
//        a4b3c1d2
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                stringBuilder.append(arr[i - 1]).append(count + 1);
                count = 0;
            }
        }
        stringBuilder.append(arr[arr.length - 1]).append(count + 1);
        System.out.println(stringBuilder);
    }

    //    Текст задачи:
//    Напишите метод, который принимает на вход строку (String)
//    и определяет является ли строка палиндромом (возвращает boolean значение).
    static boolean task2(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }

        }
        return true;
    }

    //    Текст задачи:
//    Напишите метод, который составит строку,
//    состоящую из 100 повторений слова TEST и метод,
//    который запишет эту строку в простой текстовый файл,
//    обработайте исключения.
    static String wordRepeat(String str, int n) {
        return str.repeat(n);
    }

    static void task3Log(String str) {
        Logger logger = Logger.getAnonymousLogger();
        try {
            FileHandler fileHandler = new FileHandler("log.txt", true);
            logger.addHandler(fileHandler);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileWriter fileWriter = new FileWriter("/t/t/t/t/t/t/text.txt");
            fileWriter.write(str);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
            logger.log(Level.INFO, e.getMessage());
            throw new RuntimeException(e);
        }
    }
}

