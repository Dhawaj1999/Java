import java.util.Scanner;

public class J__Triplets {
    public static int triplets(){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter array size : ");
        int size = scan.nextInt();
        int[] array = new int[size];

        int counter = 0;

        System.out.print("enter elements of array : ");
        for (int i = 0; i < size; ++i){
            array[i] = scan.nextInt();
        }

        System.out.print("please enter integer x : ");
        int x = scan.nextInt();

        for (int i = 0; i < size; ++i){
            for (int j = i+1; j < size; ++j){
                for (int k = j+1; k < size; ++k){
                    if ((array[i] + array[j] + array[k]) == x){
                        ++counter;
                    }
                }
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        int triple = triplets();
        System.out.println(triple);
    }
}
