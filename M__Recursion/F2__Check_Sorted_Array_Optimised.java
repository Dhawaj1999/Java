package M__Recursion;

public class F2__Check_Sorted_Array_Optimised {
    public static boolean checkSorted(int[] array){
        if (array.length <= 1){
            return true;
        }

        if (array[0] > array[1]){
            return false;
        }

        int[] smallArr = new int[array.length-1];

        for (int i = 1; i < array.length; i++){
            smallArr[i-1] = array[i];
        }

        boolean answer = checkSorted(smallArr);
        return answer;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(checkSorted(array));
    }
}
