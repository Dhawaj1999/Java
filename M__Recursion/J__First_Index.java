package M__Recursion;

public class J__First_Index {
    public static int firstIndex(int[] a, int startIndex, int x){
        if (startIndex > a.length-1){
            return -1;
        }

        if (a[startIndex] == x){
            return startIndex;
        }

        int temp = firstIndex(a, startIndex+1, x);
        return temp;
    }

    public static int giveAns(int[] a){
        return firstIndex(a, 0,11);
    }

    public static void main(String[] args) {
        int[] a = {9,8,10,8};
        System.out.println(giveAns(a));
    }
}
