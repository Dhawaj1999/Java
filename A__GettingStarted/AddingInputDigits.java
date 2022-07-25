package A__GettingStarted;

import java.util.Scanner;
public class AddingInputDigits {
    public static void main(String[] args) {
        // take input between 0-1000 and print sum of the digits

        Scanner scan = new Scanner(System.in);
        System.out.print("type a number between 0 to 1000 : ");
        int num = scan.nextInt();

       int firstDigit = num % 10;
       int remainingNumber = num / 10;
       int secondDigit = remainingNumber % 10;
       remainingNumber = remainingNumber / 10;
       int thirdDigit = remainingNumber % 10;
       remainingNumber = remainingNumber / 10;
       int fourthDigit = remainingNumber % 10;
       int add  = firstDigit + secondDigit + thirdDigit + fourthDigit;
        System.out.println(add);


    }
}
