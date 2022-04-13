package C13_Heritage;

public class Test {
    public static void main(String[] args) {
        Car suzuki = new Car(2003, 4000);
        Truck tracteur = new Truck(2020, 12000);
        Car citroen = new Car(2006, 8000);

        System.out.println(suzuki);
        System.out.println(tracteur);
        System.out.println(citroen);
        
    }
}
