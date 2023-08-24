import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] arr) {
        int i =0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1) {
                return new int[] {arr[j], j+1};
            }
        }
        return new int[] {-1, -1};
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

// Cyclic Sort Algorithm