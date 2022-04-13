package C13_Heritage;

public class Truck extends Vehicle{

    Truck(int year, int price) {
        super(year, price);
    }

    @Override
    void start() {
        System.out.println("Peuf-peuf");
    }

    @Override
    void accelerate() {
        System.out.println("Broum");
    }
    
}
