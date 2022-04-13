package C13_Heritage;

public class Building {
    private String address;

    Building(){

    }
    Building(String address){
        this.address = address;
    }

    void setAddress(String address){
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return Building.class.getName() + "@" + address;
    }
}
