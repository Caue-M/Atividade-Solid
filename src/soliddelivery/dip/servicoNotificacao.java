package soliddelivery.dip;

public class servicoNotificacao {
    private final canalNotificacao canalNotificacaoAtual;

    public servicoNotificacao(canalNotificacao canalNotificacaoAtual) {
        this.canalNotificacaoAtual = canalNotificacaoAtual;
    }

    public void notificar(String destinatario, String mensagem) {
        canalNotificacaoAtual.enviar(destinatario, mensagem);
    }
}
