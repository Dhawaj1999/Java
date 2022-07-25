package A__GettingStarted;

public class ConvertDistance {
    public static void main(String[] args) {
        // all units are in meters
        // convert i in km, j in cm, k in mm, l in inches
        double i,j,k,l;
        i = 100;
        j = 500;
        k = 600;
        l = 550;
        double km = (i/1000);
        double cm = (j*100);
        double mm = (k*1000);
        double inch = (l*39.37);
        System.out.println(km + " km");
        System.out.println(cm + " cm");
        System.out.println(mm + " mm");
        System.out.println(inch + " inch");
    }
}
