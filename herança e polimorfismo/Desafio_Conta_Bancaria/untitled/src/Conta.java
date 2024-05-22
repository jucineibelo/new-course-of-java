public class Conta {
    private int numeroConta;
    private String nome;
    private double valor;

    public Conta() {
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public double getValorInicial() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrarConta(int numeroConta, String nome, double valor) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.valor = valor;
    }

    public void cadastrarConta(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.valor = this.valor + valor;
            System.out.println("Updated account data: ");
        } else {
            System.out.println("Valor para depositar deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        this.valor = this.valor - valor - 5;
        System.out.println("Updated account data:");
    }

    @Override
    public String toString() {
        return "Account data: \nAccount " + this.numeroConta + ", Holder: " + this.nome + ", Balance:  $ " + this.valor;
    }
}
