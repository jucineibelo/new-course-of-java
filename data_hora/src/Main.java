import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  //criando um objeto com o formato da data/hora
        Date dataParaConverter = null;
        dataParaConverter = new Date();  //recebendo data atual

        String armazenaData = sdf.format(dataParaConverter);        // recebendo data convertida em uma variavel tipo string
        System.out.println("dia: " +armazenaData.substring(0,2) + "\nmês: " + armazenaData.substring(3,5));
        System.out.println(armazenaData);

        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Insira uma data: (dd/mm/yyyy): ");
        Date receberData = sdf.parse(sc.next());
        System.out.println(sdf.format(receberData));




    }
}