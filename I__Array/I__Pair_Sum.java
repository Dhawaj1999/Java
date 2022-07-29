package I__Array;

import java.util.Scanner;

public class I__Pair_Sum {
    public static int pairSum(){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter array size - ");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.print("enter array elements - ");
        for (int i = 0; i < size; ++i){
            array[i] = scan.nextInt();
        }

        System.out.print("enter integer x - ");
        int x = scan.nextInt();

        int counter = 0;

        for (int i = 0; i < size; ++i){
            for (int j = i+1; j < size; ++j){
                if ((array[i] + array[j] == x)){
                    ++counter;
                }
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        int print = pairSum();
        System.out.println(print);
    }
}
