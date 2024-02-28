import java.util.*;

public class Sem5 {
    public static void main(String[] args) {
        task0();
//        System.out.println(task1("foo", "bar"));
//        System.out.println(task2AllBrackets("{a}[+]{(d*3)}"));
//        task5();
    }

    //<aside>
//📔 **Текст задачи:**
//        Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//
//        123456 Иванов
//
//        321456 Васильев
//
//        234561 Петрова
//
//        234432 Иванов
//
//        654321 Петрова
//
//        345678 Иванов
//
//        Вывести данные по сотрудникам с фамилией Иванов.
//
//                </aside>
    static void task0() {
        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("321456", "Васильев");
        passports.add("234561", "Петрова");
        passports.add("234432", "Иванов");
        passports.add("654321", "Петрова");
        passports.add("345678", "Иванов");
        System.out.println(passports.getAll());

        System.out.println(passports.getByLastName("Иванов"));
        System.out.println(passports.getByPassNum("234561"));
    }


//<aside>
//📔 **Текст задачи:**
//    Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
//    Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//
//     1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
//     2. буква может не меняться, а остаться такой же. (Например, note - code)
//
//    Пример 1:
//
//    Input: s = "foo", t = "bar"
//
//    Output: false
//
//    Пример 2:
//
//    Input: s = "paper", t = "title"
//
//    p=t   a=i  r=e
//
//    Output: true
//
//</aside>

    static boolean task1(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])) {
                if (map.get(c1[i]) != c2[i]) return false;
            } else {
                map.put(c1[i], c2[i]);
            }
        }
        return true;
    }


//    <aside>
//📔 **Текст задачи:**
//    Написать программу, определяющую правильность расстановки скобок в выражении.
//
//    Пример 1: a+(d*3) - истина
//
//    Пример 2: [a+(1*3) - ложь
//
//    Пример 3: [6+(3*3)] - истина
//
//    Пример 4: {a}[+]{(d*3)} - истина
//
//    Пример 5: <{a}+{(d*3)}> - истина
//
//    Пример 6: {a+]}{(d*3)} - ложь
//
//            </aside>

    static boolean task2AllBrackets(String str) {    //{a}[+]{(d*3)}
        Stack<Character> stack = new Stack<>(); // {(
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('<', '>');
        map.put('{', '}');
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i])) stack.push(c[i]);
            if (map.containsValue(c[i])) {
                if (stack.isEmpty() || map.get(stack.pop()) != c[i]) return false;
            }
        }
        return stack.isEmpty();
    }

//    <aside>
//📔 **Текст задачи:**
//    Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
//
//    Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
//
//</aside>
//  Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись

    static void task5() {
        TreeMap<Integer, List<String>> tMap = new TreeMap<>();
        String str = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        String[] values = str.split(" ");
        //System.out.println(Arrays.toString(values));
        //System.out.println(Arrays.toString(lengthes));
        for (int i = 0; i < values.length; i++){
            int lengthWord = values[i].length();
            if (tMap.containsKey(lengthWord)) {
                List<String> list = tMap.get(lengthWord);
                list.add(values[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(values[i]);
                tMap.put(lengthWord, list);
            }

        }
        System.out.println(tMap);
    }
}
