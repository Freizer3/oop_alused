public class Toode {
    public String Nimi;
    public double hind;
    public int kogus;

    public Toode(String nimetus, double hind, int kogus) {
        this.Nimi = nimetus;
        this.hind = hind;
        this.kogus = kogus;
    }

    public void valjastaToode(String tooteNimetus, Double hindSisestus, int kogusSisestus) {
        this.Nimi = tooteNimetus;
        this.hind = hindSisestus;
        this.kogus = kogusSisestus;
    }

}
