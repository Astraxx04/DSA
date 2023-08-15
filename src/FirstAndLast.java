public class FirstAndLast {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 5, 5, 5, 7, 8};
        searchRange(num, 5);
    }
    static void searchRange(int[] numb, int target) {
        int ans[] = {-1, -1};
        ans[0] = search(numb, target, true);
        if(ans[0] != -1) {
            ans[1] = search(numb, target, false);
        }
        System.out.println(ans[0]+ " " +ans[1]);
    }

    static int search(int[] numb, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = numb.length-1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(target < numb[mid]) {
                end = mid - 1;
            }
            else if (target > numb[mid]) {
                start = mid + 1;
            }
            else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
