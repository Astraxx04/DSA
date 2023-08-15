class a {
    a(int x, int y) {
        System.out.println(x + " " + y);
    }
}

class b extends a {
    b(int x, int y, int z) {
        super(x, y);
        System.out.println(x + " " + y + " " + z);
    }
}

class c extends b {
    c(int x, int y, int z, int a) {
        super(x, y, z);
        System.out.println(x + " " + y + " " + z + " " + a);
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        c e1 = new c(1, 2, 3, 4);
    }
}
