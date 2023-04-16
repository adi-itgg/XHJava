package me.syahdilla.putra.sholeh.semester2.p4;

import me.syahdilla.putra.sholeh.Scannable;

@Scannable
public class OperatorTunggal {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        y = ++x;
        System.out.println("Contoh operator pada prefix (awalan)");
        System.out.println("---------------------------");
        System.out.println("Nilai x baru : " + x);
        System.out.println("Nilai y = ++x : " + y);

        x = 0;
        y = 0;
        y = x++;
        System.out.println("\nContoh operator pada sufix (akhiran)");
        System.out.println("---------------------------");
        System.out.println("Nilai x baru :" + x);
        System.out.println("Nilai y = x++ :" + y);
    }

}
