package me.syahdilla.putra.sholeh.semester2.p8tugasbesar;

import java.util.Scanner;

public class Soal2BilanganBulat {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("angka pertama: ");
        var angka1 = scanner.nextInt();
        System.out.print("angka kedua: ");
        var angka2 = scanner.nextInt();
        scanner.close();

        var hasil = angka1 == angka2 ? angka1 + angka2 : angka1 * angka2;
        System.out.println("Output: " + hasil);
    }

}
