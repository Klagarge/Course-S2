package C10_Tri_et_complexite.C103_Algorithme_de_tri;

public class Selection {

    Selection(int[] a){
        Short.printList(a);

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

        Short.printList(a);
    }
}
