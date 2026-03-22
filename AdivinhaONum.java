import java.util.Scanner;
import java.util.Random;

public class AdivinhaONum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 5;
        boolean acertou = false;

        System.out.println("**** Seja bem-vindo ao Jogo ****");
        System.out.println("Quero ver você acertar o número entre 1 e 100.");

        while (tentativas > 0 && !acertou) {
            System.out.println("\nVocê tem " + tentativas + " tentativas.");
            System.out.print("Digite um número: ");

            if (!scan.hasNextInt()) {
                System.out.println("ERRO: Digite apenas números inteiros.");
                scan.next();
                continue;
            }

            int palpite = scan.nextInt();
            tentativas--;

            if (palpite == numeroSecreto) {
                acertou = true;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR que " + palpite);
            } else {
                System.out.println("O número secreto é MENOR que " + palpite);
            }
        }

        if (acertou) {
            System.out.println("\nParabéns! Você acertou o número secreto: " + numeroSecreto);
        } else {
            System.out.println("\nVocê perdeu! O número secreto era " + numeroSecreto);
        }

        scan.close();
    }
}