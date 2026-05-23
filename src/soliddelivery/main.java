package soliddelivery;

import java.util.List;
import soliddelivery.dip.canalEmail;
import soliddelivery.dip.canalSms;
import soliddelivery.dip.canalWhatsApp;
import soliddelivery.dip.servicoNotificacao;
import soliddelivery.isp.centralNotificacoes;
import soliddelivery.isp.geradorRelatorio;
import soliddelivery.isp.gerenciadorEntregas;
import soliddelivery.isp.gerenciadorPedidos;
import soliddelivery.isp.operacaoEntregas;
import soliddelivery.isp.operacaoPedidos;
import soliddelivery.isp.relatorioPedidos;
import soliddelivery.model.bebida;
import soliddelivery.model.hamburguer;
import soliddelivery.model.pedido;
import soliddelivery.model.pizza;
import soliddelivery.model.produto;
import soliddelivery.ocp.formaPagamento;
import soliddelivery.ocp.pagamentoCartao;
import soliddelivery.ocp.pagamentoDinheiro;
import soliddelivery.ocp.pagamentoPix;
import soliddelivery.ocp.processadorPagamento;
import soliddelivery.srp.criadorPedido;
import soliddelivery.srp.exibidorPedido;
import soliddelivery.srp.repositorioPedido;

public class main {
    public static void main(String[] args) {
        List<produto> produtos = List.of(
            new pizza("Pizza de Calabresa", 45.0, "Grande"),
            new hamburguer("Hamburguer Artesanal", 28.0, true),
            new bebida("Refri", 8.0, 500)
        );

        criadorPedido criador = new criadorPedido();
        repositorioPedido repositorio = new repositorioPedido();
        exibidorPedido exibidor = new exibidorPedido();

        pedido pedidoAtual = criador.criar(1, "João Marcos Bortolotti", produtos);
        repositorio.salvar(pedidoAtual);
        exibidor.exibir(repositorio.buscarPorId(1));

        System.out.println();
        System.out.println("Pagamentos:");

        processadorPagamento processador = new processadorPagamento();
        List<formaPagamento> pagamentos = List.of(
            new pagamentoCartao(),
            new pagamentoPix(),
            new pagamentoDinheiro()
        );

        for (formaPagamento pagamentoAtual : pagamentos) {
            processador.processar(pagamentoAtual, pedidoAtual.getTotal());
        }

        System.out.println();
        System.out.println("Produtos:");

        for (produto item : produtos) {
            System.out.println(item.descrever());
        }

        System.out.println();
        System.out.println("Interfaces especificas:");

        gerenciadorPedidos operacaoPedidosAtual = new operacaoPedidos();
        gerenciadorEntregas operacaoEntregasAtual = new operacaoEntregas();
        geradorRelatorio relatorio = new relatorioPedidos();

        centralNotificacoes centralEmail = new centralNotificacoes(new servicoNotificacao(new canalEmail()));

        operacaoPedidosAtual.atualizarStatus(pedidoAtual.getId(), "Em preparo");
        operacaoEntregasAtual.sairParaEntrega(pedidoAtual.getId());
        relatorio.gerar();
        centralEmail.enviar("joao.bortolotti@Unifil.br", "Seu pedido saiu para entrega.");

        System.out.println();
        System.out.println("Notificações:");

        List<servicoNotificacao> notificadores = List.of(
            new servicoNotificacao(new canalEmail()),
            new servicoNotificacao(new canalSms()),
            new servicoNotificacao(new canalWhatsApp())
        );

        for (servicoNotificacao notificador : notificadores) {
            notificador.notificar("João Marcos Bortolotti", "Pedido entregue");
        }
    }
}
