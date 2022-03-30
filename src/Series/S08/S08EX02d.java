package Series.S08;

public class S08EX02d {
    public static void main(String[] args) {
        char l = 'f';
        System.out.println(l + " -> " + letters(l));
    }

    static String letters(char l){
        if (l == 0) return null;
        if (l == 'a') return String.valueOf(l);

        return letters((char)(l-1)) + l;
    }
}
