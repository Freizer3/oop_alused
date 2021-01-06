/*
 *  täringumäng - näide
 *  autor - Mario Jõelo
 *  ülesanne 3.3
 * */


import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Täringute arv: ");
        int taringuteArv = sisend.nextInt();
        int taring = (int) Math.round(Math.random()) * 6;
        System.out.println(taring);
        while (taring != taringuteArv) {
            taring = (int) Math.round(Math.random() * 6);
            System.out.println(taring);
        }
    }
    }





