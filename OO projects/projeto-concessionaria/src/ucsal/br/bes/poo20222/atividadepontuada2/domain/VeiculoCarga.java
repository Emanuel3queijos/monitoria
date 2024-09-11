package ucsal.br.bes.poo20222.atividadepontuada2.domain;

import ucsal.br.bes.poo20222.atividadepontuada2.exception.NegocioException;

public class VeiculoCarga extends Veiculo {

	private Double capCargaMax;
	private Integer quantEixos;
	private Double capTanqCombustivel;

	

	public VeiculoCarga(String placa, Integer anoFabric, Double valor, Double capCargaMax, Integer quantEixos,
			Double capTanqCombustivel) throws NegocioException{
		super(placa, anoFabric, valor);
		setCapCargaMax(capCargaMax);
		setQuantEixos(quantEixos);
		setCapTanqCombustivel(capTanqCombustivel);
	}

	public VeiculoCarga(String placa, Integer anoFabric, Double valor, Comprador comprador, Double capCargaMax,
			Integer quantEixos, Double capTanqCombustivel) throws NegocioException {
		super(placa, anoFabric, valor, comprador);
		setCapCargaMax(capCargaMax);
		setQuantEixos(quantEixos);
		setCapTanqCombustivel(capTanqCombustivel);
	}

	public double getCapCargaMax() {
		return capCargaMax;
	}

	public void setCapCargaMax(Double capCargaMax) throws NegocioException {
		this.capCargaMax = capCargaMax;
		validarVeiculoCargarCargaMax(capCargaMax);
	}

	public Integer getQuantEixos() {
		return quantEixos;
	}

	public void setQuantEixos(Integer quantEixos) throws NegocioException {
		this.quantEixos = quantEixos;
		validarVeiculoCargaQtdEixos(quantEixos);

	}

	public double getCapTanqCombustivel() {
		return capTanqCombustivel;

	}

	public void setCapTanqCombustivel(Double capTanqCombustivel) throws NegocioException {
		this.capTanqCombustivel = capTanqCombustivel;
		validarVeiculoCargarCapCombustivel(capTanqCombustivel);

	}

	private void validarVeiculoCargarCapCombustivel(Double capTanqCombustivel) throws NegocioException {
		if (capTanqCombustivel < 0) {
			throw new NegocioException("A capacidade de combstivel não pode ser negativa");

		}

	}

	private void validarVeiculoCargarCargaMax(Double capCargaMax) throws NegocioException {
		if (capCargaMax < 0) {
			throw new NegocioException("A capaciade de carga maxima não pode ser negativa");

		}

	}

	private void validarVeiculoCargaQtdEixos(Integer quantEixos) throws NegocioException {
		if (quantEixos < 0) {
			throw new NegocioException("A quantidade de eixos não pode ser negativa");

		}

	}
	

	//chamar quando o veicuo for cadastrado com o comprador, se não retorna null

	@Override
	public String VeiculoComprador() {
		return "VeiculoCarga [capCargaMax=" + capCargaMax + ", quantEixos=" + quantEixos + ", capTanqCombustivel="
				+ capTanqCombustivel + ", getPlaca()=" + getPlaca() + ", getComprador()=" + getComprador().getNome()
				+ ", getAnoFabric()=" + getAnoFabric() + ", getValor()=" + getValor() + "]";
	}

	@Override
	public String toString() {
		return "VeiculoCarga [capCargaMax=" + capCargaMax + ", quantEixos=" + quantEixos + ", capTanqCombustivel="
				+ capTanqCombustivel + ", getPlaca()=" + getPlaca() + ", getAnoFabric()=" + getAnoFabric()
				+ ", getValor()=" + getValor() + "]";
	}

	
}