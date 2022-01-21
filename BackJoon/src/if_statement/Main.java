package if_statement;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int hour, min;
        hour = scanner.nextInt();
        min = scanner.nextInt();

        if (hour == 0) {
            hour = 24;
        }
        min = (hour * 60) + min;
        min = min - 45;
        hour = min / 60;
        min = min % 60;

        if (hour == 0) {
            hour = 24;
        }
        System.out.println(hour);
        System.out.println(min);
    }
}
