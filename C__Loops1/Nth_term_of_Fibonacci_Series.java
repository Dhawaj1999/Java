package C__Loops1;

public class Nth_term_of_Fibonacci_Series {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int z = 0;
        int n = 6;

        for (int term = 1; term <= n; ++term){
            x = y;
            y = z;
            z = x + y;
            System.out.println(z);
        }
    }
}
