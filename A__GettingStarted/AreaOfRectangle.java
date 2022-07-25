package A__GettingStarted;

public class AreaOfRectangle {
    public static void main(String[] args) {
        // area and perimeter of rectangle
        double length = 15;
        double width = 15;
        double area1 = (length * width);
        double perimeter = 2 * (length + width);
        System.out.println(area1);
        System.out.println(perimeter);

        // area and circumference of circle
        double radius = 7;
        double area2 = (3.14 * radius * radius);
        double circumference = (2 * 3.14 * radius);
        System.out.println(area2);
        System.out.println(circumference);
    }
}
