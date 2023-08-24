public class RecBinSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(binarySearch(arr, 5, 0, arr.length-1 ));
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        if(s > e) {
            return -1;
        }
        int mid = s + (e - s)/2;
        if(target < arr[mid]) {
            return binarySearch(arr, target, s,  mid-1);
        }
        if(target > arr[mid]) {
            return binarySearch(arr, target, mid+1, e);
        }
        return mid;
    }
}
