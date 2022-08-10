package J__Searching_And_Sorting;

import java.util.Scanner;

public class B__Selection_Sort {
    public static void main(String[] args) {
        // sort array in ascending order

        Scanner scan = new Scanner(System.in);
        System.out.print("array size : ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.print("elements : ");
        for (int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }

        // compare element i with j in array

        for (int i = 0; i < size-1; i++){
            int min = array[i];
            int minIndex = i;
            for (int j = i+1; j < size; j++){
                if (array[j] < min){
                    min = array[j];
                    minIndex = j;
                }
            }


            // swap elements

            array[minIndex] = array[i];
            array[i] = min;
        }

        // print sorted array

        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
