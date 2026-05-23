package soliddelivery.srp;

import java.util.HashMap;
import java.util.Map;
import soliddelivery.model.pedido;

public class repositorioPedido {
    private final Map<Integer, pedido> pedidos = new HashMap<>();

    public void salvar(pedido pedidoAtual) {
        pedidos.put(pedidoAtual.getId(), pedidoAtual);
        System.out.println("Pedido " + pedidoAtual.getId() + " salvo com sucesso.");
    }

    public pedido buscarPorId(int id) {
        return pedidos.get(id);
    }
}
