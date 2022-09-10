package M__Recursion;

public class G__Sum_Of_Array {

    public static int sum(int[] array){
        if (array.length == 1){
            return array[0];
        }

        int[] smallArray = new int[array.length-1];
        for (int i = 1; i < array.length; i++){
            smallArray[i-1] = array[i];
        }

        int temp = sum(smallArray);
        temp = temp + array[0];
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7};
        System.out.print(sum(arr));
    }
}
