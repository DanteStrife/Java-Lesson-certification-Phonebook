//Внутри класса MergeSort напишите метод mergeSort,
//который принимает массив целых чисел, реализует алгоритм
//сортировки слиянием. Метод должен возвращать отсортированный массив.
//
//        Пример
//
//
//        a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]

import java.util.Arrays;

class MergeSort {
    public static void main(String args[]) {
    }


    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        int[] buffer1 = Arrays.copyOf(a, a.length);
        int[] buffer2 = new int[a.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, a.length);
        return result;

    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        //уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2] ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}




