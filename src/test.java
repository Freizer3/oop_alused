/*
 *  while tsükkel - näide
 *  autor - Mario Jõelo
 *  ülesanne 3.1
 * */


import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisesta mitu korda tuleb äratada: ");
        int mituKorda = sisend.nextInt();
        int kord = 1;

        while (kord <= mituKorda) {
            System.out.println("Tõuse ja sära!");
            kord++;
        }
    }

}



