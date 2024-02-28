
//<aside>
//        📔 **Текст задачи:**
//        В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
//
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
//
//</aside>
import java.time.LocalTime;
import java.util.Scanner;

public class Sem1 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        LocalTime localTime = LocalTime.now();
        int hours = localTime.getHour();
        if (hours >= 5 && hours < 12) System.out.println("Good morning" + str);
        if (hours >= 12 && hours < 18) System.out.println("Good afternoon " + str);
        if (hours >= 18 && hours < 23) System.out.println("Good evening " + str);
        else System.out.println("Good night " + str);
    }

}
