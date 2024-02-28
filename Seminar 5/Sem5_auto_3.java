//Сортировка массива с использованием кучи
//
//Инструкция по использованию платформы
//
//
//
//Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort). Программа должна работать следующим образом:
//
//Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен, программа использует массив по умолчанию.
//
//Сначала выводить исходный массив на экран.
//
//Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.
//
//Выводить отсортированный массив на экран.
//
//Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива, и heapSort, который выполняет собственно сортировку кучей.
//
//Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.
//
//На входе:
//
//
//        '5 8 12 3 6 9'
//На выходе:
//
//
//Initial array:
//        [5, 8, 12, 3, 6, 9]
//Sorted array:
//        [3, 5, 6, 8, 9, 12]


class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
        // Введите свое решение ниже

        for (int i = sortLength / 2 - 1; i >= 0; i--)
            heapify(tree, sortLength, i);
    }

    public static void heapSort(int[] sortArray, int sortLength) {
// Введите свое решение ниже
        buildTree(sortArray, sortLength);
        // Один за другим извлекаем элементы из кучи
        for (int i = sortLength - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(sortArray, i, 0);
        }
    }

    static void heapify(int arr[], int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2 * i + 1; // левый = 2*i + 1
        int r = 2 * i + 2; // правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arr[r] > arr[largest])
            largest = r;
        // Если самый большой элемент не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, largest);
        }
    }

//    Эталон решения

//    class HeapSort {
//        public static void buildTree(int[] tree, int sortLength) {
//            // Для всех вершин дерева начиная с середины сортируемой части массива
//            // (движемся влево до нулевого индекса)
//            for (int i = sortLength / 2 - 1; i >= 0; i--) {
//                int maxIndex;
//                // Если у вершины два листа, выбираем больший
//                if (i * 2 + 2 <= sortLength - 1) {
//                    if (tree[i * 2 + 2] > tree[i * 2 + 1]) maxIndex = i * 2 + 2;
//                    else maxIndex = i * 2 + 1;
//                    // Иначе один лист
//                } else maxIndex = i * 2 + 1;
//                // Сравниваем лист с максимальным значением с вершиной, при большем значении
//                // дочернего элемента меняем его местами с вершиной
//                if (tree[i] < tree[maxIndex]) {
//                    int temp = tree[i];
//                    tree[i] = tree[maxIndex];
//                    tree[maxIndex] = temp;
//                }
//            }
//        }
//
//        public static void heapSort(int[] sortArray, int sortLength) {
//            // Выход из рекурсии: длина сортируемой части равна 0
//            if (sortLength == 0) return;
//            // Выстраивание элементов части массива в виде сортирующего дерева
//            buildTree(sortArray, sortLength);
//            // Замена местами первого и последнего элемента в сортируемой части
//            int temp = sortArray[0];
//            sortArray[0] = sortArray[sortLength - 1];
//            sortArray[sortLength - 1] = temp;
//            // Рекурсивно построение дерева и замена элементов для n - 1 элементов массива
//            heapSort(sortArray, sortLength - 1);
//        }
//    }
}


