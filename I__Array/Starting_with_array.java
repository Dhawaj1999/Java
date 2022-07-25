package I__Array;

public class Starting_with_array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for (int i = 0; i < 5; ++i){
            System.out.print(numbers[i] + " ");
        }
    }
}
