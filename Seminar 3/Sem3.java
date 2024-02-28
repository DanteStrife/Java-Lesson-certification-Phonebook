import java.util.*;

public class Sem3 {
    public static void main(String[] args) {
//        task3();

    }

    //<aside>
//📔 **Текст задачи:**
//Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
//
//String s1 = "hello";
//
//String s2 = "hello";
//
//String s3 = s1;
//
//String s4 = "h" + "e" + "l" + "l" + "o";
//
//String s5 = new String("hello");
//
//String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
//
//</aside>
    static void task0() {

        String s1 = "hello";

        String s2 = "hello";

        String s3 = s1;

        String s4 = "h" + "e" + "l" + "l" + "o";

        String s5 = new String("hello");

        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);
        System.out.println();

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));
    }
//    Текст задачи:
//    Заполнить список десятью случайными числами.
//    Отсортировать список методом sort() и вывести его на экран.

    static void task1() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(0, 10));
        }
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }

//    Текст задачи:
//    Создать список типа ArrayList<String>.
//    Поместить в него как строки, так и целые числа.
//    Пройти по списку, найти и удалить целые числа.

    static void task2() {
        ArrayList list8 = new ArrayList<>();
        list8.add("asds");
        list8.add(123);
        list8.add(46.99);
        list8.add(245);
        list8.add("dfasdsa");
        Iterator iterator = list8.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof Integer) {
                iterator.remove();
            }
        }
        System.out.println(list8);
    }

//    Текст задачи:
//    Каталог товаров книжного магазина сохранен в виде двумерного
//    списка List<ArrayList<String>> так, что на 0й позиции каждого
//    внутреннего списка содержится название жанра, а на остальных
//    позициях - названия книг. Напишите метод для заполнения данной
//    структуры.

//    static void addBook(String name, String ganre, List<ArrayList<String>> bookShop){
////        Текст задачи:
////        Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
////        что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях -
////        названия книг. Напишите метод для заполнения данной структуры.
//        //[ Роман, ююю, ыыы, жжж ]
//        //[ Сказки, ррр, ллл]
//        //[ Фантастика, ..., ...] array[i,0]
//        //[ Детектив, ..., ...]
//        //[ Классика, ..., ...]
//        for (int i = 0; i < bookShop.size(); i++) {
//            if(bookShop.get(i).get(0).equals(ganre)){
//                List<String> list = bookShop.get(i);
//                list.add(name);
//                return;
//            }
//        }
//        ArrayList<String> list = new ArrayList<>();
//        list.add(ganre);
//        list.add(name);
//        bookShop.add(list);
//    }
//
//12:54
//    public static void main(String[] args) {
//        List<ArrayList<String>> bookShop = new ArrayList<>();
//        addBook("...","Роман", bookShop);
//        addBook(",,,","Детектив", bookShop);
//        addBook("...","Роман", bookShop);
//        addBook(",,,","Детектив", bookShop);
//        addBook("!!!","Фантастика", bookShop);
//        System.out.println(bookShop);
//    }

}







