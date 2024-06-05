import java.util.Arrays;
import java.util.List;

public class StreamForEach {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("zebra", "macaco", "onça", "viado", "ovelha");

        list.stream()
            .forEach(System.out::println);
    }
}
