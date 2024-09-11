package ucsal.br.bes.poo20222.ted.domain;

import ucsal.br.bes.poo20222.ted.exception.ZoologicoException;

public abstract class Funcionario extends Pessoa {

	private Integer idAcesso;
	private String endereco;
	private String telefone;
	private Integer horas;
	private Double valorPerHour;

	public Funcionario(Long cpf, String nome, Integer idAcesso, String endereco, String telefone, Integer horas,  Double valorPerHour) throws ZoologicoException {
		super(cpf, nome);
		this.idAcesso = idAcesso;
		this.endereco = endereco;
		this.telefone = telefone;
		setHoras(horas);
		setValorPerHour(valorPerHour);
	}

	public Integer getIdAcesso() {
		return idAcesso;
	}

	public void setIdAcesso(Integer idAcesso) {
		
		this.idAcesso = idAcesso;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas)throws ZoologicoException  {
		validarHoras(horas);
		this.horas = horas;
	}

	public Double getValorPerHour() {
		return valorPerHour;
	}

	public void setValorPerHour(Double valorPerHour) throws ZoologicoException {
		validarValorPorHoras(valorPerHour);
		this.valorPerHour = valorPerHour;
	}

	public static void validarHoras(Integer horas) throws ZoologicoException{
		if(horas<=0) {
			throw new ZoologicoException("As horas não devem ser negativas ou iguais a zero");
		}
	}
	
	public static void validarValorPorHoras(Double valorPerHour) throws ZoologicoException{
		if(valorPerHour<=0) {
			throw new ZoologicoException("O valor por horas trabalhadas não devem ser negativas ou iguais a zero");
		}
	}
	
	public abstract double paymente();
	
	@Override
	public String toString() {
		return "Funcionario [idAcesso=" + idAcesso + ", endereco=" + endereco + ", telefone=" + telefone + ", horas="
				+ horas + ", valorPerHour=" + valorPerHour + "]";
	}
	
	

}
