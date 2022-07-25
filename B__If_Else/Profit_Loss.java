package B__If_Else;
import java.util.Scanner;
public class Profit_Loss {
    public static void main(String[] args) {
        // calculate profit and loss

        Scanner scan = new Scanner(System.in);
        System.out.print("enter cost price : ");
        double cp = scan.nextDouble();
        System.out.print("enter selling price : ");
        double sp = scan.nextDouble();

        if (cp > sp){
            System.out.println("loss of Rupees " + (cp-sp));
        } else if (sp > cp){
            System.out.println("profit of Rupees " + (sp-cp));
        } else {
            System.out.println("no profit or loss");
        }
    }
}
