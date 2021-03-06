public class KahanevLoendur {
    private int vaartus;   // objekti muutuja (atribuut), mis hoiab meeles loenduri väärtust
    private int algvaartus;

    public KahanevLoendur(int vaartusAlguses) {
        this.vaartus = vaartusAlguses;
        this.algvaartus = vaartusAlguses;
    }

    public void valjastaVaartus() {
        System.out.println("väärtus: " + this.vaartus);
    }

    public void kahane() {
        if (vaartus > 0) {
            this.vaartus = vaartus - 1;
        } else {
            System.out.println("Loendur ei saa minna negatiivseks.");
        }
        // kirjuta siia kood, mille abil loenduri vaartus väheneb 1 võrra
    }

    public void reset() {
        this.vaartus = 0;
    }

    public void algvaartuseta() {
        this.vaartus = this.algvaartus;
    }
    // ja siia ülejäänud vajalikud meetodid
}
