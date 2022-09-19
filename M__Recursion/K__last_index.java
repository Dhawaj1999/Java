package M__Recursion;

public class K__last_index {
    public static int sortedArray(int[] array, int lastIndex, int x){
        if (lastIndex < 0){
            return -1;
        }

        if (array[lastIndex] == x){
            return lastIndex;
        }
        return sortedArray(array, lastIndex-1, x);
    }

    public static int takeInput(int[] array){
        return sortedArray(array, array.length-1, 3);
    }

    public static void main(String[] args) {
        int[] array = {10,8,3,2,5,3};
        System.out.println(takeInput(array));
    }
}
