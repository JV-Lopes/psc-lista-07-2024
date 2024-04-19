import java.util.ArrayList;

public class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<Double> vendasBrutas = new ArrayList<>();
        vendasBrutas.add(3000.0);
        vendasBrutas.add(500.0);
        vendasBrutas.add(800.0);
        vendasBrutas.add(1200.0);
        vendasBrutas.add(10000.0);

        int[] contadores = new int[9];

        for (double vendaBruta : vendasBrutas) {
            double salario = 200 + (0.09 * vendaBruta);
            if (salario >= 200 && salario < 300) {
                contadores[0]++;
            } else if (salario >= 300 && salario < 400) {
                contadores[1]++;
            } else if (salario >= 400 && salario < 500) {
                contadores[2]++;
            } else if (salario >= 500 && salario < 600) {
                contadores[3]++;
            } else if (salario >= 600 && salario < 700) {
                contadores[4]++;
            } else if (salario >= 700 && salario < 800) {
                contadores[5]++;
            } else if (salario >= 800 && salario < 900) {
                contadores[6]++;
            } else if (salario >= 900 && salario < 1000) {
                contadores[7]++;
            } else {
                contadores[8]++;
            }
        }

        int inicioIntervalo = 200;
        int fimIntervalo = 299;
        for (int contador : contadores) {
            System.out.println("$" + inicioIntervalo + " - $" + fimIntervalo + ": " + contador + " vendedores");
            inicioIntervalo += 100;
            fimIntervalo += 100;
        }
        System.out.println("$1000 em diante: " + contadores[8] + " vendedores");
    }
}
