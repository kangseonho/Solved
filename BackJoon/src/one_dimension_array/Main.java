package one_dimension_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] studentNum = new int[N];
        double[] results = new double[N];
        int[] studentsScores;
        int count = 0;

        for (int i = 0; i < studentNum.length; i++) {
            studentNum[i] = scanner.nextInt();
            studentsScores = new int[studentNum[i]];
            for (int j = 0; j < studentsScores.length; j ++) {
                studentsScores[j] = scanner.nextInt();
            }
            double avg = Arrays.stream(studentsScores).average().getAsDouble();
            for (int k = 0; k < studentsScores.length; k ++) {
                if (avg < studentsScores[k]) {
                    count++;
                }
            }
            results[i] = count / (double)studentNum[i] * 100;
            count = 0;
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println(String.format("%.3f",Math.round(results[i]*1000)/1000.0)+"%");
        }
    }
}
