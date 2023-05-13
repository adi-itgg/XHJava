package me.syahdilla.putra.sholeh.semester2.condition;

import java.util.Scanner;

public class IfElseMahasiswa {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Input nilai: ");
        var nilai = scanner.nextInt();
        var grade = "?";
        scanner.close();
        if (nilai > 90) {
            grade = "A+";
        } else if (nilai > 80) {
            grade = "A";
        } else if (nilai > 70) {
            grade = "B";
        } else if (nilai > 60) {
            grade = "C";
        } else if (nilai > 50) {
            grade = "D";
        }
        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + grade);
    }
}
