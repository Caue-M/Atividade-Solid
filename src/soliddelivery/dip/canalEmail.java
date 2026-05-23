package soliddelivery.dip;

public class canalEmail implements canalNotificacao {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Email enviado para " + destinatario + ": " + mensagem);
    }
}
