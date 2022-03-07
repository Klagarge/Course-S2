package C10_Tri_et_complexite.C102_Complexite_algorithmique;

// Nombre de poignées de mains échangées pour n personnes.
public class Poignee_de_main {

    public static void main(String[] args) throws Exception {
        new Poignee_de_main(10);
    }

    private int n;
    private long checks = 0;

    Poignee_de_main(int n){
        this.n = n;
        compute();
        System.out.println("Poignées de mains échangée: " + checks);
    }

	private void compute() {
        for (int i = n-1; i >= 1; i--) {
            checks += i;
        }
	}
}
