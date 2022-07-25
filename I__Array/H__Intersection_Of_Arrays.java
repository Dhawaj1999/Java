package I__Array;

import java.util.Scanner;

public class H__Intersection_Of_Arrays {
    public static void arrayIntersection(int size1, int size2){
        Scanner scan = new Scanner(System.in);

        int[] array1 = new int[size1];
        int[] array2 = new int[size2];

        System.out.printf("enter elements of 1st array = ");
        for (int i = 0; i < size1; ++i){
            array1[i] = scan.nextInt();
        }

        System.out.printf("enter elements of 2nd array = ");
        for (int j = 0; j < size2; ++j){
            array2[j] = scan.nextInt();
        }

        for (int i = 0; i < size1; ++i){
            for (int j = 0; j < size2; ++j){
                if (array1[i] == array2[j]){
                    System.out.printf(array1[i] + " ");
                    array2[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter size of 1st array = ");
        int size1 = sc.nextInt();
        System.out.printf("enter size of 2nd array = ");
        int size2 = sc.nextInt();
        arrayIntersection(size1, size2);
    }
}
