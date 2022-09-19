package M__Recursion;

public class J__First_Index {
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
        return sortedArray(array, 0, 8);
    }

    public static void main(String[] args) {
        int[] array = {9,8,10,8};
        System.out.println(takeInput(array));
    }
}
