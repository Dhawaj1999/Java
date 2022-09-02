package L__Test2;

import java.util.Scanner;

public class A__Leaders_In_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter array size : ");
        int size = scan.nextInt();

        int[] a = new int[size];

        int i;
        int j;

        for (i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
        }

        for (i = 0; i < a.length; i++){
            for (j = i+1; j < a.length; j++){
                if (a[i] < a[j]){
                   break;
                }
            }
            if (j == a.length){
                System.out.print(a[i] + " ");
            }
        }
    }
}
