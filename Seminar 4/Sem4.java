import java.util.*;

public class Sem4 {
    public static void main(String[] args) {
//        ListTime();
//        textnum();
//        tas3();
        task4();
    }
//        <aside>
//📔 **Текст задачи:**
//        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//
//        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
//
//                </aside>

    static void ListTime() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list1.add(0, i);
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list2.add(0, i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(middle - start);
        System.out.println(finish - middle);
    }

//    <aside>
//📔 **Текст задачи:**
//    Реализовать консольное приложение, которое:
//
//            1. Принимает от пользователя строку вида
//
//    text~num
//
//            2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//            3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
//</aside>

    static void textnum() {
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            String text = arr[0];
            int num = Integer.parseInt(arr[1]);
            switch (text) {
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "exit":
                    System.out.println("До встречи!");
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
        }
    }


//    <aside>
//📔 **Текст задачи:**
//    Реализовать консольное приложение, которое:
//
//      1. Принимает от пользователя и “запоминает” строки.
//      2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//      3. Если введено revert, удаляет предыдущую введенную строку из памяти.
//</aside>

    static void tas3() {
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            switch (line) {
                case "print":
                    for (int i = list.size() - 1; i >= 0; i--) {
                        System.out.println(list.get(i));
                    }
                    break;
                case "exit":
                    System.out.println("До встречи!");
                    work = false;
                    break;
                case "revert":
                    list.removeLast();
                default:
                    list.add(line);
            }
        }
    }


//<aside>
//📔 **Текст задачи:**
//    1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
//
//    2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
//
//</aside>

    static void task4() {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        Integer[] arr = {1, 2, 4, 5, 7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            stack.push((arr[i]));
            queue.add(arr[i]);
        }
        System.out.println(stack);
        System.out.println(queue);
        for (int i = 0; i < stack.size() ; i++) {
            System.out.println(stack.pop());
        }
        System.out.println();
        for (int i = 0; i < queue.size(); i++) {
            System.out.println(queue.poll());
        }
    }
}
