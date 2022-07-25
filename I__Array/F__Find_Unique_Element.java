package I__Array;

import java.util.Scanner;

public class F__Find_Unique_Element {
    public static int findingUnique(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array = ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("enter elements in array = ");

        int result = array[0];

        for (int i = 0; i < size; ++i){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < size; ++i){
            result = result^array[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int printUnique = findingUnique();
        if (printUnique > 0){
        System.out.print("unique element is " + printUnique);
        } else {
            System.out.print("no unique element is found");
        }
    }
}
