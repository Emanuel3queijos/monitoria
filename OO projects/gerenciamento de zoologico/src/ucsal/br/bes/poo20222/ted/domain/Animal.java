package ucsal.br.bes.poo20222.ted.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ucsal.br.bes.poo20222.ted.exception.ZoologicoException;

public abstract class Animal {

	private Double peso;
	private String apelido;
	private String porte;
	private String sexo;
	private String especie;
	private String habitat;
	private Boolean filhote;
	private String haFilhote;
	private String alimentacao;
	private Integer idade;
	private LocalDate dataEntrada;
	private String nome;
	private String dataRecebida;
	private char verificarSexo;
	private char verificarFilhotes;

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(Double peso, String porte, String especie, String habitat, String alimentacao, Integer idade,
			String dataRecebida, String nome, char verificarSexo, char verificarFilhotes, String apelido)
			throws ZoologicoException {
		super();
		this.habitat = habitat;
		this.nome = nome;
		this.apelido = apelido;
		setDataRecebida(dataRecebida);
		setVerificarFilhotes(verificarFilhotes);
		setVerificarSexo(verificarSexo);
		setIdade(idade);
		setEspecie(especie);
		setPeso(peso);
		setPorte(porte);
		setAlimentacao(alimentacao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public char getVerificarFilhotes() {
		return verificarFilhotes;
	}

	public void setVerificarFilhotes(char verificarFilhotes) throws ZoologicoException {
		validarHaFilhote(verificarFilhotes);
		if (Character.toLowerCase(verificarFilhotes) == 's') {
			setFilhote(true);
		} else {
			setFilhote(false);
		}
		this.verificarFilhotes = verificarFilhotes;
	}

	public char getVerificarSexo() {
		return verificarSexo;
	}

	public void setVerificarSexo(char verificarSexo) throws ZoologicoException {
		validarSexoAnimal(verificarSexo);
		this.verificarSexo = verificarSexo;
		if (Character.toLowerCase(verificarSexo) == 'f') {
			setSexo("Femenino");
		} else if (Character.toLowerCase(verificarSexo) == 'm') {
			setSexo("Masculino");

		}
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) throws ZoologicoException {
		validarIdadeAnimal(idade);
		this.idade = idade;

	}

	public String getDataRecebida() {
		return dataRecebida;
	}

	public void setDataRecebida(String dataRecebida) {
		this.dataRecebida = dataRecebida;

		LocalDate datetime = LocalDate.parse(dataRecebida, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		setDataEntrada(datetime);

	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) throws ZoologicoException {
		validadarPesoAnimal(peso);
		this.peso = peso;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) throws ZoologicoException {
		validadePorteAnimal(porte);
		this.porte = porte;

	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) throws ZoologicoException {
		validarEspecieAnimal(especie);
		this.especie = especie;

	}

	public Boolean getFilhote() {
		return filhote;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;

	}

	public void setFilhote(Boolean filhote) {
		if (filhote == true) {
			setHaFilhote("tem filhote");
		} else {
			setHaFilhote("não tem filhote");
		}
		this.filhote = filhote;

	}

	public String getHaFilhote() {
		return haFilhote;
	}

	public void setHaFilhote(String haFilhote) {
		this.haFilhote = haFilhote;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) throws ZoologicoException {
		validarTipoAlimentação(alimentacao);
		this.alimentacao = alimentacao;
	}

	private void validarIdadeAnimal(Integer idade) throws ZoologicoException {
		if (idade <= 0) {
			throw new ZoologicoException("A idade do animal não pode ser negativa, nem menor que zero");
		}
	}

	private void validadarPesoAnimal(Double peso) throws ZoologicoException {
		if (peso <= 0) {
			throw new ZoologicoException("O peso do animal não pode ser negativo ou igual a zero");
		}
	}

	private void validarEspecieAnimal(String especie) throws ZoologicoException {
		if (especie == null) {
			throw new ZoologicoException("o animal deve ter uma espécie ");

		}
	}

	private void validadePorteAnimal(String porte) throws ZoologicoException {
		if (!porte.equals("pequeno") && !porte.equals("medio") && !porte.equals("grande")) {
			throw new ZoologicoException("O porte esta errado. Informe entre pequeno, medio e grande");
		}

	}

	private void validarSexoAnimal(char verificarSexo) throws ZoologicoException {
		if (Character.toLowerCase(verificarSexo) != 'f' && Character.toLowerCase(verificarSexo) != 'm') {
			throw new ZoologicoException("O Animal deve ter um sexo valido, !=(m)/(f)");

		}
	}

	private void validarTipoAlimentação(String alimentacao) throws ZoologicoException {

		if (!alimentacao.toLowerCase().equals("carnivoro") && !alimentacao.toLowerCase().equals("herbivoro")
				&& !alimentacao.toLowerCase().equals("onivoro")) {
			throw new ZoologicoException("O animal deve ser carnivoro, herbivoro ou onivoro");
		}

	}

	private void validarHaFilhote(char verificarFilhotes) throws ZoologicoException {
		if (Character.toLowerCase(verificarFilhotes) != 's' && Character.toLowerCase(verificarFilhotes) != 'n') {
			throw new ZoologicoException("Valor informado invalido, !=(s)/(n)");
		}
	}

	@Override
	public String toString() {
		return "Animal [peso=" + peso + ", apelido=" + apelido + ", porte=" + porte + ", sexo=" + sexo + ", especie="
				+ especie + ", habitat=" + habitat + ", filhote=" + filhote + ", haFilhote=" + haFilhote
				+ ", alimentacao=" + alimentacao + ", idade=" + idade + ", dataEntrada=" + dataEntrada + ", nome="
				+ nome + ", dataRecebida=" + dataRecebida + ", verificarSexo=" + verificarSexo + ", verificarFilhotes="
				+ verificarFilhotes + "]";
	}

}