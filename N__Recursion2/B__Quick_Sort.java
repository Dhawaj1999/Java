package N__Recursion2;

public class B__Quick_Sort {
    public static void quickSort(int[] arr, int low, int high){
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++){
            if (arr[j] < pivot){
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        // return pivot index
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 6, 7, 0, 3};
        quickSort(arr, 0, arr.length-1);

        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
