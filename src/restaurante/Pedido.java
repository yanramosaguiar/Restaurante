package restaurante;
/**
 *
 * @author Yan
 */
public class Pedido {
    
    private int codigo;
    private double preco;

    public Pedido(int codigo, double preco) {
        this.codigo = codigo;
        this.preco = preco;
    }

    public double getPrecoPrato() {
        return preco;
    }
    
}