public abstract class Vehicle {
    protected double vitesseMoyenne;

    public Vehicle(double vitesseMoyenne) {
        this.vitesseMoyenne = vitesseMoyenne;
    }

    public abstract double calculerTempsTrajet(double distance);

    public void setVitesseMoyenne(double vitesseMoyenne) {
        this.vitesseMoyenne = vitesseMoyenne;
    }
    public double getVitesseMoyenne() {
        return vitesseMoyenne;
    }
}
