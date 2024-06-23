public class FindDuplicates {
    public static void main(String[] args) {
        String s = "Bengaluru";
        int count[] = new int[256];
        for(int i = 0; i<s.length();i++) {
            char ch = s.charAt(i);
            count[ch]++;
        }
        char arr2[] = new char[s.length()];
        for(int i =0; i<s.length();i++){
            arr2[i] = s.charAt(i);
            int find = 0;
        }
        for (int i =0; i<256;i++) {
            System.out.println(count[i]);
        }
    }
}
