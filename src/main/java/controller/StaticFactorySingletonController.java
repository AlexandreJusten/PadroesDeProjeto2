package controller;

import Modal.LivroInformacoes;

public class StaticFactorySingletonController {

    public static void staticFactorySingletonController(){
        LivroInformacoes a = LivroInformacoes.criarNomePaginas("Duna","300pg");
        System.out.println("Nome: "+a.getNome()+" |Paginas: "+a.getPaginas());
        LivroInformacoes b = LivroInformacoes.criaNomeAvaliacoes("Duna2","5");
        System.out.println("Nome: "+b.getNome()+" |Paginas: "+a.getPaginas()+" |Avaliaçoes: "+b.getAvaliacoes());
    }
}
