public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr1[] = {2,4,6,7,9,12,23,33};
        int arr2[] = {99,34,23,12,8,7,3,1};
        int target = 8;
        System.out.println(orderAgnosticBS(arr2, target));
    }

    static int orderAgnosticBS(int arr[], int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

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
        return -1;
    }
}
