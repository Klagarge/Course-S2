package Series.S08;

public class S08EX02b {
    public static void main(String[] args) {
        int x = 2;
        int n = 8;

        System.out.println(x + " puissance " + n + " = " + power(x, n));
    }

    static long power(int x, int n){
        if (n <= 0) return 1;
        if (n == 1) return x;

        return x * power(x, n-1);
    }
}
