package ucsal.br.bes.poo20222.ted.domain;

public class Visitante extends Pessoa {

	public Visitante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Visitante(Long cpf, String nome) {
		super(cpf, nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Visitante [getCpf()=" + getCpf() + ", getNome()=" + getNome() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
