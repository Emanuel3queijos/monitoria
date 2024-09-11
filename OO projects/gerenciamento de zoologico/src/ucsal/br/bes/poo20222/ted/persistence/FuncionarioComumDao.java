package ucsal.br.bes.poo20222.ted.persistence;

import java.util.ArrayList;
import java.util.List;

import ucsal.br.bes.poo20222.ted.domain.FuncionarioComum;

public class FuncionarioComumDao {

	private static List<FuncionarioComum> funcionariosComuns = new ArrayList<>();

	public static void adicionar(FuncionarioComum funcionarioComum) {
		funcionariosComuns.add(funcionarioComum);
	}

	public static List<FuncionarioComum> obterTodosFuncionariosComuns() {
		return new ArrayList<>(funcionariosComuns);
	}

	public static void remover(Integer positionId) {
		for (int i = 0; i < funcionariosComuns.size(); i++) {
			if (funcionariosComuns.get(i).getIdAcesso().equals(positionId));
			funcionariosComuns.remove(funcionariosComuns.get(i));

		}
	}
}
