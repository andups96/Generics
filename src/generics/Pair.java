package generics;

public class Pair {
    Object first;
    Object second;

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }

    public Pair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }
}
