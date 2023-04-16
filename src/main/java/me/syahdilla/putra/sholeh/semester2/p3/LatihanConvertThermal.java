package me.syahdilla.putra.sholeh.semester2.p3;

import me.syahdilla.putra.sholeh.Scannable;

/**
 * Convert celcius to farenheit, reamur and kelvin
 */
@Scannable
public class LatihanConvertThermal {

    public static void main(String[] args) {
        int celcius = 40;

        double kelvin = celcius + 273.15;
        double farenheit = (9.0/5.0) * celcius;
        double reamur  = (4.0/5.0) * celcius;

        System.out.println("Celcius: " + celcius);
        System.out.println("Celcius ke kelvin: " + kelvin);
        System.out.println("Celcius ke farenheit: " + farenheit);
        System.out.println("Celcius ke reamur: " + reamur);
    }

}
