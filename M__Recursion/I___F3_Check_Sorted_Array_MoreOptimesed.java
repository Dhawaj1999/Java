package M__Recursion;

public class I___F3_Check_Sorted_Array_MoreOptimesed {
    public static boolean checkSortedBetter(int[] array, int startIndex){
        if (startIndex == array.length-1){
            return true;
        }
        if (array[startIndex] > array[startIndex+1]){
            return false;
        }

        boolean temp = checkSortedBetter(array, startIndex+1);
        return temp;
    }

    public static boolean checkSorted(int[] array){

        return checkSortedBetter(array, 0);
    }
    public static void main(String[] args) {
            int[] a = {1,2,3};
        System.out.println(checkSorted(a));
    }
}
