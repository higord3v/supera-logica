import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Double quantia = sc.nextDouble();
        Double quantiaCopia = quantia;

        Double numeroVezes100 = (quantiaCopia * 100.00);
        int numeroInteiro = numeroVezes100.intValue();

        List<Integer> valores = List.of(
            10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5
        );
        
        var resto = numeroInteiro;
        System.out.println("NOTAS:");
        for (int valor: valores) {
            resto = calcular(valor, resto);
        }
    }

    public static int calcular(int valor, int restoAnterior) {
        int resultado = restoAnterior / valor;
        var tipoValor = "nota(s)";
        if (valor <= 100) {
            if (valor == 100) {
                System.out.println("MOEDAS:");
            }
            tipoValor = "moeda(s)";
        }
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);
        var numeroSaida = df.format(Double.valueOf(valor)/100);

        var saida = resultado+" "+tipoValor+" de R$ "+ numeroSaida;

        System.out.println(saida);
        int resto = restoAnterior % valor;
        return resto;
    }
}
