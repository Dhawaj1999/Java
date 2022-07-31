package I__Array;

import java.util.Scanner;

public class M__Rotate_Array {
    public static void rotate(int size){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[size];

        System.out.print("enter elements of array : ");

        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("enter element x : ");
        int x = sc.nextInt();

        // this loop is repeat rotation till user ask
        for (int i = 0; i < x; i++){
            int first = arr[0];

            // this loop is rotate positions by 1
            for (int j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1];
            }

            arr[arr.length-1] = first;
        }

        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size = scan.nextInt();
        rotate(size);
    }
}
