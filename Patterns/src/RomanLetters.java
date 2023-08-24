class RomanLetters {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
    public static int romanToInt(String s) {
        int total = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
            int value = 0;
            switch(ch) {
                case 'I':
                    if (i+1 < s.length() && s.charAt(i+1) == 'V') {
                        value = 4;
                    }
                    else {
                        value = 1;
                    }
                    break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
                default:
                    value = 0;
                    break;
            }
            total = total + value;
        }
        return total;
    }
}