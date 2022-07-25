package I__Array;

import java.util.Scanner;

public class E__Swap_Alternate {
        public static int[] swap(){
            Scanner scan = new Scanner(System.in);
            System.out.print("enter size of array = ");
            int size = scan.nextInt();
            int[] arr = new int[size];
            System.out.print("enter elements of array = ");

            for (int i = 0; i < size; ++i){
                arr[i] = scan.nextInt();
            }
            for (int i = 0; i < size-1; i += 2){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            return arr;
        }
        public static void main(String[] args) {
            int[] array = swap();
            for (int i : array){
                System.out.print(i + " ");
            }
        }

    }
