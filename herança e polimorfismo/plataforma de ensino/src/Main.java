import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas aulas tem o curso?");
        int numAulas = sc.nextInt();

        List<Lesson> list = new ArrayList<>();

        for (int i = 0; i < numAulas; i++) {
            System.out.println("Conteúdo ou tarefa (c/t)?");
            char conteudo = sc.next().charAt(0);
            System.out.println("Título:");
            String titulo = sc.next();

            if (conteudo == 'c') {
                System.out.println("URL do vídeo:");
                String urlVideo = sc.next();
                System.out.println("Duração em segundos:");
                int duracaoSegundos = sc.nextInt();
                list.add(new Video(titulo, urlVideo, duracaoSegundos));
            } else {
                System.out.println("Descrição:");
                String descricao = sc.next();
                System.out.println("Quantidade de questões:");
                int qtdQuestoes = sc.nextInt();
                list.add(new Task(titulo, descricao, qtdQuestoes));
            }
        }

        double sum = 0;
        for (Lesson lesson : list) {
            sum += lesson.duration();
        }
        System.out.println("DURAÇÃO TOTAL DO CURSO = " + sum);


    }
}