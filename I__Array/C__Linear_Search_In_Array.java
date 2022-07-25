package I__Array;

import java.util.Scanner;

public class C__Linear_Search_In_Array {
    public static void main(String[] args) {
        // first scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("How many test cases you want to check ? ");
        int testCases = scan.nextInt();

        for (int j = 1; j <= testCases; ++j){
            Scanner sc = new Scanner(System.in);

            // second scanner is used here because I have used "break" in loop
            System.out.println("enter size of array : ");
            int size = sc.nextInt();
            int[] array = new int[size];

            System.out.println("enter the element you want to look for in this array : ");
            int element = sc.nextInt();

            for (int i = 0; i < size; ++i){
                array[i] = sc.nextInt();
                if (array[i] == element){
                    System.out.println("element is at index " + i);
                    break;
                }
            }
        }
    }
}
