package generics;

public class PairGenerics<F, S> {
    F first;
    S second;

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public PairGenerics(F first, S second) {
        this.first = first;
        this.second = second;
    }
}
