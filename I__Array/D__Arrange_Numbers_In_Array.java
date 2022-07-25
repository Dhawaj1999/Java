package I__Array;

import java.util.Scanner;

public class D__Arrange_Numbers_In_Array {
    public static int[] arrange(int size){
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i){
            arr[i] = size;
        }
        for (int i = 0; i < size/2; ++i){
            arr[i] = 2*i+1;
            arr[size-1-i] = 2*i+2;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("array size : ");
        int n = sc.nextInt();
        int[] out = arrange(n);
        for (int i : out){
            System.out.print(i + " ");
        }
    }
}
