import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();

        System.out.println("Responda 'sim' ou 'nao' para as seguintes perguntas:");
        fazerPergunta("Telefonou para a vítima?", respostas, scanner);
        fazerPergunta("Esteve no local do crime?", respostas, scanner);
        fazerPergunta("Mora perto da vítima?", respostas, scanner);
        fazerPergunta("Devia para a vítima?", respostas, scanner);
        fazerPergunta("Já trabalhou com a vítima?", respostas, scanner);

        int respostasPositivas = contarRespostasPositivas(respostas);
        String classificacao = getClassificacao(respostasPositivas);

        System.out.println("Classificação: " + classificacao);
    }

    public static void fazerPergunta(String pergunta, List<String> respostas, Scanner scanner) {
        System.out.print(pergunta + " ");
        String resposta = scanner.nextLine().toLowerCase();
        respostas.add(resposta);
    }

    public static int contarRespostasPositivas(List<String> respostas) {
        int contador = 0;
        for (String resposta : respostas) {
            if (resposta.equals("sim")) {
                contador++;
            }
        }
        return contador;
    }

    public static String getClassificacao(int respostasPositivas) {
        if (respostasPositivas == 5) {
            return "Assassino";
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            return "Cúmplice";
        } else if (respostasPositivas == 2) {
            return "Suspeita";
        } else {
            return "Inocente";
        }
    }
}
