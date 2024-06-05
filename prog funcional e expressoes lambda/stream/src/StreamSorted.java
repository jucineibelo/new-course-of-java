import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("zebra", "macaco", "onça", "viado", "ovelha");

        List<String> testarSorted = list.stream()
                                        .sorted()
                                        .collect(Collectors.toList());

        System.out.println(testarSorted);
    }
}
