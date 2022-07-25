package F__Pattern_Problems_advanced;
public class Pascal_Triangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; ++i){
            // 5 C 0 == 1 == val
            int val = 1;
            for (int space = 1; space <= n-i; ++space){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; ++j){
                System.out.print(val + " ");
                int combination = val * (i-j)/(j+1);
                val = combination;
            }
            System.out.println();
        }
    }
}
