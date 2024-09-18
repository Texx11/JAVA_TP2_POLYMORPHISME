public class Velo extends  Vehicle{
    public Velo(double vitesseMoyenne) {
        super(vitesseMoyenne);
    }

    @Override
    public double calculerTempsTrajet(double distance) {
        return distance / super.getVitesseMoyenne();
    }

    @Override
    public String toString(double distance) {
        return "Type de véhicule: Voiture\n" + super.toString(distance);
    }
}
