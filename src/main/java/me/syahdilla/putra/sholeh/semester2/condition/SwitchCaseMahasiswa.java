package me.syahdilla.putra.sholeh.semester2.condition;

import java.util.Scanner;

public class SwitchCaseMahasiswa {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Input nilai: ");
        var nilai = scanner.nextInt();
        var grade = "E";
        scanner.close();
        switch (nilai) {
            case 91, 92, 94, 93, 95, 96, 97, 98, 99, 100 -> grade = "A+";
            case 81, 82, 83, 84, 85, 86, 87, 88, 89, 90 -> grade = "A";
            case 71, 72, 73, 74, 75, 76, 77, 78, 79, 80 -> grade = "B";
            case 61, 62, 63, 64, 65, 66, 67, 68, 69, 70 -> grade = "C";
            case 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 -> grade = "D";
            default -> grade = "?";
        }

        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + grade);
    }
}
