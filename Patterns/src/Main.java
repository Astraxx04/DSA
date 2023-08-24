public class Main {
    public static void main(String[] args) {
//        pattern1(5);
//        System.out.println();
//        pattern2(5);
//        System.out.println();
//        pattern3(5);
//        System.out.println();
//        pattern4(5);
//        System.out.println();
//        pattern5(5);
//        System.out.println();
//        pattern28(5);
//        System.out.println();
//        pattern30(5);
//        System.out.println();
        pattern17(5);
        System.out.println();
        pattern31(4);
        System.out.println();
        pattern32(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row > n ? 2*n-row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row > n ? 2*n-row : row;
            int noOfSpaces = n - totalColsInRow;

            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 0; s < n - row; s++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2*n-1; row++) {
            int totalColsInRow = row > n ? 2*n-row : row;
            for (int s = 0; s < n - totalColsInRow; s++) {
                System.out.print("  ");
            }
            for (int col = totalColsInRow; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= totalColsInRow; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {
        n= 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int num = Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static void pattern32(int n) {
        int ogN = n;
        n= 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int num = ogN - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
