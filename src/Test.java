

public class Test {
    public static void main(String[] args) {


        Inimene matti = new Inimene("Matti");
        Inimene john = new Inimene("John");

        matti.setPikkus(180);
        matti.setMass(50);

        john.setPikkus(175);
        john.setMass(64);

        System.out.printf(matti.getNimi() + ", kehamassiindeks: " + "%5.2f%n", matti.kmi());
        System.out.printf(john.getNimi() + ", kehamassiindeks: " + "%5.2f%n", john.kmi());
        matti.normaalKaal();
        System.out.printf(matti.getNimi() + ", kehamassiindeks: " + "%.2f%n", matti.kmi());
    }
}