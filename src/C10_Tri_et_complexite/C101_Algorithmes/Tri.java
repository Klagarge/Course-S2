package C10_Tri_et_complexite.C101_Algorithmes;

// Tri d'un tableau;

public class Tri {

    static int [] a = {4, 7, 1, 3, 6};

    static void printList(int[] a){
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) throws Exception {
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
}
