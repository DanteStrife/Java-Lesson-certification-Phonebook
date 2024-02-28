//Текст задачи:
//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

//task2
//Текст задачи:
//        Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

//task3
//<aside>
//        📔 **Текст задачи:**
//
//        Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
//
//        Пример 1: а = 3, b = 2, ответ: 9
//
//        Пример 2: а = 2, b = -2, ответ: 0.25
//
//        Пример 3: а = 3, b = 0, ответ: 1
//
//        </aside>

import java.util.Arrays;
import java.time.LocalTime;
import java.util.Scanner;

public class Sem_1_2 {
    public static void main(String[] args) {
        System.out.println(task3(2,-3));
    }

    static double task3(int a, int b) {
        double c = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            c = c * a;
        }
        if(b < 0)
            return 1 / c;
        return c;

    }

    static void task1() {
        int[] nums = {3, 2, 2, 3, 1, 3, 2, 1, 23, 4, 1, 14, 1, 5, 32, 2};// 2233  1 2 3 1 2 3 1 1 1 -> 1 2 1 2 1 1 1 3 3
        int val = 2;
        int[] tempArr = new int[nums.length]; // 2 2 3 3
        Arrays.fill(tempArr, val);
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                tempArr[current++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(tempArr));
    }

    static String task2(String str) {//"Добро пожаловать на курс по Java"
        str = str.toLowerCase();
        String[] arr = str.split(" ");
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i] + " ";
        }
        return result;
    }
}
