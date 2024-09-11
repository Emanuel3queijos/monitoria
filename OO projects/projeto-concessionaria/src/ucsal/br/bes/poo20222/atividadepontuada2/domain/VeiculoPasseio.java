package ucsal.br.bes.poo20222.atividadepontuada2.domain;

import ucsal.br.bes.poo20222.atividadepontuada2.exception.NegocioException;

public class VeiculoPasseio extends Veiculo {
	private Integer quantPassageiroMax;
	private Double capPortaMalas;

	public VeiculoPasseio(String placa, Integer anoFabric, Double valor, Integer quantPassageiroMax,
			Double capPortaMalas) throws NegocioException {
		super(placa, anoFabric, valor);
		setQuantPassageiroMax(quantPassageiroMax);
		setCapPortaMalas( capPortaMalas);
	}

	public VeiculoPasseio(String placa, Integer anoFabric, Double valor, Comprador comprador,
			Integer quantPassageiroMax, Double capPortaMalas) throws NegocioException {
		super(placa, anoFabric, valor, comprador);
		setQuantPassageiroMax(quantPassageiroMax);
		setCapPortaMalas( capPortaMalas);
	}

	public Integer getQuantPassageiroMax() {
		return quantPassageiroMax;
	}

	public void setQuantPassageiroMax(Integer quantPassageiroMax) throws NegocioException {
		this.quantPassageiroMax = quantPassageiroMax;
		validarVeiculoPasseioquantPassageiroMax(quantPassageiroMax);
	}

	public double getCapPortaMalas() {
		return capPortaMalas;
	}

	public void setCapPortaMalas(Double capPortaMalas) throws NegocioException {
		this.capPortaMalas = capPortaMalas;
		validarVeiculoPasseioCapPortaMalas(capPortaMalas);
	}

	private void validarVeiculoPasseioCapPortaMalas(Double capPortaMalas) throws NegocioException {
		if (capPortaMalas < 0) {
			throw new NegocioException("A capaciade do porta malas não pode ser negativa");

		}

	}

	private void validarVeiculoPasseioquantPassageiroMax(Integer quantPassageiroMax) throws NegocioException {
		if (quantPassageiroMax < 0) {
			throw new NegocioException("A quantidade de passageiros não pode ser negativa");

		}

	}


	//chamar quando o veicuo for cadastrado com o comprador, se não retorna null
	@Override
	public String VeiculoComprador() {
		return "VeiculoPasseio [quantPassageiroMax=" + quantPassageiroMax + ", capPortaMalas=" + capPortaMalas
				+ ", getPlaca()=" + getPlaca() + ", getComprador()=" + getComprador().getNome() + ", getAnoFabric()="
				+ getAnoFabric() + ", getValor()=" + getValor() + "]";
	}

	@Override
	public String toString() {
		return "VeiculoPasseio [quantPassageiroMax=" + quantPassageiroMax + ", capPortaMalas=" + capPortaMalas
				+ ", getPlaca()=" + getPlaca() + ", getAnoFabric()=" + getAnoFabric() + ", getValor()=" + getValor()
				+ "]";
	}

}