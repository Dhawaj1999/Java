package M__Recursion;

public class N__Count_zeros {
    public static int countZeros(int n) {
        if (n == 0){
            return 0;
        }
        int temp = countZeros(n/10);
        if (n%10==0){
            return temp+1;
        }
        return temp;
    }

    public static void main(String[] args) {
        int n = countZeros(1020300);
        System.out.println(n);
    }
}
