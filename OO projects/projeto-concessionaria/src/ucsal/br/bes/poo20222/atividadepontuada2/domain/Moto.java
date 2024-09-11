package ucsal.br.bes.poo20222.atividadepontuada2.domain;

import ucsal.br.bes.poo20222.atividadepontuada2.exception.NegocioException;

public class Moto extends Veiculo {

	private String categoria;
	private Integer quantCilindros;

	public Moto() {
		super();
	}

	

	public Moto(String placa, Integer anoFabric, Double valor, String categoria, Integer quantCilindros) throws NegocioException{
		super(placa, anoFabric, valor);
		this.categoria = categoria;
		setQuantCilindros(quantCilindros);
	}



	public Moto(String placa, Integer anoFabric, Double valor, Comprador comprador, String categoria,
			Integer quantCilindros) throws NegocioException {
		super(placa, anoFabric, valor, comprador);
		this.categoria = categoria;
		setQuantCilindros(quantCilindros);
	}



	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getQuantCilindros() {
		return quantCilindros;
	}

	public void setQuantCilindros(Integer quantCilindros) throws NegocioException {
		this.quantCilindros = quantCilindros;
		validarMoto(quantCilindros);
	}

	private void validarMoto(Integer quantCilindros) throws NegocioException {
		if (quantCilindros < 0) {
			throw new NegocioException("A quantidade de cilindros não pode ser negativa");

		}

	}


//chamar quando o veicuo for cadastrado com o comprador, se não retorna null
	@Override
	public String VeiculoComprador() {
		
		return "Moto [categoria=" + categoria + ", quantCilindros=" + quantCilindros + ", getPlaca()=" + getPlaca()
				+ ", getComprador()=" + getComprador().getNome()+ ", getAnoFabric()=" + getAnoFabric() + ", getValor()="
				+ getValor() + "]";
	}



	@Override
	public String toString() {
		return "Moto [categoria=" + categoria + ", quantCilindros=" + quantCilindros + ", getPlaca()=" + getPlaca()
				+ ", getAnoFabric()=" + getAnoFabric() + ", getValor()=" + getValor() + "]";
	}
	

	

}
