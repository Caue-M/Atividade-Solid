package soliddelivery.model;

public class hamburguer extends produto {
    private final boolean acompanhaBatata;

    public hamburguer(String nome, double preco, boolean acompanhaBatata) {
        super(nome, preco);
        this.acompanhaBatata = acompanhaBatata;
    }

    @Override
    public String descrever() {
        String adicional = acompanhaBatata ? "com batata" : "sem batata";
        return getNome() + " - " + adicional + " - R$ " + String.format("%.2f", getPreco());
    }
}
