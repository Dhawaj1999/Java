package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class Starting_With_2D_Arr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("rows : ");
        int rows = scan.nextInt();
        System.out.print("columns : ");
        int col = scan.nextInt();

        int[][] array = new int[rows][col];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < col; j++){
                System.out.println("enter element at " + i + " row " + j + " column");
                array[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < col; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
