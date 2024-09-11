package ucsal.br.bes.poo20222.ted.tui;

import java.util.Scanner;

public class GerenteTui {

	static Scanner scan = new Scanner(System.in);

	public static void menuGerente() {
		System.out.println("************** MENU DO GERENTE **************");
		for (;;) {
			System.out.println("opções: (1) cadastrar animais " + "\r\n" + "(2) Listar animais cadastrados" + "\r\n"
					+ "(3)Remover Animais" + "\r\n" + "(4) Adicionar Funcionarios" + "\r\n"
					+ "(5) Listagem de funcionarios cadastrados" + "\r\n" + "(6) Gerenciar pagamento de funcionarios"
					+ "\r\n" + "(7)Remover Funcionarios" + "\r\n" + "(8)Lista de Visitantes do zoologico" + "\r\n"
					+ "(9) SAIR");

			int i = scan.nextInt();
			switch (i) {
			case 1:
				cadastrarAnimais();
				break;
			case 2:
				listarAnimaisCadastrados();
				break;
			case 3:
				removerAnimais();
				break;
			case 4:
				adicionarFuncionariosComuns();
				break;
			case 5:
				listagemDeFuncionariosComunsCadastrados();
				break;
			case 6:
				gerenciarPagamentoFuncionariosComuns();
				break;
			case 7:
				removerFuncionarioComum();
				break;
			case 8:
				listagemDeVisitantesZoo();
				break;
			case 9: 
				System.exit(0);
			default:
				throw new IllegalArgumentException("Esta não é uma escolha valida");
			}
		}

	}

	private static void adicionarFuncionariosComuns() {

		FuncionarioComumTui.registrarFuncionario();
	}

	private static void cadastrarAnimais() {

		AnimalTui.menu();

	}

	private static void removerAnimais() {
		AnimalTui.removerAnimais();

	}

	private static void listarAnimaisCadastrados() {
		AnimalTui.listarAnimaisCadastrados();
	}

	private static void gerenciarPagamentoFuncionariosComuns() {

	}

	private static void listagemDeFuncionariosComunsCadastrados() {

		FuncionarioComumTui.listarFuncionarios();
	}

	private static void removerFuncionarioComum() {
		FuncionarioComumTui.removerFuncionario();
	}
	private static void listagemDeVisitantesZoo() {
		
	}

}
