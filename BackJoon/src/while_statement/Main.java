package while_statement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input, temp = 0;
        int a,b;
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();

        a = input / 10;
        b = input % 10;

        do {
            cnt++;
            temp = b*10 + (a+b)%10;
            a = temp / 10;
            b = temp % 10;
        }while (input != temp);

        System.out.println(cnt);
    }
}
