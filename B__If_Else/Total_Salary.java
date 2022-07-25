package B__If_Else;

import java.util.Scanner;

public class Total_Salary {
    public static void main(String[] args) {
        System.out.println("This program calculate Total salary");
        Scanner scan = new Scanner(System.in);
        System.out.print("enter basic salary : ");
        int basic = scan.nextInt();
        System.out.print("enter grade(A, B or C) in Uppercase letter : ");
        char grade = scan.next().charAt(0);
        int allow;
        int hra = (basic * 20 / 100);
        int da = (basic * 50 / 100);
        int pf = (basic * 11 / 100);


        if (grade == 'A'){
            allow = 1700;
            int totalSalary = basic + hra + da + allow - pf;
            System.out.println("Total salary is " + totalSalary);
        } else if (grade == 'B'){
            allow = 1500;
            int totalSalary = basic + hra + da + allow - pf;
            System.out.println("Total salary is " + totalSalary);
        } else if (grade == 'C'){
            allow = 1300;
            int totalSalary = basic + hra + da + allow - pf;
            System.out.println("Total salary is " + totalSalary);
        } else {
            System.out.println("invalid input");
        }
    }
}
