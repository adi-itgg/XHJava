package me.syahdilla.putra.sholeh.semester2.p8tugasbesar;

import java.util.Scanner;

public class Soal1VolumeBola {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Input jari-jari bola: ");
        var r = scanner.nextDouble();
        scanner.close();
        var phi = 3.14;
        var volume = 4.0/3.0 * phi * Math.pow(r, 3);
        System.out.println("Volume bola adalah: " + volume);
    }

}
