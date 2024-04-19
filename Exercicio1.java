import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> temperaturasMensais = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média do mês " + (i+1) + ": ");
            temperaturasMensais.add(scanner.nextDouble());
        }

        double soma = 0;
        for (double temperatura : temperaturasMensais) {
            soma += temperatura;
        }
        double mediaAnual = soma / 12;

        System.out.println("Temperaturas acima da média anual (" + mediaAnual + "):");
        for (int i = 0; i < 12; i++) {
            if (temperaturasMensais.get(i) > mediaAnual) {
                System.out.println("Mês " + (i+1) + " - " + nomeMes(i+1) + ": " + temperaturasMensais.get(i));
            }
        }
        scanner.close();
    }

    public static String nomeMes(int mes) {
        switch (mes) {
            case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Mês inválido";
        }
    }
}