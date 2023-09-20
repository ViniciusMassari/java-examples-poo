package interfaces.equipamentos.multifuncional;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora {

	@Override
	public void imprimir() {
		System.out.println("imprimindo multifuncional");
		
	}

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando multifuncional");
		
	}

	@Override
	public void copiar() {
		System.out.println("Copiando multifuncional");
		
	}

}
