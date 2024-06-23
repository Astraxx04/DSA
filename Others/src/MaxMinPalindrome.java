import java.util.List;

public class MaxMinPalindrome {
    public static void main(String[] args) {
        String s = "abababababa";
        int maxLength = 0;
        int minLength = 1000;
        String maxString = new String();
        String minString = new String();
        String strSub[] = new String[s.length()];
        for(int i = 1; i < s.length(); i++){
            String sub = s.substring(0, i);
            String str = isPalindrome(sub);
            if(str.length() > maxLength) {
                maxString = str;
                maxLength = str.length();
            }
            if(str.length() < minLength) {
                minString = str;
                minLength = str.length();
            }
        }
        System.out.println(minString);
        System.out.println(maxString);
    }
    static String isPalindrome(String s){
        int l = s.length();
        int start = 0;
        int end = l-1;
        while(start>end) {
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            }else {
                return "";
            }
        }
        return s;
    }
}
