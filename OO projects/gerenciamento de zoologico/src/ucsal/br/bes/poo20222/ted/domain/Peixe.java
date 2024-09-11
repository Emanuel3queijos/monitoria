package ucsal.br.bes.poo20222.ted.domain;

import ucsal.br.bes.poo20222.ted.exception.ZoologicoException;

public class Peixe extends Animal {
	public Peixe() {

	}

	public Peixe(Double peso, String porte, String especie, String habitat, String alimentacao, Integer idade,
			String dataRecebida, String nome, char verificarSexo, char verificarFilhotes, String apelido)
			throws ZoologicoException {
		super(peso, porte, especie, habitat, alimentacao, idade, dataRecebida, nome, verificarSexo, verificarFilhotes,
				apelido);

		
	}

	@Override
	public String toString() {
		return "Peixe [getNome()=" + getNome() + ", getHabitat()=" + getHabitat() + ", getVerificarFilhotes()="
				+ getVerificarFilhotes() + ", getVerificarSexo()=" + getVerificarSexo() + ", getApelido()="
				+ getApelido() + ", getIdade()=" + getIdade() + ", getDataRecebida()=" + getDataRecebida()
				+ ", getPeso()=" + getPeso() + ", getPorte()=" + getPorte() + ", getSexo()=" + getSexo()
				+ ", getEspecie()=" + getEspecie() + ", getFilhote()=" + getFilhote() + ", getDataEntrada()="
				+ getDataEntrada() + ", getAlimentacao()=" + getAlimentacao() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
