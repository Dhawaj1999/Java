package K__Strings_And_2D_Arrays;

public class Jagged_Array {
    public static void main(String[] args) {

        int[][] arr = new int[4][];

        // insert two columns in each row, i represent row
        for (int i = 0; i < arr.length; i++){
            arr[i] = new int[2];
        }

        // print the array
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] arr2 = new int[4][];

        // in each row, elements are inserted according to row number
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = new int[i+1];
        }

        // print jagged array
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
    }

}
