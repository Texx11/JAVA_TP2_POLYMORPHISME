public abstract class Vehicle {
    protected double vitesseMoyenne;

    public Vehicle(double vitesseMoyenne) {
        this.vitesseMoyenne = vitesseMoyenne;
    }

    public abstract double calculerTempsTrajet(double distance);

    public String toString(double distance) {
        double temps = calculerTempsTrajet(distance); // Utilise la méthode abstraite à implémenter
        return "Vitesse Moyenne: " + vitesseMoyenne + " km/h\n" + "Distance: " + distance + " km\n" + "Temps estimé: " + temps + " heures";
    }

    public void setVitesseMoyenne(double vitesseMoyenne) {
        this.vitesseMoyenne = vitesseMoyenne;
    }
    public double getVitesseMoyenne() {
        return vitesseMoyenne;
    }
}
