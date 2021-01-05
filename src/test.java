/*
 *  Muutujate kasutamise näide
 *  autor - Mario Jõelo
 *  ülesanne 2.1
 * */


import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Palun sisesta pilvede kõrgus: ");
        // salvestame kasutaja sisestatud väärtuse
        double pilvedeKorgus = sisend.nextInt();
        // kontroll
        if (pilvedeKorgus > 6.0) {
            System.out.println("Need on ülemised pilved");
        } else {
            System.out.println("Need ei ole ülemised pilved");
        }
    }
}
