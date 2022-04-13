package C13_Heritage;

public class Car extends Vehicle{

    Car(int year, int price) {
        super(year, price);
    }

    @Override
    void start() {
        System.out.println("Vroum vroum");
    }

    @Override
    void accelerate() {
        System.out.println("Vrooom");
    }
    
}
