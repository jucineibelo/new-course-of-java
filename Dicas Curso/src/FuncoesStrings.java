public class FuncoesStrings {
    public static void main(String[] args) {
        String original = "as VGEDFGSFS grfhg  A DFG nbn   gf AE";
        System.out.println(original);

        String s1 = original.toLowerCase();
        System.out.println(s1);

        String s2 = original.toUpperCase();
        System.out.println(s2);

        String s3 = original.trim();
        System.out.println(s3);

        String s4 = original.substring(20);
        System.out.println(s4);

        String s5 = original.substring(20, 24);
        System.out.println(s5);

        String s6 = original.replace("D", "x");
        System.out.println(s6);

        int s7 = original.indexOf('D');
        System.out.println(s7);

        int s8 = original.lastIndexOf('E');
        System.out.println(s8);

        String s = "orange potato tomato";
        String [] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
