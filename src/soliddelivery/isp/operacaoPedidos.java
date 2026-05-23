package soliddelivery.isp;

public class operacaoPedidos implements gerenciadorPedidos {
    @Override
    public void atualizarStatus(int pedidoId, String status) {
        System.out.println("Pedido " + pedidoId + " atualizado para: " + status);
    }
}
