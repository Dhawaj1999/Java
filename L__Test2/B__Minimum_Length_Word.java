package L__Test2;

import java.util.Scanner;

public class B__Minimum_Length_Word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("string : ");
        String s = scan.nextLine();

        int start = 0;
        int space = 0;
        int end = s.length();
        int min= Integer.MAX_VALUE;

        for(int i = 0; i<s.length(); i++){
            if (s.charAt(i) == ' '){
                int length = i - space;
                if (length<min){
                    min = length;
                    start = space;
                    end = i;
                }

                space = i+1;
            }
        }

        System.out.println(s.substring(start, end));


    }
}
