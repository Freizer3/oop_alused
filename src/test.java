/*
 *  täringumäng - näide
 *  autor - Mario Jõelo
 *  ülesanne 3.2
 * */


import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisesta ringide arv: ");
        int ringideArv = sisend.nextInt();
        int uks = 1;
        if (ringideArv % 2 == 0) {
            (ringideArv - uks);
        }
        int ringid = 0;
        int porgandid = 0;
        while (ringid < ringideArv) {
            ringid++;
            porgandid = porgandid + 2;
        }
        System.out.println(porgandid);

    }

    private static void ringideArv(int round) {
    }
}





