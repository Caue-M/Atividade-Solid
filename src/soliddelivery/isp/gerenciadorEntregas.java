package soliddelivery.isp;

public interface gerenciadorEntregas {
    void sairParaEntrega(int pedidoId);

    void concluirEntrega(int pedidoId);
}
