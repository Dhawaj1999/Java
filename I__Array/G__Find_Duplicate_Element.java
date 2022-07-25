package I__Array;

import java.util.Scanner;

public class G__Find_Duplicate_Element {
    public static void duplicate(int size){
        Scanner s = new Scanner(System.in);

        int[] array = new int[size];
        System.out.printf("enter numbers : ");
        for (int i = 0; i < size; ++i){
            array[i] = s.nextInt();
        }

        for (int i = 0; i < size; ++i){
            for (int j = i+1; j < size; ++j){
                if ((array[i] == array[j]) && i != j){
                    System.out.print(array[j]);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("enter size in array : ");
        int size = s.nextInt();
        duplicate(size);
    }
}
