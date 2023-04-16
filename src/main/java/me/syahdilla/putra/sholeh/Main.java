package me.syahdilla.putra.sholeh;

import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {
        var reflect = new Reflections("me.syahdilla.putra.sholeh.semester2");
        reflect.getTypesAnnotatedWith(Scannable.class).forEach(clazz -> {
            try {
                var mainMethod = clazz.getDeclaredMethod("main", String[].class);
                System.out.println("Running Class: " + clazz.getSimpleName() + "\n");
                mainMethod.invoke(null, (Object) args);
                System.out.println("\n");
            } catch (Exception e) {
                e.printStackTrace();
                // skip
            }
        });
    }

}
