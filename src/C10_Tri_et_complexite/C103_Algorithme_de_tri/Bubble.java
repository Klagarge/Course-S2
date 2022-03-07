package C10_Tri_et_complexite.C103_Algorithme_de_tri;

public class Bubble {
    
    Bubble(int[] a){
        Short.printList(a);

        boolean shorted = false;
        while (shorted == false) {
            shorted = true;
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] > a[i+1]) {
                    int tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                    shorted = false;
                }
            }
        }

        Short.printList(a);
    }
}
