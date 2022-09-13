package M__Recursion;

public class V__Tower_Of_Hanoi {
    public static void tower(int disks, String src, String helper, String dest){
        if (disks == 0){
            return;
        }
        tower(disks-1, src, dest, helper);
        System.out.println(src + " " + dest);
        tower(disks-1, helper, src, dest);
    }
    public static void main(String[] args) {
        tower(3, "a", "b", "c");
    }
}
