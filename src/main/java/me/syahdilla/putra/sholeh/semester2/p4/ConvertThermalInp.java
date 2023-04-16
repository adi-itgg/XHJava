package me.syahdilla.putra.sholeh.semester2.p4;

import me.syahdilla.putra.sholeh.Scannable;

import java.util.Scanner;

@Scannable
public class ConvertThermalInp {

    public static void main(String[] args) {
        System.out.print("Celcius: ");
        var scanner = new Scanner(System.in);
        var celcius = scanner.nextInt();

        var kelvin = celcius + 273.15;
        var farenheit = (9.0/5.0) * celcius;
        var reamur  = (4.0/5.0) * celcius;

        System.out.println(celcius + " Celcius ke kelvin: " + kelvin);
        System.out.println(celcius + " Celcius ke farenheit: " + farenheit);
        System.out.println(celcius + " Celcius ke reamur: " + reamur);
    }

}
