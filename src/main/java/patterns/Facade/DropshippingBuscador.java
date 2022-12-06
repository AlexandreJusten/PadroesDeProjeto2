package patterns.Facade;

public class DropshippingBuscador {

    private Dropshipping amazon;
    private Dropshipping shoppe;

    public DropshippingBuscador() {
        amazon=new AmazonLivros();
        shoppe=new ShopeeLivros();
    }

    public void buscarAmazon(){
        amazon.Buscar();
    }
    public void buscarShoppe(){
        shoppe.Buscar();
    }
}
