package M__Recursion;

public class H__Check_Number {
    public static boolean checkNum(int[] a, int num){
        if (a.length <= 0){
            return false;
        }

        if (num == a[0]){
            return true;
        }

        int[] b = new int[a.length-1];
        for (int i = 1; i < a.length; i++){
            b[i-1] = a[i];
        }

        boolean temp = checkNum(b, num);
        return temp;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(checkNum(a, 5));
    }
}
