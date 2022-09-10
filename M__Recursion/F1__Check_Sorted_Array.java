package M__Recursion;

public class F1__Check_Sorted_Array {
    public static boolean checkSorted(int[] array){
        if (array.length <= 1){
            return true;
        }

        int[] smallArray = new int[array.length-1];
        for (int i = 1; i < array.length; i++){
            smallArray[i-1] = array[i];
        }
        boolean print = checkSorted(smallArray);
        if(!print){
            return false;
        }
        if (array[0] <= array[1]) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] array = {2,1,3,6,9};
        boolean trueOrFalse = checkSorted(array);
        System.out.println(trueOrFalse);
    }
}
