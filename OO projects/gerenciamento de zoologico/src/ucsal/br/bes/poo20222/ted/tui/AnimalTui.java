package ucsal.br.bes.poo20222.ted.tui;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ucsal.br.bes.poo20222.ted.domain.Animal;
import ucsal.br.bes.poo20222.ted.domain.Ave;
import ucsal.br.bes.poo20222.ted.domain.Mamifero;
import ucsal.br.bes.poo20222.ted.domain.Peixe;
import ucsal.br.bes.poo20222.ted.domain.Reptil;
import ucsal.br.bes.poo20222.ted.exception.ZoologicoException;
import ucsal.br.bes.poo20222.ted.persistence.AnimalDao;

public class AnimalTui {

	static Scanner scan = new Scanner(System.in);

	public static void menu() {

		System.out.println("Menu de Gerenciamento de Animais");
		System.out.println("Para começar, este animal eh um (1)mamifero, (2)ave, (3)reptil ou (4)peixe?");
		int i = scan.nextInt();
		switch (i) {
		case 1:
			cadastrarMamifero();
			break;
		case 2:
			cadastrarAve();
			break;
		case 3:
			cadastrarReptil();
			break;
		case 4:
			cadastrarPeixe();
			break;
		default:
			throw new IllegalArgumentException("Esta não é uma escolha valida");
		}

	}

	public static void cadastrarMamifero() {
		Mamifero mamifero = new Mamifero();
		try {
			System.out.println("Informe A especie do Animal");
			scan.nextLine();
			String especie = scan.nextLine();
			mamifero.setEspecie(especie);
			System.out.println("Informe o nome do animal");
			String nome = scan.nextLine();
			System.out.println("Agora informe o sexo do Animal(M)(F)");
			char verificarSexo = scan.next().charAt(0);
			mamifero.setVerificarSexo(verificarSexo);
			System.out.println("Informe o habitat");
			scan.nextLine();
			String habitat = scan.nextLine();
			System.out.println("Informe o peso do Animal em quilos por favor");
			Double peso = scan.nextDouble();
			mamifero.setPeso(peso);
			System.out.println("Informe o porte do animal entre pequeno, medio e grande.");
			String porte = scan.next();
			mamifero.setPorte(porte);
			System.out.println("Informe a Idade do animal");
			Integer idade = scan.nextInt();
			mamifero.setIdade(idade);
			System.out.println("Informe a data de entrada desse animal (dd/MM/yyyy");
			String dataRecebida = scan.next();
			System.out.println("Este animal tem filhotes? (s)/(n)");
			char verificarFilhotes = scan.next().charAt(0);
			mamifero.setVerificarFilhotes(verificarFilhotes);
			System.out.println("Qual o tipo de alimentacao deste Animal? Ele eh carnivoro, herbivoro ou onivoro?");
			String alimentacao = scan.next();
			mamifero.setAlimentacao(alimentacao);
			System.out.println("Informe o Apelido do Animal dentro do zoologico");
			scan.nextLine();
			String apelido = scan.nextLine();
			AnimalDao.adcicionar(new Mamifero(peso, porte, especie, habitat, alimentacao, idade, dataRecebida, nome,
					verificarSexo, verificarFilhotes, apelido));
		} catch (ZoologicoException e) {
			System.out.println(e.getMessage());
			System.out.println("ANIMAL NÃO CADASTRADO");
		}

	}

	public static void cadastrarAve() {
		Ave ave = new Ave();
		try {
			System.out.println("Informe A especie do Animal");
			scan.nextLine();
			String especie = scan.nextLine();
			ave.setEspecie(especie);
			System.out.println("Informe o nome do animal");
			String nome = scan.nextLine();
			System.out.println("Agora informe o sexo do Animal(M)(F)");
			char verificarSexo = scan.next().charAt(0);
			ave.setSexo(nome);
			System.out.println("Informe o habitat");
			scan.nextLine();
			String habitat = scan.nextLine();

			System.out.println("Informe o peso do Animal em quilos por favor");
			Double peso = scan.nextDouble();
			ave.setPeso(peso);
			System.out.println("Informe o porte do animal entre pequeno, medio e grande.");
			String porte = scan.next();
			ave.getPorte();
			System.out.println("Informe a Idade do animal");
			Integer idade = scan.nextInt();
			ave.setIdade(idade);
			System.out.println("Informe a data de entrada desse animal (dd/MM/yyyy");
			String dataRecebida = scan.next();

			System.out.println("Este animal tem filhotes? (s)/(n)");
			char verificarFilhotes = scan.next().charAt(0);
			ave.setVerificarFilhotes(verificarFilhotes);
			System.out.println("Qual o tipo de alimentacao deste Animal? Ele eh carnivoro, herbivoro ou onivoro?");
			String alimentacao = scan.next();
			ave.setAlimentacao(alimentacao);
			System.out.println("Informe o Apelido do Animal dentro do zoologico");
			scan.nextLine();
			String apelido = scan.nextLine();

			AnimalDao.adcicionar(new Ave(peso, porte, especie, habitat, alimentacao, idade, dataRecebida, nome,
					verificarSexo, verificarFilhotes, apelido));
		} catch (ZoologicoException e) {
			System.out.println(e.getMessage());
			System.out.println("ANIMAL NÃO CADASTRADO");
		}

	}

