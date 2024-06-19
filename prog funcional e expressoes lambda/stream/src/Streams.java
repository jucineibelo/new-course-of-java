import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 66, 77, 7, 23);
        Stream<Integer>st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String>st2 = Stream.of("Jucinei", "Camila", "Isabela");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2).limit(10);
        System.out.println(Arrays.toString(st3.toArray()));




    }
}
