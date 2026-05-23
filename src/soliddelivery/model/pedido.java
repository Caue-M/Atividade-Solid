package soliddelivery.model;

import java.util.ArrayList;
import java.util.List;

public class pedido {
    private final int id;
    private final String cliente;
    private final List<produto> produtos;

    public pedido(int id, String cliente, List<produto> produtos) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = new ArrayList<>(produtos);
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public List<produto> getProdutos() {
        return new ArrayList<>(produtos);
    }

    public double getTotal() {
        double total = 0.0;
        for (produto item : produtos) {
            total += item.getPreco();
        }
        return total;
    }
}
