package ucsal.br.bes.poo20222.ted.tui;

import java.util.Random;
import java.util.Scanner;

import ucsal.br.bes.poo20222.ted.domain.FuncionarioComum;
import ucsal.br.bes.poo20222.ted.exception.ZoologicoException;
import ucsal.br.bes.poo20222.ted.persistence.FuncionarioComumDao;

public class FuncionarioComumTui {

	static Scanner scan = new Scanner(System.in);
	static Random gerador = new Random();

	public static void listarFuncionarios() {

		for (FuncionarioComum funcionario : FuncionarioComumDao.obterTodosFuncionariosComuns()) {
			System.out.println("Id: " + funcionario.getIdAcesso());
			System.out.println("name: " + funcionario.getNome());
			System.out.println("cpf: " + funcionario.getCpf());
			System.out.println("Endereço: " + funcionario.getEndereco());
			System.out.println("Telefone: " + funcionario.getTelefone());
			System.out.println("horas: " + funcionario.getHoras());
			System.out.println("Valor por horas: " + funcionario.getValorPerHour());
			System.out.println("Salário: " + funcionario.paymente());

		}
	}

	public static void removerFuncionario() {
		listarFuncionarios();
		System.out.println("Informe A posição do funcionário que deseja remover");
		Integer position = scan.nextInt();
		FuncionarioComumDao.remover(position - (1));
	}

	public static void registrarFuncionario() {

		try {

			System.out.println("Entre com as informações do Novo funcionário" + "\r\n");
			System.out.println("Digite o nome do Novo funcionário");
			String nome = scan.nextLine();
			System.out.println("Digite o CPF do Novo Funcionário");
			Long cpf = scan.nextLong();
			System.out.println("Digite o endereço do Funcionário");
			scan.nextLine();
			String endereco = scan.nextLine();
			System.out.println("Digite o Telefone do funcionário");
			String telefone = scan.next();
			System.out.println("Digite quantas horas o funcionário irá trabalhar");
			Integer horas = scan.nextInt();
			System.out.println("Digite o valor por hora que ele irá receber");
			Double valorPerHour = scan.nextDouble();
			Integer idAcesso = null;
			for (int i = 0; i < 1; i++) {
				idAcesso = gerador.nextInt(1000000000);
			}
			System.out.println("Id do novo funcionário: " + idAcesso);

			FuncionarioComumDao
					.adicionar(new FuncionarioComum(cpf, nome, idAcesso, endereco, telefone, horas, valorPerHour));

		} catch (ZoologicoException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) throws ZoologicoException {
		FuncionarioComumDao.adicionar(new FuncionarioComum(46052677007L, "Emanuel Santos Almeida", 689886469, "Rua pataro machado", "(71)983838579", 20, 100D));

		GerenteTui.menuGerente();
		
		registrarFuncionario();
		listarFuncionarios();
	}
}