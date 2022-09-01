package com.openbootcamp;

import java.util.function.Function;

public class funcionales {

    private Function<String, String> toMayus = x -> x.toUpperCase();
    private Function<Integer, Integer> onAdd = y -> y.sum(y,y);

    public void test (){
        System.out.println(toMayus.apply("holi"));
        System.out.println(onAdd.apply(10));
    }

}
