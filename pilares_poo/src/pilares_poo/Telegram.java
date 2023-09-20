package pilares_poo;

public class Telegram extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
	
	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvar mensagem no Telegram");
		
	}
}
