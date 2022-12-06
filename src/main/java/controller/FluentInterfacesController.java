package controller;

import Modal.Livro;
import patterns.fluentInterfaces.Category;

public class FluentInterfacesController {
    public static void FluentInterfacesController(){
        Category ficcaoCientifica = new Category().isNome(" ficção científica");
        Livro robot = new Livro().isNome("Robot").isCategory(ficcaoCientifica);

        System.out.println("nome: "+robot.getNome()+" |Categoria: "+robot.getCategory().getNome());
    }
}
