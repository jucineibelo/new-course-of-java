public class Main {
    public static void main(String[] args) {
        Produto p1= new Produto();
        p1.addProducts(5);
        p1.addProducts(56);
        p1.removeProducts(15);
        p1.setPreco(3.50);
        p1.setNome("feijão");
        System.out.println(p1);
    }
}
