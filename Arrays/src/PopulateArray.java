import java.util.Arrays;

public class PopulateArray {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = 0;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
