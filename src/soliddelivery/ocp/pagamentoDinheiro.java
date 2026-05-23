package soliddelivery.ocp;

public class pagamentoDinheiro implements formaPagamento {
    @Override
    public String pagar(double valor) {
        return "Pagamento em dinheiro recebido no valor de R$ " + String.format("%.2f", valor);
    }
}
