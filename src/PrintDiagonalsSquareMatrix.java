import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintDiagonalsSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[row][];
        for (int i = 0; i <row ; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        }

        int counter = 0;
       List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();
        for (int i = 0; i <row ; i++) {
               first.add(matrix[i][counter]+"");
                counter++;
        }
        counter = 0;
        for (int i = row - 1; i >=0 ; i--) {
                second.add(matrix[i][counter]+"");
                counter++;
        }
        System.out.println(String.join(" ", first));
        System.out.println(String.join(" ",  second));

    }
}
