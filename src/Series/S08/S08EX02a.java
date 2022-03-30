package Series.S08;

public class S08EX02a {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factoriel de " + n + " = " + fact(n));
    }

    static long fact(int n){
        if (n <= 1) return 1;
        
        return n*fact(n-1);
    }
}
