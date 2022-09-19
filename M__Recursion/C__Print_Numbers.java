package M__Recursion;

public class C__Print_Numbers {

    // print 1 to n
    public static void print(int start, int n){
        if (start == n){
            System.out.println(start);
            return;
        }
        System.out.print(start + " ");
        print(start+1, n);
    }

    // print n to 1
    public static void printReverse(int n){
        if (n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printReverse(n-1);
    }

    public static void main(String[] args) {
        print(1, 5);
        printReverse(5);
    }
}
