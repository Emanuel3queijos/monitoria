package ucsal.br.bes.poo20222.atividadepontuada2.tui;

import java.util.Scanner;

import ucsal.br.bes.poo20222.atividadepontuada2.domain.Comprador;
import ucsal.br.bes.poo20222.atividadepontuada2.persistence.PessoaDAO;

public class PessoaTUI {

	private static Scanner scan = new Scanner(System.in);

	
	// fazer um tratamento caso sej ainserido um valor nulo
	public static void cadastrarPessoa() {
		System.out.println("*********** CADASTRAR PESSOA ***********");
		System.out.println("Informe o cpf Do Comprador");
		long cpf = scan.nextLong();
		System.out.println("Informe o nome do Comprador");
		scan.nextLine();
		String nome = scan.nextLine();
		System.out.println("Informe o CEP do Comprador");
		Integer cep = scan.nextInt();
		System.out.println("Informe o logradouro do Comprador");
		scan.nextLine();
		String logradouro = scan.nextLine();
		System.out.println("Informe o Numero da (casa/apartamento) do Comprador");
		Integer numero = scan.nextInt();
		System.out.println("Informe o Bairro do Comprador");
		scan.nextLine();
		String bairro = scan.nextLine();
		System.out.println("Informe o telefone do comprador ");
		Integer telefone = scan.nextInt();
		
		Comprador comprador = new Comprador(cpf, nome, cep, logradouro, numero, bairro, telefone);
		PessoaDAO.adicionar(comprador);

	}
}
