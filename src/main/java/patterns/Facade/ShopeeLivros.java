package patterns.Facade;

public class ShopeeLivros implements Dropshipping{
    @Override
    public void Buscar() {
        System.out.println("Buscando no banco de dados da Shoppe");
    }
}
