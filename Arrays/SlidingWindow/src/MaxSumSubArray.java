public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 4};
        int ans = getMaxSumSubArrayOfSizeK(arr, 4);
        System.out.println(ans);
    }
    public static int getMaxSumSubArrayOfSizeK(int[] arr, int k) {
        int maxsum = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            int windowSum = 0;
            for (int j = i; j < i + k; j++) {
                windowSum += arr[j];
            }
            maxsum = Math.max(maxsum, windowSum);
        }
        return maxsum;
    }
}
