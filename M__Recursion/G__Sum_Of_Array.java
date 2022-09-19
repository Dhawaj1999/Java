package M__Recursion;

public class G__Sum_Of_Array {

    public static int sortedArray(int[] array, int startIndex){
        if (startIndex == array.length-1){
            return array[array.length-1];
        }
        int temp = sortedArray(array, startIndex+1);
        return temp + array[startIndex];
    }

    public static int takeInput(int[] array){
        return sortedArray(array, 0);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,8,4};
        System.out.println(takeInput(array));
    }
}
