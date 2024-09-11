package ucsal.br.bes.poo20222.atividadepontuada2.tui;

import java.util.Scanner;

import ucsal.br.bes.poo20222.atividadepontuada2.domain.Moto;
import ucsal.br.bes.poo20222.atividadepontuada2.domain.VeiculoCarga;
import ucsal.br.bes.poo20222.atividadepontuada2.domain.VeiculoPasseio;
import ucsal.br.bes.poo20222.atividadepontuada2.exception.NegocioException;
import ucsal.br.bes.poo20222.atividadepontuada2.persistence.VeiculoDAO;

public class VeiculoTUI {

	private static Scanner scan = new Scanner(System.in);

	public static void cadastrarMoto() {

		System.out.println("*********** CADASTRAR MOTO ***********");
		System.out.println("Informe a placa");
		String placa = scan.next();
		System.out.println("Informe o ano de fabricação");
		int anoFabric = scan.nextInt();
		System.out.println("Informe o Valor");
		Double valor = scan.nextDouble();
		System.out.println("Informe a categoria");
		scan.nextLine();
		String categoria = scan.nextLine();
		System.out.println("Informe a quantidade de cilindros");
		Integer quantCilindros = scan.nextInt();

		try {

			VeiculoDAO.adicionar(new Moto(placa, anoFabric, valor, categoria, quantCilindros));
			if (valor >= 0 && quantCilindros >= 0) {
				System.out.println("MOTO CADASTRADA");
			}

		} catch (NegocioException e) {

			System.out.println(e.getMessage());
			System.out.println("MOTO NÃO CADASTRADA");

		}

	}

	public static void cadastrarVeiculoCarga() {
		System.out.println("*********** CADASTRAR VEICULO DE CARGA***********");
		System.out.println("Informe a placa");
		String placa = scan.next();
		System.out.println("Informe o ano de fabricação");
		int anoFabric = scan.nextInt();
		System.out.println("Informe o Valor");
		Double valor = scan.nextDouble();
		System.out.println("Informe a capacidade de carga maxima");
		Double capCargaMax = scan.nextDouble();
		System.out.println("Informe a quantidade de eixos");
		Integer quantEixos = scan.nextInt();
		System.out.println("Informe a capacidade do tanque de combustivel");
		Double capTanqCombustivel = scan.nextDouble();

		try {
			VeiculoDAO
					.adicionar(new VeiculoCarga(placa, anoFabric, valor, capCargaMax, quantEixos, capTanqCombustivel));

			if (valor >= 0 && capCargaMax >= 0 && quantEixos >= 0) {
				System.out.println("VEICULO DE CARGA CADASTRADO");

			}
			
		} catch (NegocioException e) {

			System.out.println(e.getMessage());
			System.out.println("VEICULO DE CARGA NÃO CADASTRADO");

		}

	}

	public static void cadastrarVeiculoPasseio() {
		System.out.println("*********** CADASTRAR VEICULO DE PASSEIO***********");
		System.out.println("Informe a placa");
		String placa = scan.next();
		System.out.println("Informe o ano de fabricação");
		Integer anoFabric = scan.nextInt();
		System.out.println("Informe o Valor");
		Double valor = scan.nextDouble();
		System.out.println("Informe a Capacidade maxima de passageiros");
		Integer quantPassageiroMax = scan.nextInt();
		System.out.println("Informe a capacidade do porta malas");
		Double capPortaMalas = scan.nextDouble();
		try {
			VeiculoDAO.adicionar(new VeiculoPasseio(placa, anoFabric, valor, quantPassageiroMax, capPortaMalas));
			if (valor >= 0 && quantPassageiroMax >= 0 && capPortaMalas >= 0) {
				System.out.println("VEICULO DE PASSEIO CADASTRADO");
			}

		} catch (NegocioException e) {
			System.out.println(e.getMessage());
			System.out.println("VEICULO DE PASSEIO NÃO CADASTRADO");

		}

	}
}
