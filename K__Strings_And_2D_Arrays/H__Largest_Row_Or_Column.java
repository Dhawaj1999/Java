package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class H__Largest_Row_Or_Column {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("rows : ");
        int rows = scan.nextInt();
        System.out.print("col : ");
        int col = scan.nextInt();

        int[][] array = new int[rows][col];

        int i, j, sum1 = 0, sum2 = 0;

        for (i = 0; i < rows; i++){
            for (j = 0; j < col; j++){
                System.out.println("enter elements of " + i + " row and " + j + " column" );
                array[i][j] = scan.nextInt();
            }
        }

        int largest1 = Integer.MIN_VALUE;
        int rowCounter = 0;

        for (i = 0; i < rows; i++){
            sum1 = 0;
            for ( j = 0; j < col; j++){
                sum1 = sum1 + array[i][j];
            }
            if (sum1 > largest1){
                largest1 = sum1;
                rowCounter = i;
            }
        }

        int largest2 = Integer.MIN_VALUE;
        int colCounter = 0;

        for (j = 0; j < col; j++){
            sum2 = 0;
            for (i = 0; i < rows; i++){
                sum2 = sum2 + array[i][j];
            }
            if (sum2 > largest2){
                largest2 = sum2;
                 colCounter = j;
            }
        }

        if (largest1 > largest2){
            System.out.println("row " + rowCounter + " is bigger with sum " + sum1);
        } else {
            System.out.println("column " + colCounter + " is bigger with sum " + sum2);
        }
    }
}
