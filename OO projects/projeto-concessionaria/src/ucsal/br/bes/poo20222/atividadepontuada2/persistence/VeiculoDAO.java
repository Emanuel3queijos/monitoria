package ucsal.br.bes.poo20222.atividadepontuada2.persistence;

import java.util.ArrayList;
import java.util.List;


import ucsal.br.bes.poo20222.atividadepontuada2.domain.Veiculo;

public class VeiculoDAO {

	private static List<Veiculo> veiculos = new ArrayList<>();

	public static void adicionar(Veiculo veiculo) {
		veiculos.add(veiculo);
	}
	
	public static List<Veiculo> obterTodosVeiculos(){
		return new ArrayList<>(veiculos);
	}

}
