package math;

/**
 * #2775
 */
import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] array = new int[k+1][n];
            for (int j = 0; j < n; j++) {
                array[0][j] = j+1;
            }
            for (int row = 1; row <= k; row++) {
                for (int col = 0; col < n; col++) {
                    if (col == 0) {
                        array[row][col] = 1;
                    } else {
                        array[row][col] = array[row][col-1] + array[row-1][col];
                    }
                }
            }
            System.out.println(array[k][n-1]);
        }
    }
}
