public class Toode {
    public String Nimi;
    public double hind;
    public int kogus;

    public Toode(String nimetus, double hind, int kogus) {
        this.Nimi = nimetus;
        this.hind = hind;
        this.kogus = kogus;
    }

    public void valjastaToode() {
        System.out.println(this.Nimi + ", " + this.hind + "€, " + this.kogus);
    }

}
