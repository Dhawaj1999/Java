package M__Recursion;

public class H__Check_Number {
    public static int sortedArray(int[] array, int startIndex, int x){
        if(startIndex == array.length){
            return -1;
        }

        if (array[startIndex] == x){
            return startIndex;
        }

        return sortedArray(array, startIndex+1, x);
    }

    public static int takeInput(int[] array){
        return sortedArray(array, 0, 3);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,8,4};
        System.out.println(takeInput(array));
    }
}
