package patterns.fluentInterfaces;

public class Category {

    private String nome;

    public Category isNome(String nome) {
        this.nome = nome;
        return this;
    }
    public String getNome() {
        return nome;
    }
}
