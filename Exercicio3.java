import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Digite as notas (para encerrar, digite '-1'):");

        double nota;
        do {
            nota = scanner.nextDouble();
            if (nota != -1) {
                notas.add(nota);
            }
        } while (nota != -1);

        System.out.println("Quantidade de valores lidos: " + notas.size());

        System.out.println("Valores informados:");
        for (double valor : notas) {
            System.out.print(valor + " ");
        }
        System.out.println();

        System.out.println("Valores na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        double soma = 0;
        for (double valor : notas) {
            soma += valor;
        }
        System.out.println("Soma dos valores: " + soma);

        double media = soma / notas.size();
        System.out.println("Média dos valores: " + media);

        int acimaMedia = 0;
        for (double valor : notas) {
            if (valor > media) {
                acimaMedia++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + acimaMedia);

        int abaixoSete = 0;
        for (double valor : notas) {
            if (valor < 7) {
                abaixoSete++;
            }
        }
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoSete);

        scanner.close();

        System.out.println("Programa encerrado.");
    }
}
