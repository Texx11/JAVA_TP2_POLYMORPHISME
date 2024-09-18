public class Voiture extends Vehicle {

    public Voiture(double vitesseMoyenne) {
        super(vitesseMoyenne);
    }

    @Override
    public double calculerTempsTrajet(double distance) {
        super.setVitesseMoyenne(100);
        return distance / super.getVitesseMoyenne();
    }
}
