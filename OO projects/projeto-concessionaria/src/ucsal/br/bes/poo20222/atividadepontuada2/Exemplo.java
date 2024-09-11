package ucsal.br.bes.poo20222.atividadepontuada2;

import ucsal.br.bes.poo20222.atividadepontuada2.domain.Comprador;
import ucsal.br.bes.poo20222.atividadepontuada2.domain.Moto;
import ucsal.br.bes.poo20222.atividadepontuada2.domain.Veiculo;
import ucsal.br.bes.poo20222.atividadepontuada2.domain.VeiculoCarga;
import ucsal.br.bes.poo20222.atividadepontuada2.domain.VeiculoPasseio;
import ucsal.br.bes.poo20222.atividadepontuada2.exception.NegocioException;
import ucsal.br.bes.poo20222.atividadepontuada2.persistence.PessoaDAO;
import ucsal.br.bes.poo20222.atividadepontuada2.persistence.VeiculoDAO;
import ucsal.br.bes.poo20222.atividadepontuada2.tui.PessoaTUI;
import ucsal.br.bes.poo20222.atividadepontuada2.tui.VeiculoTUI;

public class Exemplo {

	public static void main(String[] args) throws NegocioException {

		Comprador comprador = new Comprador(97498395010L, "Victor von Doom", 41490332, "Rua Paulo Muzy", 12,
				"Escandinavia", 40028922);
		PessoaDAO.adicionar(comprador);

		try {
			VeiculoPasseio veiculoPasseio = new VeiculoPasseio("BLW3G30", 2005, 5000d, comprador, 3, 50d);
			VeiculoDAO.adicionar(veiculoPasseio);
			comprador.setVeiculo(veiculoPasseio);

		} catch (NegocioException e) {
			System.out.println(e.getMessage());
			System.out.println("VEICULO DE PASSEIO NÃO CADASTRADO");

		}

		try {

			Moto moto = new Moto("244GRAU", 2020, 3500d, comprador, "CATEGORIA A", 300);
			VeiculoDAO.adicionar(moto);
			comprador.setVeiculo(moto);

		} catch (NegocioException e) {

			System.out.println(e.getMessage());
			System.out.println("MOTO NÃO CADASTRADA");

		}

		try {

			VeiculoCarga veiculoCarga = new VeiculoCarga("BRA2k20", 2000, 5000d, comprador, 1000d, 4, 50043d);
			VeiculoDAO.adicionar(veiculoCarga);
			comprador.setVeiculo(veiculoCarga);
		} catch (NegocioException e) {

			System.out.println(e.getMessage());
			System.out.println("VEICULO DE CARGA NÃO CADASTRADO");

		}

		PessoaTUI.cadastrarPessoa();
		VeiculoTUI.cadastrarMoto();
		VeiculoTUI.cadastrarVeiculoPasseio();
		VeiculoTUI.cadastrarVeiculoCarga();

		for (Comprador compradores : PessoaDAO.obterTodosCompradores()) {
			System.out.println(compradores.toString());

		}
		for (Veiculo veiculos : VeiculoDAO.obterTodosVeiculos()) {
			System.out.println(veiculos.VeiculoComprador());
		}

	}

}
