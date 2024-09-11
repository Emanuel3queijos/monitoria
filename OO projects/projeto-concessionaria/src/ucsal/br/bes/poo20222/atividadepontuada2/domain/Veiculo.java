package ucsal.br.bes.poo20222.atividadepontuada2.domain;

import ucsal.br.bes.poo20222.atividadepontuada2.exception.NegocioException;

public abstract class Veiculo {

	private String placa;
	private Integer anoFabric;
	private Double valor;
	private Comprador comprador;

	public Veiculo() {
	}

	public Veiculo(String placa, Integer anoFabric, Double valor) throws NegocioException {
		super();
		this.placa = placa;
		this.anoFabric = anoFabric;
		setValor(valor);
	}

	public Veiculo(String placa, Integer anoFabric, Double valor, Comprador comprador) throws NegocioException {

		this.placa = placa;
		this.anoFabric = anoFabric;
		this.comprador = comprador;
		setValor(valor);

	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public int getAnoFabric() {
		return anoFabric;
	}

	public void setAnoFabric(Integer anoFabric) {
		this.anoFabric = anoFabric;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(Double valor) throws NegocioException {
		validarValorVeiculo(valor);
		this.valor = valor;
	}

	private void validarValorVeiculo(Double valor) throws NegocioException {
		if (valor < 0) {
			throw new NegocioException("O valor não pode ser negativo");

		}

	}
	

	//chamar quando o veicuo for cadastrado com o comprador, se não retorna null

	public String VeiculoComprador() {
		return "Veiculo [placa=" + placa + ", anoFabric=" + anoFabric + ", valor=" + valor + ", comprador=  "
				+ comprador.getNome();
	}
	
	
	public String toString() {

		return "Veiculo [placa=" + placa + ", anoFabric=" + anoFabric + ", valor=" + valor + ", comprador=" + "]";

	}

	

}