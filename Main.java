public class Main {
    public static void main(String[] args) {
        Vehicle tabVehicule[] = new Vehicle[3];

        tabVehicule[0] = new Voiture(100);
        tabVehicule[1] = new Velo(15);
        tabVehicule[2] = new Bateau(40);

        System.out.println(tabVehicule[0].toString(150));
        System.out.println("-------------------------------------------------");
        System.out.println(tabVehicule[1].toString(150));
        System.out.println("-------------------------------------------------");
        System.out.println(tabVehicule[2].toString(150));

        System.out.println("\nEND-OF-CODE\n");
    }
}
