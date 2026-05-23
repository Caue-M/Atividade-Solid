package soliddelivery.model;

public class bebida extends produto {
    private final int tamanhoDaLata;

    public bebida(String nome, double preco, int tamanhoDaLata) {
        super(nome, preco);
        this.tamanhoDaLata = tamanhoDaLata;
    }

    @Override
    public String descrever() {
        return getNome() + " - lata " + tamanhoDaLata + "ml - R$ " + String.format("%.2f", getPreco());
    }
}
