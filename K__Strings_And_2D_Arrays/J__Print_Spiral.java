package K__Strings_And_2D_Arrays;


import java.util.Scanner;

public class J__Print_Spiral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("row : ");
        int row = scan.nextInt();
        System.out.print("column : ");
        int col = scan.nextInt();

        int[][] array = new int[row][col];

        for (int i = 0; i <= row; i++){
            for (int j = 0; j <= col; j++){
                System.out.println("enter  element at " + i + " row and " + j + " column");
                array[i][j] = scan.nextInt();
            }
        }

        int top = 0;
        int left = 0;
        int right = col-1;
        int down = row-1;

        int dir = 0;


        while (top <= down && left <= right){
            if (dir == 0){
                for (int i = left; i <= right; i++)
                    System.out.print(array[top][i] + " ");
                    top++;
            }
            else if (dir == 1){
                for (int i = top; i <= down; i++)
                    System.out.print(array[i][right] +" ");
                    right--;
            }
            else if (dir == 2){
                for (int i = right; i >= left; i--)
                    System.out.print(array[down][i] + " ");
                    down--;

            } else if (dir == 3) {
                for (int i = down; i >= top; i--)
                    System.out.print(array[i][left] + " ");
                    left++;

            }
            dir = (dir + 1) % 4;
        }
    }
}
