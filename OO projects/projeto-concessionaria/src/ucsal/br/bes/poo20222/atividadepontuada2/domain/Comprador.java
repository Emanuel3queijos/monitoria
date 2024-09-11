package ucsal.br.bes.poo20222.atividadepontuada2.domain;

import java.util.ArrayList;
import java.util.List;

public class Comprador {

	private Long cpf;
	private String nome;
	private Integer cep;
	private String logradouro;
	private Integer numero;
	private String bairro;
	private Integer telefone;
	private Veiculo veiculo;
	private List<Veiculo> veiculosCompradores = new ArrayList<>();
	public Comprador() {
	}

	public Comprador(Long cpf, String nome, Integer cep, String logradouro, Integer numero, String bairro,
		Integer telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.telefone = telefone;
	}


	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public List<Veiculo> getVeiculos() {
		return veiculosCompradores;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculosCompradores = veiculos;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
		this.veiculosCompradores.add(veiculo);
	}

	@Override
	public String toString() {
		return "Comprador [cpf=" + cpf + ", nome=" + nome + ", cep=" + cep + ", logradouro=" + logradouro + ", numero="
				+ numero + ", bairro=" + bairro + ", telefone=" + telefone + ", veiculosCompradores="
				+ veiculosCompradores + "]";
	}
	
	

	
	
}