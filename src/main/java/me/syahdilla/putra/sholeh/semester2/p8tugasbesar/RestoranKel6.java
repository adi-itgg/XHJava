package me.syahdilla.putra.sholeh.semester2.p8tugasbesar;

import java.util.Scanner;

public class RestoranKel6 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("""
                Program Tema Restoran
                    Kelompok: 6
            ------------ MENU ------------
            -    1. Nasi Goreng - 16K    -
            -    2. Nasi Bebek - 25K     -
            -    3. Ayam Geprek - 14k    -
            -    4. Mie Ayam - 12K       -
            -    5. Sushi Fresh - 40K    -
            ------------------------------
            Pilih:\040""");
        var tagihan = 0L;
        var pilihan = scanner.nextInt();
        if (pilihan == 1) {
            tagihan += 16000;
        }
        if (pilihan == 2) {
            tagihan += 25000;
        }
        if (pilihan == 3) {
            tagihan += 14000;
        }
        if (pilihan == 4) {
            tagihan += 12000;
        }
        if (pilihan == 5) {
            tagihan += 40000;
        }
        if (pilihan < 1 || pilihan > 5) {
            System.out.println("Harap pilih menu yang ada di atas yaaa");
            return;
        }
        System.out.print("berapa porsi?: ");
        pilihan = scanner.nextInt();
        tagihan = tagihan * pilihan;

        System.out.println("Total yang harus dibayarkan: " + tagihan);
        System.out.print("Bayar: ");
        var bayar = scanner.nextLong();
        var kembalian = bayar - tagihan;

        scanner.close();
        if (bayar < tagihan) {
            System.out.println("Uangmu kurang!, kamu mempunyai hutang: " + kembalian);
            return;
        }
        System.out.println("Kembalian: " + kembalian);
    }

}
