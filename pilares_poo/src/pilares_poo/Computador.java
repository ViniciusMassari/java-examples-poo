package pilares_poo;
import java.util.Scanner;

public class Computador {
public static void main(String[] args) {
	ServicoMensagemInstantanea smi = null;
	Scanner myobj = new Scanner(System.in);
	  System.out.println("Selecione um serviço: msn, fbm ou tlg");
	

	String appEscolhido= myobj.nextLine(); 
	
	
	if(appEscolhido.equals("msn"))
		smi = new MSNMessenger();
	else if(appEscolhido.equals("fbm"))
		smi = new FacebookMessenger();
	else if(appEscolhido.equals("tlg"))
		smi = new Telegram();

	myobj.close();	
	smi.enviarMensagem();
	smi.receberMensagem();
}

}
