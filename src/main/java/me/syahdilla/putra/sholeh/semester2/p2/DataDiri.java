package me.syahdilla.putra.sholeh.semester2.p2;

import me.syahdilla.putra.sholeh.Scannable;

@Scannable
public class DataDiri {

    public static void main(String[] args) {
        String nama,alamat;
        int usia;
        double tinggi;

        nama = "ulfa";
        alamat = "planet";
        usia = 35;
        tinggi = 160;

        System.out.println("Nama: " + nama);
        System.out.println("alamat: " + alamat);
        System.out.println("usia: " + usia);
        System.out.println("tinggi: " + tinggi);

    }

    // java 17
    private static void minify() {
        var nama = "ulfa";
        var alamat = "planet";
        var usia = 35;
        var tinggi = 160;

        println("Nama:", nama);
        println("alamat:", alamat);
        println("usia:", usia);
        println("tinggi:", tinggi);
    }

    private static void println(Object... args) {
        var sb = new StringBuilder();
        for (Object arg : args)
            sb.append(arg).append(" ");
        System.out.println(sb);
    }

}
