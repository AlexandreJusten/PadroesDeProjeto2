package patterns.Facade;

public class AmazonLivros implements Dropshipping{
    @Override
    public void Buscar() {
        System.out.println("Buscando no banco de dados da Amazon");
    }
}
