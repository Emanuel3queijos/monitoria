package ucsal.br.bes.poo20222.atividadepontuada2.persistence;

import java.util.ArrayList;
import java.util.List;

import ucsal.br.bes.poo20222.atividadepontuada2.domain.Comprador;

public class PessoaDAO {

	
	private static List<Comprador> compradores = new ArrayList<>();

	public static void adicionar(Comprador comprador) {
		compradores.add(comprador);
	}
	
	public static List<Comprador> obterTodosCompradores(){
		return new ArrayList<>(compradores);
	}
}
