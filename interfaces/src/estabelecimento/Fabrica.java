package estabelecimento;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.impressora.Deskjet;
import interfaces.equipamentos.impressora.Impressora;
import interfaces.equipamentos.multifuncional.Multifuncional;

public class Fabrica {
public static void main(String[] args) {
	Multifuncional em = new Multifuncional();
	Impressora impressora = em;
	Digitalizadora digitalizadora = em;
	Copiadora copiadora = em;
	
	copiadora.copiar();
}
}
