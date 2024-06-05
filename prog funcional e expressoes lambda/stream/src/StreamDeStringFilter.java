import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDeStringFilter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Camila", "Jose", "Jorjao", "Belinha", "Caracol");

        List<String> receberStream = list.stream()
                                         .filter(name -> name.startsWith("C"))  //filtro com base em uma condição
                                         .collect(Collectors.toList());

        System.out.println(receberStream);

    }
}