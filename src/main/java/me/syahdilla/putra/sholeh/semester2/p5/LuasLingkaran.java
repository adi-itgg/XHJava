package me.syahdilla.putra.sholeh.semester2.p5;

import me.syahdilla.putra.sholeh.Scannable;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Scannable
public class LuasLingkaran {

    public static void main(String[] args) throws Exception {
        try (var buff = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Ruas: ");
            var ruas = Long.parseLong(buff.readLine()); // konversi string ke long
            var luas = ruas * ruas * 3.14; // kalkulasi luas

            System.out.println("Luas Lingkaran: " + luas);
        }
    }

}
