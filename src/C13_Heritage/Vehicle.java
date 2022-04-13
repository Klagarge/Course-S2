package C13_Heritage;

public abstract class Vehicle {
    private static int nVehicle;
    private int matricule;
    private int year;
    private int price;

    Vehicle(int year, int price){
        this.year = year;
        this.price = price;
        nVehicle++;
        this.matricule = nVehicle;
    }

    abstract void start();
    abstract void accelerate();

    @Override
    public String toString() {
        return "Vehicle " + matricule + ". Built in " + year + ", price: " + price;
    }

}
