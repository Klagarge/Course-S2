package C13_Heritage;

public class House extends Building{
    private int nRooms;
    House(String address, int nRooms){
        super(address);
        this.nRooms = Math.abs(nRooms);
    }

    public void setnRooms(int nRooms) {
        this.nRooms = Math.abs(nRooms);
    }
    public int getnRooms() {
        return nRooms;
    }

    @Override
    public String toString() {
        return super.toString() + "#" + nRooms;
    }

}
