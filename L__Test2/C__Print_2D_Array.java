package L__Test2;

import java.util.Scanner;

public class C__Print_2D_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter rows : ");
        int n = scan.nextInt();
        System.out.print("enter col : ");
        int m = scan.nextInt();

        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.println("element at " + i + " row and " + j + " column");
                a[i][j] = scan.nextInt();
            }
        }

        System.out.println("the no. of times 0th row should be print is " + n);
        System.out.println("and other rows will be printed n-1 times");

        for (int i = 0; i < n; i++){
            for (int counter = 0; counter < n-i; counter++){
                for (int j = 0; j < m; j++){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }


    }
}
