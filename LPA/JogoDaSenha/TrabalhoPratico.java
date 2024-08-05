import java.util.Random;
import java.util.Scanner;

public class TrabalhoPratico {
    public static void main(String[] args) {
        JogoDaSenha jogo = new JogoDaSenha();
        jogo.iniciar();
    }
}

class JogoDaSenha {
    void iniciar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int senha[] = new int[4];

        // Gerar a senha aleatória
        for (int i = 0; i < senha.length; i++) {
            senha[i] = random.nextInt(5) + 1; // números de 1 a 5
        }

        System.out.println("Senha gerada (para teste): " + senha[0] + " " + senha[1] + " " + senha[2] + " " + senha[3]);

        // Permitir 10 tentativas
        for (int i = 0; i < 10; i++) {
            System.out.print("\nDê o seu palpite: ");
            String jogada = scanner.nextLine();
            int palpite[] = converteJogadaDeStringParaInt(jogada);

            // Verificar se o palpite está válido
            if (palpite.length == 4) {
                int totalCorretos = qtdNumerosCorretos(palpite, senha);
                System.out.println("Total de dígitos corretos (em posição correta e equivocada): " + totalCorretos);
            } else {
                System.out.println("Por favor, adicione exatamente 4 números.");
            }
        }

        scanner.close();
    }

    static int[] converteJogadaDeStringParaInt(String palpite) {
        int[] palpiteInts = new int[4];
        int j = 0;
        try {
            for (int i = 0; i < palpite.length(); i++) {
                if (Character.isDigit(palpite.charAt(i))) {
                    int num = Integer.parseInt(String.valueOf(palpite.charAt(i)));
                    if (num != 0 && j < 4) { // garante que apenas 4 números serão adicionados
                        palpiteInts[j] = num;
                        j++;
                    }
                }
            }
            if (j != 4) {
                throw new ArrayIndexOutOfBoundsException(); // Gera erro se não houver 4 números
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Jogada inválida. Por favor, adicione apenas 4 números.");
        }

        return palpiteInts;
    }

    static int qtdNumerosCorretos(int[] palpite, int[] senha) {
        int corretos = 0;
        boolean[] senhaUsada = new boolean[senha.length]; // Para controlar quais dígitos da senha já foram contados

        // Contar dígitos corretos em posição correta
        for (int i = 0; i < palpite.length; i++) {
            if (palpite[i] == senha[i]) {
                corretos++;
                senhaUsada[i] = true; // Marca a posição como usada
            }
        }

        // Contar dígitos corretos em posição equivocada
        for (int i = 0; i < palpite.length; i++) {
            for (int j = 0; j < senha.length; j++) {
                if (palpite[i] == senha[j] && !senhaUsada[j] && i != j) {
                    corretos++; // Aumenta o contador se for um dígito correto na posição equivocada
                    senhaUsada[j] = true; // Marca a posição como usada
                    break; // Sai do loop interno para não contar o mesmo dígito mais de uma vez
                }
            }
        }

        return corretos;
    }
}
