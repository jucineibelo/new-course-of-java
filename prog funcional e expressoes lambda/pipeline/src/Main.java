import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 8, 66, 79);

        Stream<Integer> st1 = list.stream().map(x -> x * 100);  //usando map para modificar todos os indices da coleção
        System.out.println(Arrays.toString(st1.toArray()));


        int sum = list.stream().reduce(0, (x, y) -> x + y); //usando reduce para somar todos os indices da coleção
        System.out.println(sum);


        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)  //filtrando os numeros pares da coleção
                .map(x -> x * 10)         // multiplicando por 10 os numeros pares filtrados anteriormente
                .collect(Collectors.toList()); // transformando o stream em coleção 
        System.out.println(Arrays.toString(newList.toArray()));


    }
}