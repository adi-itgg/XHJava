package me.syahdilla.putra.sholeh.semester2.p8tugasbesar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal4HotelClass {

    public static void main(String[] args) {
        try (var reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Jenis kelas kamar: ");
            var kelas = reader.readLine();
            System.out.print("Lama menginap (dalam hari): ");
            var hari = Integer.parseInt(reader.readLine());

            if (!kelas.equalsIgnoreCase("standard") && !kelas.equalsIgnoreCase("eksekutif")) {
                throw new IllegalArgumentException("inputan tidak sesuai!");
            }

            long biaya;
            if (kelas.equalsIgnoreCase("standard")) {
                biaya = hari > 2 ? 35000 : 400000;
            } else {
                biaya = hari > 2 ? 1000000 : 1200000;
            }
            var bayar = biaya * hari;
            System.out.println("Total tarif yang harus dibayarkan adalah Rp. " + bayar);
        } catch (Exception e) {
            System.out.println("inputan tidak sesuai!");
        }
    }

}
