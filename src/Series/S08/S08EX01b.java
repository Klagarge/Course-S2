package Series.S08;

public class S08EX01b {
    public static void main(String[] args) {
        System.out.println("Result: " + f2(6,5));
    }

    static int f2(int x, int y){
        if (x <= 0) return 0;
        if (y >= x) return 1 + f2(y,x);

        return 2 + f2(x-3,y-1);
    }
}
