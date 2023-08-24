import java.util.Arrays;

class Reverse {
    public static void main(String[] args) {
        reverseString(new char[] {'g', 'a', 'g', 'a', 'n'});
    }
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while (i <= j) {
            swap(s, i, j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(s));
    }

    static void swap(char[] s, int x, int y) {
        char temp = s[x];
        s[x] = s[y];
        s[y] = temp;
    }
}