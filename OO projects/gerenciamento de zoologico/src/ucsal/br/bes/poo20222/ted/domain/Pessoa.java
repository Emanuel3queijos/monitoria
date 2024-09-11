package ucsal.br.bes.poo20222.ted.domain;

public abstract class Pessoa {

	private Long cpf;
	private String nome;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(Long cpf, String nome) {

		this.cpf = cpf;
		this.nome = nome;
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

	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + "]";
	}

}
