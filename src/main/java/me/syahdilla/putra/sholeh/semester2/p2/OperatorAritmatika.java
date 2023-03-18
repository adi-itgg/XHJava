package me.syahdilla.putra.sholeh.semester2.p2;

public class OperatorAritmatika {

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int z = 3;
        int g;

        g = x + y;
        System.out.println("Penjumlahan (x+y): " + g);
        g = y - x;
        System.out.println("Pengurangan (y-x): " + g);
        g = y/x;
        System.out.println("Pembagian (y/x): " + g);
        g = x + (y * (z/x));
        System.out.println("Hasil sekarang: " + g);
    }

}
