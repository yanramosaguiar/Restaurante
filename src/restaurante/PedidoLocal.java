
package restaurante;

/**
 *
 * @author Yan
 */
public class PedidoLocal extends Pedido {
    
    private int numMesa;

    public PedidoLocal(int codigo, double preco, int num) {
        super(codigo, preco);
        numMesa = num;
    }
    
}