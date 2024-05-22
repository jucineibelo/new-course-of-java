import java.util.ArrayList;
import java.util.stream.Collectors;

public class List {
    public static void main(String[] args) {
        java.util.List<String> minhaLista = new ArrayList<>();
        minhaLista.add("Jucinei");
        minhaLista.add("Camila");
        minhaLista.add("Jose");
        minhaLista.add("Cristine");
        minhaLista.add("Marilena");
        minhaLista.add("Marines");
        minhaLista.add("Mario");
        minhaLista.add("Jorge");
        minhaLista.add(0, "Julia");
        minhaLista.add(1,"Leticia");

        for (String forEat : minhaLista){
            System.out.println(forEat);
        }

        for (int i = 0; i < minhaLista.size(); i++){
            System.out.println(minhaLista.get(i));
        }

        int contador = 0;
        while(contador < minhaLista.size()){
            System.out.println(minhaLista.get(contador));
            contador++;
        }

        minhaLista.remove("Cristine");
        minhaLista.remove(0);
        minhaLista.removeIf(x -> x.charAt(0) == 'J'); //usando lambda para remover indices de acordo com a primeira letra (char)
        System.out.println(minhaLista.toString());
        System.out.println("----------------------------------------------");
        System.out.println("Localizar pelo indice");
        System.out.println("Index of Camila: " + minhaLista.indexOf("Camila"));

        System.out.println("----------------------------------------------");
        System.out.println("Imprimir a lista usando filtro de somente uma inicial");
        System.out.println("será necessario criar outra lista");
        java.util.List<String> listaComFiltro = minhaLista.stream().filter(ppk -> ppk.charAt(0) == 'M').collect(Collectors.toList());

        for (String ppk : listaComFiltro){
            System.out.println(ppk);
        }

        System.out.println("----------------------------------------------");
        System.out.println("Buscar primeiro elemento cujo nome começa com M, se não tiver retorne Nulo");
        String nome = minhaLista.stream().filter(jj -> jj.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(nome);



        
    }
}