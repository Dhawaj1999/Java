package M__Recursion;

public class K__last_index {
    public static int lastIndex(int[] a, int lastIndex, int x){
        if (lastIndex < 0){
            return -1;
        }

        if (a[lastIndex] == x){
            return lastIndex;
        }

        int tempo = lastIndex(a, lastIndex-1, x);
        return tempo;
    }

    public static int output(int[] array){
        return lastIndex(array, array.length-1, 3);
    }
    public static void main(String[] args) {
        int[] a = {1,3,5,3,6};
        System.out.println(output(a));
    }
}
