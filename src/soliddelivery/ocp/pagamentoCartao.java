package soliddelivery.ocp;

public class pagamentoCartao implements formaPagamento {
    @Override
    public String pagar(double valor) {
        return "Pagamento em cartao aprovado no valor de R$ " + String.format("%.2f", valor);
    }
}
