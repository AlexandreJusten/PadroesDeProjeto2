package patterns.commands;

import Modal.Livro;

public class InserirLivro implements Comandos{

    private Livro livro;
    private String carrinho;

    public InserirLivro(String carrinho,Livro livro) {
        super();
        this.carrinho=carrinho;
        this.livro=livro ;
    }

    @Override
    public String fazer() {
        return carrinho.concat("LIVRO=["+livro.getNome()+"]");
    }

    @Override
    public String desfazer() {
        return carrinho;
    }
}
