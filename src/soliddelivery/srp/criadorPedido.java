package soliddelivery.srp;

import java.util.List;
import soliddelivery.model.pedido;
import soliddelivery.model.produto;

public class criadorPedido {
    public pedido criar(int id, String cliente, List<produto> produtos) {
        return new pedido(id, cliente, produtos);
    }
}
