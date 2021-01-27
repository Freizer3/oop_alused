public class Inimene {
    public String nimi;
    private double mass = 0;
    private double pikkus = 0;

    public Inimene(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getPikkus() {
        return pikkus;
    }

    public void setPikkus(double pikkus) {
        this.pikkus = pikkus / 100;
    }

    public double kmi() {
        double indeks = this.mass / (this.pikkus * this.pikkus);
        return indeks;
    }
}
