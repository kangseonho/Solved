package input_output;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A,B;
        A = scanner.nextInt();
        B = scanner.nextInt();

        System.out.println(A * (B%10));
        System.out.println(A * ((B - (B/100)*100) / 10));
        System.out.println(A * (B/100));
        System.out.println(A * B);
    }
}
