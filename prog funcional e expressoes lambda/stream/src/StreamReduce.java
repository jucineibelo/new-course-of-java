import java.util.Arrays;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {

        List<Integer> testarReduce = Arrays.asList(1, 2, 3, 10, 4);

        int sum = testarReduce.stream()
                              .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
