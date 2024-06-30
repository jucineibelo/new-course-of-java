package model.entities;

public class Student {

    private Integer id;
    private String nome;
    private Integer idade;

    public Student() {

    }

    public Student(Integer id, String nome, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: " + id);
        sb.append("\nEstudante: " + nome);
        sb.append("\nAno: " + idade);
        return sb.toString();
    }


}


