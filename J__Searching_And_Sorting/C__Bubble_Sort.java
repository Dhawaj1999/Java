package J__Searching_And_Sorting;

import java.util.Scanner;

public class C__Bubble_Sort {
    public static void main(String[] args) {
        // sort array with bubble sort
        Scanner scan = new Scanner(System.in);
        System.out.print("array size : ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.print("elements in array : ");
        for (int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }

        // using counter to count rounds of bubble sort
        // i & j are used to compare elements a & b in array to sort

        for (int roundCounter = 0; roundCounter < size; roundCounter++) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < i + 2 && j < size; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

        // print sorted array

        for (int val : array){
            System.out.print(val + " ");
        }

    }
}
