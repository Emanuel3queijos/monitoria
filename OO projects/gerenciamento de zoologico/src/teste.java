import java.util.Random;

public class teste {

	public static void main(String[] args) {

		Random gerador = new Random();
		Integer idAcesso = null;
		for (int i = 0; i < 1; i++) {
			idAcesso = gerador.nextInt(1000000000);
		}
		System.out.println(idAcesso);
	}

}
