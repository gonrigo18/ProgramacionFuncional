package com.openbootcamp;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        funcionales f = new funcionales();
        f.test();

        ArrayList<String> nombres = new ArrayList();
        nombres.add("Gonzalo");
        nombres.add("Delfina");
        nombres.add("Ciro");

        Stream<String> valores = nombres.stream().map(x -> " HOLA " +  x.toUpperCase());
        valores.forEach(x -> System.out.println(x));



    }
}
