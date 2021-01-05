/*
 *  Muutujate kasutamise näide
 *  autor - Mario Jõelo
 *  ülesanne 1.4a
 * */


import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage ainepunktide arv: ");
        int aine = sisend.nextInt();
        int tund = Math.multiplyExact(aine, 26);
        System.out.println("Sisestage nädalate arv: ");
        int nadal = sisend.nextInt();
        float tulemus = Math.floorDiv(tund, nadal);
        System.out.println(tulemus);
    }
    }

