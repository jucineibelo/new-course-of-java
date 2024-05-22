import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Coment c1 = new Coment("Have a nice trip");
        Coment c2 = new Coment("Wow that's awesome!");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to New Zealand", "I'm going to visit this wonderful country", 12);
        p1.addComent(c1);
        p1.addComent(c2);
        System.out.println(p1);



    }
}