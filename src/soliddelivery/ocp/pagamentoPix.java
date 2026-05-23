package soliddelivery.ocp;

public class pagamentoPix implements formaPagamento {
    @Override
    public String pagar(double valor) {
        return "Pagamento via Pix confirmado no valor de R$ " + String.format("%.2f", valor);
    }
}
