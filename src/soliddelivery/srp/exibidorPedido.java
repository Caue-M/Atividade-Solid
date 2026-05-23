package soliddelivery.srp;

import soliddelivery.model.pedido;
import soliddelivery.model.produto;

public class exibidorPedido {
    public void exibir(pedido pedidoAtual) {
        System.out.println("Pedido #" + pedidoAtual.getId());
        System.out.println("Cliente: " + pedidoAtual.getCliente());
        System.out.println("Itens:");

        for (produto item : pedidoAtual.getProdutos()) {
            System.out.println("- " + item.descrever());
        }

        System.out.println("Total: R$ " + String.format("%.2f", pedidoAtual.getTotal()));
    }
}
