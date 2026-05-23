package soliddelivery.ocp;

public class processadorPagamento {
    public void processar(formaPagamento formaPagamentoAtual, double valor) {
        System.out.println(formaPagamentoAtual.pagar(valor));
    }
}
