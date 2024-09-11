package ucsal.br.bes.poo20222.ted.persistence;

import java.util.ArrayList;
import java.util.List;

import ucsal.br.bes.poo20222.ted.domain.Gerente;

public class GerenteDao {

	private static List<Gerente> gerentes = new ArrayList<>();
	
	public static void adicionar(Gerente gerente) {
		gerentes.add(gerente);
		
	}
	public static List<Gerente>obterTodosGerentes(){
		return new ArrayList<>(gerentes);
	}
	
}
