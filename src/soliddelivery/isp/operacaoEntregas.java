package soliddelivery.isp;

public class operacaoEntregas implements gerenciadorEntregas {
    @Override
    public void sairParaEntrega(int pedidoId) {
        System.out.println("Pedido " + pedidoId + " saiu para entrega.");
    }

    @Override
    public void concluirEntrega(int pedidoId) {
        System.out.println("Pedido " + pedidoId + " entregue.");
    }
}
