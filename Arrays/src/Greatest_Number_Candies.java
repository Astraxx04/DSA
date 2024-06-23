import java.util.ArrayList;
import java.util.List;

public class Greatest_Number_Candies {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr, 3));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int total = 0;
        for (int i = 0; i < candies.length; i++) {
            total = candies[i] + extraCandies;
            list.add(check(candies, total));
        }
        return list;
    }

    static boolean check(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > value) {
                return false;
            }
        }
        return true;
    }
}
