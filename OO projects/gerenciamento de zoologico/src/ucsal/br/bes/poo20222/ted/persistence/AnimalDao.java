package ucsal.br.bes.poo20222.ted.persistence;

import java.util.ArrayList;
import java.util.List;

import ucsal.br.bes.poo20222.ted.domain.Animal;

public class AnimalDao {

	private static List<Animal> animais = new ArrayList<>();

	public static void adcicionar(Animal animal) {
		animais.add(animal);

	}

	public static List<Animal> obterTodosAnimais() {
		return new ArrayList<>(animais);
	}

	public static void remover(Integer position) {
		animais.remove(animais.get(position));
	}
}
