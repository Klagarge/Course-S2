package C13_Heritage;

public class App {
    public static void main(String[] args) {
        House maison = new House("Route du stade 30", 5);
        House gp = new House(null, 0);
        Building hes = new Building("Rue de l'industrie");
        Building alpolEPFL = new Building();

        System.out.println(maison.toString());
        System.out.println(gp.toString());
        System.out.println(hes.toString());
        System.out.println(alpolEPFL.toString());

        gp.setAddress("Toulouse");
        gp.setnRooms(4);
        alpolEPFL.setAddress("Sion");

        System.out.println(gp.toString());
        System.out.println(alpolEPFL.toString());
    }
}
