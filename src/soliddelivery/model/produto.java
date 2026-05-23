package soliddelivery.model;

public class produto {
    private final String nome;
    private final double preco;

    public produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String descrever() {
        return nome + " - R$ " + String.format("%.2f", preco);
    }
}
