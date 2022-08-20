package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class G__Largest_Column_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("rows : ");
        int rows = scan.nextInt();
        System.out.print("columns : ");
        int col = scan.nextInt();

        int[][] array = new int[rows][col];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < col; j++){
                System.out.println("enter element at " + i + " row and " + j + " column");
                array[i][j] = scan.nextInt();
            }
        }
        System.out.println("2D array is : ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < col; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int largest = Integer.MIN_VALUE;

        for (int j = 0; j < col; j++){
            int sum = 0;
            for (int i = 0; i < rows; i++){
                sum = sum + array[i][j];
            }
            if (sum > largest){
                largest = sum;
            }
        }
        System.out.println(largest);
    }
}
