package I__Array;

import java.util.Scanner;

public class Q__Sum_Of_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter array1 size : ");
        int size1 = scan.nextInt();
        System.out.print("enter array2 size : ");
        int size2 = scan.nextInt();

        int[] arr1 = new int[size1];

        System.out.print("enter array1 elements : ");
        for (int i = 0; i < size1; i++){
            arr1[i] = scan.nextInt();
        }

        int[] arr2 = new int[size2];

        System.out.print("enter array2 elements : ");
        for (int i = 0; i < size2; i++){
            arr2[i] = scan.nextInt();
        }

        int[] arr3 = new int[Math.max(size1, size2)];
        int carry = 0;

        int i = size1-1;
        int j = size2-1;
        int k = arr3.length-1;

        while (k >= 0){
            int temp = 0;
            if (i >= 0){
                temp += arr1[i];
            }
            if (j >= 0){
                temp += arr2[j];
            }

            temp += carry;

            carry = temp/10;
            temp = temp%10;

            arr3[k] = temp;

            i--;
            j--;
            k--;
        }

        if (carry >= 0){
            System.out.print(carry + " ");
        }

        for (int val : arr3){
            System.out.print(val + " ");
        }
    }
}
