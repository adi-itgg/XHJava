package me.syahdilla.putra.sholeh.semester2.p7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IFElseCondition {

    public static void main(String[] args) {
        try (var buff = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 4; i++) ifElseCondition(buff); System.out.println("\n");
        } catch (IOException e) { e.printStackTrace(); }
    }
    private static void ifElseCondition(BufferedReader buff) {
        try {
            System.out.print("Pilih Jenis Kelamin Anda [1.Wanita 2.Pria] : ");
            var womanOrMan = Integer.parseInt(buff.readLine());
            System.out.print("Apakah Anda " + (womanOrMan == 1 ? "Cantik" : "Ganteng") + " [1.Ya 2.Tidak] : ");
            var cansOrNot = Integer.parseInt(buff.readLine());
            System.out.println(check(womanOrMan == 1, cansOrNot == 1));
        } catch (Exception e) {
            System.out.println("Anda ga jago milih...");
        }
    }
    private static String check(boolean isWoman, boolean isCans) {
        if (isWoman && isCans) { // wanita
            return "Anda calon Artis sinetron !";
        }
        if (isWoman) {
            return "ngaca dulu deh";
        }
        if (isCans) { // pria
            return "Anda mirip tukul";
        }
        return "ngaca dulu deh yaaa";
    }
}
