package controller;

import Modal.User;
import patterns.decorator.UserDAODecorator;
import service.UserDAOInterface;

public class ProxyAndDecoratorController {

    public static void proxyAndDecoratorController(){
        UserDAOInterface userDAO = new UserDAODecorator();

        try {
            userDAO.addUser("");
        } catch (UserException e) {
            System.err.println("Usuario vazio Erro");
            System.err.println(e.getMessage());
        }
        try {
            userDAO.addUser("Alexandre");
        } catch (UserException e) {
            System.err.println("Não consegui adicionar o usuário Teste.");
            System.err.println(e.getMessage());
        }

        try {
            User u = userDAO.getUser("lala");
            System.out.println(u.getNome());
        } catch (UserException e) {
            System.err.println("Não consegui recuperar o usuário lala.");
            System.err.println(e.getMessage());
        }

        try {
            User u = userDAO.getUser("Alexandre");
            System.out.println(u.getNome());
        } catch (UserException e) {
            System.err.println("Não consegui recuperar o usuário Teste.");
            System.err.println(e.getMessage());
        }
    }
}
