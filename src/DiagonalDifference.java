import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows ; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        }

        int firstSum = 0;
        int secondSum = 0;
          int counter1 = 0;
        for (int i = 0; i < rows ; i++) {
             firstSum = firstSum + matrix[i][counter1];
             counter1++;

        }
        int counter2 = 0;
        for (int i = rows - 1; i >= 0 ; i--) {
                secondSum = secondSum + matrix[i][counter2];
                counter2++;
        }

        int sum = Math.abs(firstSum - secondSum);

        System.out.println(sum);
    }
}
