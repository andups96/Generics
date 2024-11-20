package generics;

public class Demo<K, V> {
    K key;
    V value;

    public void doSomething(K key, V value) {
        System.out.println("Key: " + key + " Value: " + value);
    }

    public static <F, S> void getValue(F first, S second) {
        System.out.println("First: " + first + " Second: " + second);
    }

    public static <F, S> F getFirst(F first, S second) {
        return first;
    }
}
