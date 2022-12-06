package controller;

import patterns.Facade.DropshippingBuscador;

public class FacadeController {

    public static void facadeController(){
        DropshippingBuscador dropshippingBuscador = new DropshippingBuscador();
        dropshippingBuscador.buscarShoppe();
        dropshippingBuscador.buscarAmazon();
    }
}
