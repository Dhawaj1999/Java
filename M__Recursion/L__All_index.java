package M__Recursion;

public class L__All_index {
    public static int[] helper(int input[], int x, int startIndex, int foundSoFar){
        if (startIndex == input.length){
            int newArray[] = new int[foundSoFar];
            return newArray;
        }
        if (input[startIndex] == x){
            foundSoFar++;
        }
        int smallAns[] = helper(input, x, startIndex+1, foundSoFar);
        if (input[startIndex] == x){
            smallAns[foundSoFar-1] = startIndex;
        }
        return smallAns;
    }
    public static int[] allIndexes(int input[], int x) {
        return helper(input,x,0,0);

    }

    public static void main(String[] args) {
        int[] input = {1,0,3,4,5,3,2,3};
        int x = 3;
        int[] out = allIndexes(input, x);
        for (int val : out){
            System.out.print(val + " ");
        }
    }
}
