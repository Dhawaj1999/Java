package M__Recursion;

public class N__Count_zeros {
    public static int countZerosRec(int input, int n){
        if (n == 0){
            return 1;
        }
        // Write your code here
        if (input == 0){
            return 0;
        }
        int smallAns = countZerosRec(input/10, n);
        if (input%10==0){
            return smallAns+1;
        }
        return smallAns;
    }


    public static void main(String[] args) {
        int input = 0;
        int n = input;
        System.out.println(countZerosRec(input, n));
    }
}
