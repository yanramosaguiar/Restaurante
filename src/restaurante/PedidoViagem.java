
package restaurante;

/**
 *
 * @author Yan
 */
public class PedidoViagem extends Pedido {
    
    private String numTelefone;

    public PedidoViagem(int codigo, double preco, String numTel) {
        super(codigo, preco);
        numTelefone = numTel;
    }
    
    @Override
    public double getPrecoPrato(){
        return super.getPrecoPrato() * 1.10; //10% taxa de entrega
    }
        
}
