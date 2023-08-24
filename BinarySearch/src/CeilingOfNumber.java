// Smallest number greater than or equal to the target
public class CeilingOfNumber {
    public static void main(String[] args) {
        int arr1[] = {2,4,6,7,9,12,23,33};
        int arr2[] = {99,34,23,12,8,7,3,1};
        int target = 34;
        System.out.println(orderAgnosticBS(arr1, target));
    }

    static int orderAgnosticBS(int arr[], int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        if(target > arr[arr.length - 1]) {
            return -1;
        }

        while(start <= end) {
            // int mid = (start + end)/2; May exceed the int range
            int mid = start + (end - start)/2;

            if(target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        if (isAsc) {
            return arr[start];
        }
        else {
            return arr[end];
        }
    }
}
