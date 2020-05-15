
package restaurante;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yan
 */
public class Restaurante {

    public static void main(String[] args) {
        
        List<Pedido> pedidos = new ArrayList<Pedido>();
        // Código do prato, valor e código do cliente		
        pedidos.add(new PedidoLocal(1, 50.0, 1));
        pedidos.add(new PedidoLocal(2, 20.0, 1));
        pedidos.add(new PedidoLocal(3, 100.0, 1));
        //Código do prato, valor e telefone do cliente
        pedidos.add(new PedidoViagem(1, 50.0, "9999-9999")); 
        pedidos.add(new PedidoViagem(2, 20.0, "8888-8888"));
        
        double somaLocal = 0, somaViagem = 0;
        
        // Para cada pedido da lista de pedidos, 
        // acumular os preços dos pratos na variável SOMA
        for (Pedido p : pedidos) {
            if (p instanceof PedidoLocal) {
                somaLocal += p.getPrecoPrato();
            }
            if (p instanceof PedidoViagem){
                somaViagem += p.getPrecoPrato();
            }
        }
        
        //Ao final, informar o preço TOTAL dos pedidos
        System.out.println("TOTAL DOS PEDIDOS LOCAIS: " + somaLocal);
        System.out.println("TOTAL DOS PEDIDOS VIAGEM: " + somaViagem);

        
    }
    
}
