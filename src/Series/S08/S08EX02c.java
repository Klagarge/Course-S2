package Series.S08;

public class S08EX02c {
    public static void main(String[] args) {
        String dep = "1234";
        System.out.println(dep + " -> " + stringsep(dep));
    }

    static String stringsep(String s){
        if (s == null) return null;
        if (s.length() <= 1) return s;

        return "" + s.charAt(0) + ',' + stringsep(s.substring(1));
    }


}
