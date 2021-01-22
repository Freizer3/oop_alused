public class ads {
    public static void main(String[] args) {
        // loo Konto tüüpi objekt nimega marioKonto
        Konto marioKontoSEB = new Konto("Mario");
        Konto marioKontoSWED = new Konto("Mario");
        // lisan konkreetsed väärtused
        marioKontoSEB.looKonto("Mario", 0.0);
        marioKontoSWED.looKonto("Mario", 0.0);

        marioKontoSEB.lisaRaha(20.0);
        marioKontoSWED.lisaRaha(-50.0);
        // väljastame tulemused
        System.out.println("SEB");
        System.out.println("Konto omanik = " + marioKontoSEB.omanik);
        System.out.println("Konto bilans = " + marioKontoSEB.bilans);
        marioKontoSEB.votaRaha(10.0);
        System.out.println("Konto bilans = " + marioKontoSEB.bilans);
        marioKontoSEB.votaRaha(20.0);
        System.out.println("Konto bilans = " + marioKontoSEB.bilans);
        marioKontoSEB.teeYlekanne(marioKontoSWED, 10.0);
        System.out.println("Konto bilans = " + marioKontoSEB.bilans);
        marioKontoSEB.teeYlekanne(marioKontoSWED, 10.0);
        System.out.println("Konto bilans = " + marioKontoSEB.bilans);
        System.out.println();
        System.out.println("SWED");
        System.out.println("Konto omanik = " + marioKontoSWED.omanik);
        System.out.println("Konto bilans = " + marioKontoSWED.bilans);
    }
}