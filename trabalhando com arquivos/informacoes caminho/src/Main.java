import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path");
        String strPath = sc.next();

        File path = new File(strPath);

        System.out.println("caminho getPath " + path.getPath());
        System.out.println("local getParent " + path.getParent());
        System.out.println("nome do arquivo getName " + path.getName());


    }
}