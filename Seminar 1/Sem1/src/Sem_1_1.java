//Текст задачи:
//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1

import java.time.LocalTime;
import java.util.Scanner;

public class Sem_1_1 {
    public static void main(String[] args) {
        task0();
    }

    static void task0() {
        int[] arr = {1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) count++;
            if (arr[i] == 0 || i == arr.length - 1) {
                if (maxOnes < count) maxOnes = count;
                count = 0;
            }
        }
        //if(maxOnes < count) maxOnes = count;
        System.out.println(maxOnes);
    }
    static void task1(){
    }
}
