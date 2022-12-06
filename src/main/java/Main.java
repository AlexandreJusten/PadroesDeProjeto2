import controller.*;

public class Main {

    public static void main(String[] args){

        //StaticFactorySingleton modal LivroInformaçoes
        System.out.println("====StaticFactorySingleton====");
        StaticFactorySingletonController.staticFactorySingletonController();

        //FluentInterfaces usando o modal livro
        System.out.println("====FluentInterfaces====");
        FluentInterfacesController.FluentInterfacesController();

        //COMMANDS usa o modal livro para add em carrinho
        System.out.println("====COMMANDS====");
        CommandsController.commandsController();

        //DOUBLE DISPATCH
        System.out.println("==== DOUBLE DISPATCH====");
        System.out.println("a fazer");

        //FACADE buscador nos banco de dados de outras livrarias para Dropshipping
        System.out.println("====FACADE====");
        FacadeController.facadeController();
        //FLYWEIGHT
        System.out.println("====FLYWEIGHT====");
        System.out.println("a fazer");

        //Proxy e Decorator usando o Modal User
        System.out.println("====Proxy and Decorator====");
        ProxyAndDecoratorController.proxyAndDecoratorController();
    }
}
