package ucsal.br.bes.poo20222.ted.persistence;

import java.util.ArrayList;
import java.util.List;

import ucsal.br.bes.poo20222.ted.domain.Visitante;

public class VisitanteDao {

	private static List<Visitante>visitantes = new ArrayList<>();
	
	public static void adicionar(Visitante visitante) {
		visitantes.add(visitante);
	}
	public static List<Visitante>obterTodosVisitantes(){
		return new ArrayList<>(visitantes);
		
	}

}
