package M__Recursion;

public class O__Geometric_Sum {
    public static double findGeometricSum(int n) {


        if(n==0) {
            return 1;
        }
        double temp = 1/Math.pow(2, n) + findGeometricSum(n-1);
        return temp;

    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(findGeometricSum(n));
    }
}
