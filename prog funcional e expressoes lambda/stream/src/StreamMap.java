import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {

        List<String>lista = Arrays.asList("A", "B", "C", "D", "D", "D");

        List<String> testarMap = lista.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(testarMap);

    }
}
