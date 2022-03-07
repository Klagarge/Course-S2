package C10_Tri_et_complexite.C103_Algorithme_de_tri;

import java.util.Random;

import tools.Chrono;

public class Short {
    private static boolean print = false;
    public static void main(String[] args) {
        int[] a = newList(1000);

        
        Chrono selection = new Chrono("Selection");
        new Selection(a.clone());
        selection.stop();

        if(print) System.out.println("-----------\n");

        Chrono bubble = new Chrono("Bubble");
        new Bubble(a.clone());
        bubble.stop();

        System.out.println(selection);
        System.out.println(bubble);
    }

    private static int[] newList(int size){
        int[] a = new int[size];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1000);
        }
        return a;
    }

    static void printList(int[] a){
        if (print) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
    }

    
}
