package generics.tripletsExample;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Triplet<String> nameIdEmail = new Triplet<>("John Doe", "1", "johndoe@gmail.com");
        Triplet<Integer> idAgeRollno = new Triplet<>(1, 25, 19);
        Triplet<Double> idAgeRollnoDouble = new Triplet<>(1.0, 25.0, 19.0);

        print(nameIdEmail);
        print(idAgeRollno);
        print(idAgeRollnoDouble);


        List<Triplet<String>> tripletsList = List.of(nameIdEmail, nameIdEmail);
        printList(tripletsList);

    }

    public static void print(Triplet<?> triplet) {
        System.out.println(triplet.getFirst() + "------" + triplet.getMiddle() + "------" + triplet.getLast());
    }

    public static <T> void printList(List<Triplet<T>> triplets){
        for (Triplet<T> triplet : triplets) {
            System.out.println(triplet.getFirst() + "------" + triplet.getMiddle() + "------" + triplet.getLast());
        }
    }
}
