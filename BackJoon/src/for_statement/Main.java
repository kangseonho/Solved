package for_statement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A,X = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        X = sc.nextInt();

        for (int i = 0; i < A; i++) {
            temp.add(sc.nextInt());
        }

        for (int j = 0; j < temp.size(); j++) {
            if (X > temp.get(j)) {
                System.out.print(temp.get(j) + " ");
            }
        }
    }
}

