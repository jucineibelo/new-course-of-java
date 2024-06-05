import java.util.Arrays;
import java.util.List;

public class StreamDeIntegersSum {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 7, 9, 17);

        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
