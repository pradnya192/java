class Helper {
    public int sum(int a, int b) {
        return a + b;
    }
}

public class NSV {
    public static void main(String[] args) {
        int n = 6, m = 3;
        Helper h = new Helper();
        int s = h.sum(n, m);
        System.out.println("sum is " + s);
    }
}
