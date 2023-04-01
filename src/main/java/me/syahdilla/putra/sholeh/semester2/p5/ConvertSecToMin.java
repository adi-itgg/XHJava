package me.syahdilla.putra.sholeh.semester2.p5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertSecToMin {

    public static void main(String[] args) {
        try (var buff = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("masukkan detik: ");
            var sec = Long.parseLong(buff.readLine()); // ubah inputan string menjadi long

            var min = sec / 60; // konversi detik ke menit
            var remainSec = sec % 60; // kalkulasi hasil bagi dari 60 untuk sisa detik

            var out = String.format("%d detik adalah %d menit %d detik", sec, min, remainSec);
            System.out.println(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
