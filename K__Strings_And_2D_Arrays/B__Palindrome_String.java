package K__Strings_And_2D_Arrays;

import java.util.Scanner;

public class B__Palindrome_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hi user, enter the string : ");
        String userInput = scan.next();

        boolean isTrue = true;

        int count = 0;

        int i = 0;
        int j = userInput.length()-1;

       while (i < j){
                if (userInput.charAt(i) != userInput.charAt(j)) {
                    count++;
                    break;
                }
                i++;
                j--;
            }
       if (count == 0){
           System.out.println(isTrue);
       } else {
           isTrue = false;
           System.out.println(isTrue);
       }
    }
}
