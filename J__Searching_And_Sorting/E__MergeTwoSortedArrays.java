package J__Searching_And_Sorting;

import java.util.Scanner;

public class E__MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("first array size : ");
        int sizeOne = scan.nextInt();

        System.out.print("second array size : ");
        int sizeTwo = scan.nextInt();

        int[] arrayOne = new int[sizeOne];
        int[] arrayTwo = new int[sizeTwo];

        System.out.print("1st array elements : ");
        for (int i = 0; i < sizeOne; i++){
            arrayOne[i] = scan.nextInt();
        }

        System.out.print("2nd array elements : ");
        for (int j = 0; j < sizeTwo; j++){
            arrayTwo[j] = scan.nextInt();
        }

        int[] arrayThree = new int[sizeOne + sizeTwo];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < sizeOne && j < sizeTwo){
            if (arrayOne[i] < arrayTwo[j]){
                arrayThree[k] = arrayOne[i];
                k++;
                i++;
            } else {
                arrayThree[k] = arrayTwo[j];
                k++;
                j++;
            }
        }

        while (i < sizeOne){
            arrayThree[k] = arrayOne[i];
            k++;
            i++;
        }

        while (j < sizeTwo){
            arrayThree[k] = arrayTwo[j];
            k++;
            j++;
        }

        for (int out : arrayThree){
            System.out.print(out + " ");
        }
    }
}
