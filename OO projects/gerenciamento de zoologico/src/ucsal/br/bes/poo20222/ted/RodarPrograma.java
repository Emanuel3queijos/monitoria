package ucsal.br.bes.poo20222.ted;

import ucsal.br.bes.poo20222.ted.domain.Mamifero;
import ucsal.br.bes.poo20222.ted.exception.ZoologicoException;
import ucsal.br.bes.poo20222.ted.persistence.AnimalDao;
import ucsal.br.bes.poo20222.ted.tui.AnimalTui;
import ucsal.br.bes.poo20222.ted.tui.GerenteTui;

public class RodarPrograma {

	public static void main(String[] args) throws ZoologicoException {

		
		GerenteTui.menuGerente();
		AnimalDao.adcicionar(new Mamifero(0.54, "pequeno", "Mico-leão-dourado", "Mata Atlântica", "onivoro", 18,
				"10/09/2004", "Primata", 'M', 'n', "Manu"));
		AnimalDao.adcicionar(new Mamifero(0.50, "pequeno", "Mico-leão-dourado", "Mata Atlântica", "onivoro", 12,
				"10/09/2010", "Primata", 'F', 's', "ANA"));
		AnimalDao.adcicionar(new Mamifero(0.51, "pequeno", "Mico-leão-dourado", "Mata Atlântica", "onivoro", 11,
				"10/09/2009", "Primata", 'M', 'n', "PEDRO"));

		AnimalTui.removerAnimais();
		AnimalTui.listarAnimaisCadastrados();
		

	}

}
