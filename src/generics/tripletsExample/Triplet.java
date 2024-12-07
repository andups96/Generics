package generics.tripletsExample;

public class Triplet<TYPE> {
    private TYPE first;
    private TYPE middle;
    private TYPE last;

    public Triplet(TYPE first, TYPE middle, TYPE last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public TYPE getFirst() {
        return first;
    }

    public TYPE getMiddle() {
        return middle;
    }

    public TYPE getLast() {
        return last;
    }
}
