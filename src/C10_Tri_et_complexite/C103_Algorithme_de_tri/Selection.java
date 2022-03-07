package C10_Tri_et_complexite.C103_Algorithme_de_tri;

import java.util.Random;

// Tri d'un tableau;

public class Selection {

    public static void main(String[] args) throws Exception {
        new Selection(100);
    }

    Selection(int n){
        int[] a = newList(n);
        printList(a);
        for (int i = 0; i < a.length-1; i++) {
            int min = a[i];
            int iMin = i;
            for (int j = i; j < a.length; j++) {
                if(a[j] < min){
                    min = a[j];
                    iMin = j;
                }
            }
            int tmp = a[i];
            a[i] = a[iMin];
            a[iMin] = tmp;
        }
        printList(a);
    }

    int[] newList(int size){
        int[] a = new int[size];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1000);
        }
        return a;
    }

    static void printList(int[] a){
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
