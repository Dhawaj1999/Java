package M__Recursion;

public class L__All_index {
    public static void allIndexes(int[] a, int startIndex, int x){
        if (startIndex > a.length-1){
            return;
        }

        if (a[startIndex] == x){
            System.out.println(startIndex);
        }

        allIndexes(a, startIndex+1, 2);
    }

    public static void giveans(int[] a){
        allIndexes(a, 0, 2);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,1,2};
        giveans(arr);
    }
}
