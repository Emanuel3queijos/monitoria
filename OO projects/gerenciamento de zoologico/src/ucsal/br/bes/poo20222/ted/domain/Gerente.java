package ucsal.br.bes.poo20222.ted.domain;

import ucsal.br.bes.poo20222.ted.exception.ZoologicoException;

public class Gerente extends Funcionario {

	public Gerente(Long cpf, String nome, Integer idAcesso, String endereco, String telefone, Integer horas,
			Double valorPerHour) throws ZoologicoException {
		super(cpf, nome, idAcesso, endereco, telefone, horas, valorPerHour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Gerente [getIdAcesso()=" + getIdAcesso() + ", getEndereco()=" + getEndereco() + ", getTelefone()="
				+ getTelefone() + ", getHoras()=" + getHoras() + ", getValorPerHour()=" + getValorPerHour()
				+ ", getCpf()=" + getCpf() + ", getNome()=" + getNome() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public double paymente() {
		
		return getHoras() * getValorPerHour();
	}

	
	
	
	
}