	public static void cadastrarReptil() {
		Reptil reptil = new Reptil();
		try {
			System.out.println("Informe A especie do Animal");
			scan.nextLine();
			String especie = scan.nextLine();
			reptil.setEspecie(especie);
			System.out.println("Informe o nome do animal");
			String nome = scan.nextLine();
			System.out.println("Agora informe o sexo do Animal(M)(F)");
			char verificarSexo = scan.next().charAt(0);
			reptil.setSexo(nome);
			System.out.println("Informe o habitat");
			scan.nextLine();
			String habitat = scan.nextLine();

			System.out.println("Informe o peso do Animal em quilos por favor");
			Double peso = scan.nextDouble();
			reptil.setPeso(peso);
			System.out.println("Informe o porte do animal entre pequeno, medio e grande.");
			String porte = scan.next();
			reptil.getPorte();
			System.out.println("Informe a Idade do animal");
			Integer idade = scan.nextInt();
			reptil.setIdade(idade);
			System.out.println("Informe a data de entrada desse animal (dd/MM/yyyy");
			String dataRecebida = scan.next();

			System.out.println("Este animal tem filhotes? (s)/(n)");
			char verificarFilhotes = scan.next().charAt(0);
			reptil.setVerificarFilhotes(verificarFilhotes);
			System.out.println("Qual o tipo de alimentacao deste Animal? Ele eh carnivoro, herbivoro ou onivoro?");
			String alimentacao = scan.next();
			reptil.setAlimentacao(alimentacao);
			System.out.println("Informe o Apelido do Animal dentro do zoologico");
			scan.nextLine();
			String apelido = scan.nextLine();

			AnimalDao.adcicionar(new Reptil(peso, porte, especie, habitat, alimentacao, idade, dataRecebida, nome,
					verificarSexo, verificarFilhotes, apelido));
		} catch (ZoologicoException e) {
			System.out.println(e.getMessage());
			System.out.println("ANIMAL NÃO CADASTRADO");
		}

	}

	public static void cadastrarPeixe() {
		Peixe peixe = new Peixe();
		try {
			System.out.println("Informe A especie do Animal");
			scan.nextLine();
			String especie = scan.nextLine();
			peixe.setEspecie(especie);
			System.out.println("Informe o nome do animal");
			String nome = scan.nextLine();
			System.out.println("Agora informe o sexo do Animal(M)(F)");
			char verificarSexo = scan.next().charAt(0);
			peixe.setSexo(nome);
			System.out.println("Informe o habitat");
			scan.nextLine();
			String habitat = scan.nextLine();

			System.out.println("Informe o peso do Animal em quilos por favor");
			Double peso = scan.nextDouble();
			peixe.setPeso(peso);
			System.out.println("Informe o porte do animal entre pequeno, medio e grande.");
			String porte = scan.next();
			peixe.getPorte();
			System.out.println("Informe a Idade do animal");
			Integer idade = scan.nextInt();
			peixe.setIdade(idade);
			System.out.println("Informe a data de entrada desse animal (dd/MM/yyyy");
			String dataRecebida = scan.next();

			System.out.println("Este animal tem filhotes? (s)/(n)");
			char verificarFilhotes = scan.next().charAt(0);
			peixe.setVerificarFilhotes(verificarFilhotes);
			System.out.println("Qual o tipo de alimentacao deste Animal? Ele eh carnivoro, herbivoro ou onivoro?");
			String alimentacao = scan.next();
			peixe.setAlimentacao(alimentacao);
			System.out.println("Informe o Apelido do Animal dentro do zoologico");
			scan.nextLine();
			String apelido = scan.nextLine();

			AnimalDao.adcicionar(new Peixe(peso, porte, especie, habitat, alimentacao, idade, dataRecebida, nome,
					verificarSexo, verificarFilhotes, apelido));
		} catch (ZoologicoException e) {
			System.out.println(e.getMessage());
			System.out.println("ANIMAL NÃO CADASTRADO");
		}
	}

	public static void listarAnimaisCadastrados() {
		System.out.println("*********** LISTAGEM DE ANIMAIS ***********");
		Integer cont = 1;
		for (Animal animal : AnimalDao.obterTodosAnimais()) {
			System.out.println("\n");
			System.out.println("ANIMAL POSIÇÃO: " + cont );
			System.out.println("Nome: " + animal.getNome());
			System.out.println("Apelido: " + animal.getApelido());
			System.out.println("Espécie: " + animal.getEspecie());
			System.out.println("Idade: " + animal.getIdade() + " Anos");
			System.out.println("Peso: " + animal.getPeso() + " Quilos");
			System.out.println("Porte: " + animal.getPorte());
			System.out.println("Sexo: " + animal.getSexo());
			System.out.println("Habitate: " + animal.getHabitat());
			System.out.println("Filhote: " + animal.getHaFilhote());
			System.out.println("Alimentação: " + animal.getAlimentacao());
			System.out.println(
					"Data de entrada: " + animal.getDataEntrada().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			cont++;

		}
	}

	public static void removerAnimais() {
		listarAnimaisCadastrados();
		System.out.println("Informe a posição Do animal que deseja retirar");
		Integer position = scan.nextInt();
		AnimalDao.remover(position-(1));

	}

}
