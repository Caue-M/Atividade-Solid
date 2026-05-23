package soliddelivery.dip;

public class canalSms implements canalNotificacao {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("SMS enviado para " + destinatario + ": " + mensagem);
    }
}
