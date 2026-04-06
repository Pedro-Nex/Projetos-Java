import java.util.Scanner;
public class CalculoMediaArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;
        for(int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scan.nextDouble();
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.println("A média das notas é: " + media);
        scan.close();
    }
}