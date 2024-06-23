public class MaxSumSubArrayOptimised {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 4};
        int ans = maximumSumSubarray(arr, 4);
        System.out.println(ans);
    }

    public static int maximumSumSubarray(int[] arr, int k) {
        int wsum=0, msum=0;
        for(int i=0; i<k; i++) {
            wsum += arr[i];
        }
        for(int end=k; end<arr.length; end++){
            wsum += arr[end] - arr[end-k];
            msum = Math.max(wsum, msum);
        }
        return msum;
    }
}
