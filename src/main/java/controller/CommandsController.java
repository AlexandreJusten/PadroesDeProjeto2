package controller;

import Modal.Livro;
import patterns.commands.Executor;
import patterns.commands.InserirLivro;

public class CommandsController {

    public static void commandsController(){
        String carrinho="";

        Executor executor = new Executor();

        carrinho=executor.fazer(new InserirLivro(carrinho,new Livro().isNome("alice")));
        System.out.println("1(fazer)- "+carrinho);
        carrinho=executor.fazer(new InserirLivro(carrinho,new Livro().isNome("harry potter")));
        System.out.println("2(fazer)- "+carrinho);
        carrinho=executor.fazer(new InserirLivro(carrinho,new Livro().isNome("Star Wars")));
        System.out.println("3(fazer)- "+carrinho);
        carrinho=executor.desfazer();
        System.out.println("4(desfazer)- "+carrinho);
        carrinho=executor.refazer();
        System.out.println("4(refazer)- "+carrinho);
    }
}
