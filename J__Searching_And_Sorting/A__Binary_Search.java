package J__Searching_And_Sorting;

import java.util.Scanner;

public class A__Binary_Search {
    public static void main(String[] args) {

        // find element using binary search

        Scanner scan = new Scanner(System.in);
        System.out.print("size of array : ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.print("sorted array elements : ");
        for (int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }

        System.out.print("element to search in array : ");
        int element = scan.nextInt();

        int start = 0;
        int end = size-1;
        while (start <= end){
            int mid = (start + end)/2;
            if (element == array[mid]){
                System.out.print("found at index : " + mid);
                return;
            } else if (element > array[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
            System.out.print("not found");
    }
}
