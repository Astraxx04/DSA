import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 77, 34, 25, -32, -12, -6};
        decSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void decSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int first = i;
            int maxIndex = getMaxIndex(arr, first, arr.length-1);
            swap(arr, maxIndex, first);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
