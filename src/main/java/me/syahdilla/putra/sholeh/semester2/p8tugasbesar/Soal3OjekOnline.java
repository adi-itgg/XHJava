package me.syahdilla.putra.sholeh.semester2.p8tugasbesar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soal3OjekOnline {

    public static void main(String[] args) {
        try (var reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Nama Customer: ");
            var nama = reader.readLine();
            System.out.print("Jarak yang akan ditempuh (Km): ");
            var km = Integer.parseInt(reader.readLine());

            var diskon = km > 15 ? 5000 : (km > 10 ? 2000 : 0);
            var biaya = 0L;
            if (km >= 4) {
                biaya += 9500;
                if (km > 4) {
                    biaya += 2500L * (km - 4);
                }
            } else {
                biaya += 2500L * km;
            }
            biaya -= diskon;

            if (diskon > 0) {
                System.out.println("Selamat, anda mendapatkan potongan Rp. " + diskon);
            } else {
                System.out.println("anda tidak mendapatkan potongan harga!");
            }
            System.out.println("Tarif yang harus dibayarkan " + nama + " adalah sebesar " + biaya);
        } catch (Exception e) {
            System.out.println("inputan tidak sesuai!");
        }
    }

}
