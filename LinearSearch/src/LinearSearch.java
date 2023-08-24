public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int ans = LinSearch(arr, 5);
        System.out.println(ans);
    }
    static int LinSearch(int[] arr, int ele){
        if(arr.length == 0){
            return -1;
        }
        for (int i=0; i<arr.length;i++){
            if(arr[i]==ele)
                return i;
        }
        return -1;
    }
}
