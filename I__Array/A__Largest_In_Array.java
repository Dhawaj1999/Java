package I__Array;

import java.util.Scanner;

public class A__Largest_In_Array {
    // finding largest
    public static int largestInArray(int[] n){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; ++i){
            if (n[i] > max){
                max = n[i];
            }
        }
        return max;
    }
    // take input
    public static int[] input(){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] number = new int[size];

        for (int i = 0; i < size; ++i){
            number[i] = scan.nextInt();
        }
        return number;
    }

    public static void main(String[] args) {
        int[] array = input();
        int largest = largestInArray(array);
        System.out.println(largest);
    }
}
