

public class Ristkylik {
    private double Laius;
    private double Korgus;

    public double getLaius() {
        return this.Laius;
    }

    public void setLaius(double Laius) {
        this.Laius = this.vaartusteKontroll(Laius);
    }

    public double getKorgus() {
        return this.Korgus;
    }

    public void setKorgus(double Korgus) {
        this.Korgus = this.vaartusteKontroll(Korgus);
    }

    private double vaartusteKontroll(double vaartus) {
        if (vaartus < 0.0) {
            return Math.abs(vaartus);
        }
        return vaartus;
    }

    @Override
    public String toString() {
        return "Ristkülik: " + this.Laius + " x " + this.Korgus;
    }
}
