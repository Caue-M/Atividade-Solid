package soliddelivery.isp;

import soliddelivery.dip.servicoNotificacao;

public class centralNotificacoes implements enviadorNotificacao {
    private final servicoNotificacao servicoNotificacaoAtual;

    public centralNotificacoes(servicoNotificacao servicoNotificacaoAtual) {
        this.servicoNotificacaoAtual = servicoNotificacaoAtual;
    }

    @Override
    public void enviar(String destinatario, String mensagem) {
        servicoNotificacaoAtual.notificar(destinatario, mensagem);
    }
}
