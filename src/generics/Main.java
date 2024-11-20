package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Pair p1 = new Pair(1L, "Anup"); // Long, String
        Pair p2 = new Pair(1.4, 1.5);   // Double, Double
        Pair p3 = new Pair(1L, false);  // Long, Boolean

        List<Pair> pairs = List.of(p1, p2, p3);

        // This is not type safe
        // This is not compile time safe
//        for (generics.Pair pair : pairs) {
//            String first = (String) pair.getFirst();
//            String second = (String) pair.getSecond();
//        }


        PairGenerics<Long, String> pg1 = new PairGenerics<>(1L, "Anup");
        PairGenerics<Double, Double> pg2 = new PairGenerics<>(1.4, 1.5);
        PairGenerics<Long, Boolean> pg3 = new PairGenerics<>(1L, false);

        List<PairGenerics> pairGenerics = new ArrayList<>();
        pairGenerics.add(pg1);
        pairGenerics.add(pg2);
        pairGenerics.add(pg3);

        // This is type safe
        // This is compile time safe
//        String first = pg1.getFirst();
        Long first = pg1.getFirst();

        //Raw types
        PairGenerics pg4 = new PairGenerics(1L, "Anup");
        pg4.getFirst(); // Object


        Demo<Integer, String> demo = new Demo<>();
        demo.doSomething(1, "Anup");

        Demo.<String, Boolean>getValue("Anup", true);

        String firstValue = Demo.getFirst("Anup", 1.9);
        System.out.println(firstValue);

    }
}

// Pro :  You get to store the generics
// Con :  There is no compile time safety