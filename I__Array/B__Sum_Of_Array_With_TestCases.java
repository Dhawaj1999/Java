package I__Array;

import java.util.Scanner;

public class B__Sum_Of_Array_With_TestCases {
    public static void sumOfArray(int testCases){
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for (int j = 1; j <= testCases; ++j){
            System.out.print("enter size of array : ");
            int size = scan.nextInt();
            int[] array = new int[size];
            sum = 0;
            for (int i = 0; i < size; ++i){
                array[i] = scan.nextInt();
                sum = sum + array[i];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter no. of test cases : ");
        int testCases = scan.nextInt();
         sumOfArray(testCases);

    }
}
