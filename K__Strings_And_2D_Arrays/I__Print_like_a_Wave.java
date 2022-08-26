package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class I__Print_like_a_Wave {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("row : ");
        int row = scan.nextInt();
        System.out.print("column : ");
        int col = scan.nextInt();

        int[][] arr = new int[row][col];

        // input
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.println("element at " + i + " row and " + j + " column");
                arr[i][j] = scan.nextInt();
            }
        }

        // print 2d array
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < col; j++){
            if (j % 2 == 0){
                for (int i = 0; i < row; i++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for (int i = row-1; i >= 0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
