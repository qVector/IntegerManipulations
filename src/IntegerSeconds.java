import java.io.PrintStream;
import java.util.Scanner;

public class IntegerSeconds {
    public static void main(String[] args) {
        int allSeconds, seconds, minutes, hours, days;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите полное количество секунд: ");
        allSeconds = in.nextInt();
        in.close();
        days = allSeconds / (60 * 60 * 24);
        hours = allSeconds % (60 * 60 * 24) / (60 * 60);
        minutes = allSeconds % (60 * 60 * 24) % (60 * 60) / 60;
        seconds = allSeconds % (60 * 60 * 24) % (60 * 60) % 60;


        System.out.println("Всего дней: " + days);
        System.out.println("Всего часов: " + hours);
        System.out.println("Всего минут: " + minutes);
        System.out.println("Всего секунд: " + seconds);
    }
}
