package soliddelivery.model;

public class pizza extends produto {
    private final String tamanho;

    public pizza(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public String descrever() {
        return getNome() + " - tamanho " + tamanho + " - R$ " + String.format("%.2f", getPreco());
    }
}
