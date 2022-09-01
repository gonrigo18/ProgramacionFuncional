package com.openbootcamp;
import java.util.ArrayList;
import java.util.Arrays;
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
        
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        var stNumeros = Arrays.stream(numeros);
        var resultado = stNumeros.filter(x -> x % 2 ==0 ).reduce( 0 , (x, y) -> {
            System.out.println("X es: " + x + " , Y es: " + y);
            return x +y;
        });
        System.out.println("Mi suma de pares es: " + resultado);

    //resultado.forEach(System.out::println);

    }
}
