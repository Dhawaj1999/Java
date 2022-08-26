package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class P__Compress_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("String : ");
        String st = scan.next();

        String result = " ";

        for (int i = 0; i < st.length(); i++){
            int counter = 1;
            while (i < st.length()-1 && st.charAt(i) == st.charAt(i+1)){
                counter++;
                i++;
            }

            result = result + st.charAt(i);

            if (counter > 1){
                result = result + counter;
            }
        }
        System.out.println(result);
    }
}
