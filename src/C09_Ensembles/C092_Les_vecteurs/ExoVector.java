package C09_Ensembles.C092_Les_vecteurs;

import java.util.Vector;

public class ExoVector {
    public static void main(String[] args) throws Exception {
        Vector<Integer> v = new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);

        System.out.println("Element pos.0: " + v.get(0));

        System.out.println("Value 3 on pos." + v.indexOf(3));

        v.remove(2);
        System.out.print("Valut of the vector:");
        for (Integer integer : v) {
            System.out.print(" " + integer);
        }
        System.out.println("");

        Vector<Integer> w = new Vector<>();
        w.add(1);
        w.add(3);
        w.add(4);


        Vector<Integer> i = v;
        i.retainAll(w);
        System.out.print("Valut of intersection:");
        for (Integer integer : v) {
            System.out.print(" " + integer);
        }
    }
}
