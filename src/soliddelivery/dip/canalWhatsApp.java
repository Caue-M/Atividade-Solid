package soliddelivery.dip;

public class canalWhatsApp implements canalNotificacao {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("WhatsApp enviado para " + destinatario + ": " + mensagem);
    }
}
