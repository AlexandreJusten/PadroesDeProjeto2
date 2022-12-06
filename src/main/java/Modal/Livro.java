package Modal;

import patterns.fluentInterfaces.Category;

public class Livro {
    private String nome;
    private Category category;


    public Livro isNome(String nome) {
        this.nome = nome;
        return this;
    }
    public Livro isCategory(Category category) {
        this.category = category;
        return this;
    }
    public String getNome() {
        return nome;
    }
    public Category getCategory() {
        return category;
    }
}
