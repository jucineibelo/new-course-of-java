package program;

import java.util.Map;
import java.util.TreeMap;

public class MapEx1 {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99990099");

        cookies.remove("email");
        cookies.put("phone", "99990066"); //vai sobrescrever porque Map não aceita repetição de chave

        System.out.println("ALL COOKIES");

        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println(cookies.containsKey("username")); //metodo containsKey retorna true pois existe essa chave
        System.out.println(cookies.get("username")); //retorna o valor da chave username
        System.out.println(cookies.get("email")); //retorna null pois email foi removido e não existe mais esse elemento
        System.out.println(cookies.size());

    }
}