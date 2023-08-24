import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        List<Integer> list = new ArrayList<Integer>();
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
                list.add(j+1);
            }
        }
        return list;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

// Cyclic Sort Algorithm