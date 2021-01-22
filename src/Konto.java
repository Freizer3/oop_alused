public class Konto {
    // muutujad
    public String omanik;
    public Double bilans;

    // konstruktor
    public Konto(String omanikuNimi) {
        this.omanik = omanikuNimi;
        this.bilans = 0.0;
    }

    // meetodid
    public void looKonto(String omanikuNimi, Double summa) {
        this.omanik = omanikuNimi;
        this.bilans = summa;
    }

    public boolean lisaRaha(Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivne summa pole võimalik lisada");
            return false;
        } else {
            this.bilans = this.bilans + summa;
            System.out.println("Kontole lisatud summa " + summa);
            return true;
        }
    }

    public boolean votaRaha(Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivne summa pole võimalik võta");
            return false;
        } else {
            if (summa <= this.bilans) {
                this.bilans = this.bilans - summa;
                System.out.println("Kontost võetud maha " + summa);
                return true;
            } else {
                System.out.println("Kontol ei ole piisav raha");
                return false;
            }
        }
    }

    public boolean teeYlekanne(Konto teineKonto, Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivne summa pole võimalik kanda üle");
            return false;
        } else {
            if (summa <= this.bilans) {
                this.bilans = this.bilans - summa;
                teineKonto.bilans = teineKonto.bilans + summa;
                System.out.println("Kantud üle " + summa);
                return true;
            } else {
                System.out.println("Kontol ei ole piisavalt raha");
                return false;
            }
        }
    }
}