package N__Recursion2;

public class A__Merge_Sort {

    public static void conquer(int[] arr, int si, int mid, int ei){
        int[] merged = new int[ei-si+1];

        int i = si;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= ei){
            if (arr[i] < arr[j]){
                merged[k] = arr[i];
                i++;
                k++;
            }
            else{
                merged[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid){
            merged[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ei){
            merged[k] = arr[j];
            j++;
            k++;
        }

        for (int index = 0; index < merged.length; index++){
            arr[si+index] = merged[index];
        }
    }
    public static void divide(int[] arr, int si, int ei){
        if (si >= ei){
            return;
        }

        int mid = (si + ei)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] arr = {7,3,2,1,9,10};
        divide(arr, 0, arr.length-1);

        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
