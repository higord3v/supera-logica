import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n+1];
        for (int i = 0; i <= n; i++) {
                arr[i] = sc.nextLine();
        }
        String[] arr2 = new String[n];
        for (int i = n; i > 0; i--) {
            arr2[i - 1] = arr[i];
        }

        decifrarFrases(arr2, n);
    }

    public static void decifrarFrases(String[] arr, int n) {
        String[] frasesFinais = new String[n];
        for (int i = 0; i < n; i++) {
            
            var fraseAtual = arr[i];
            var fraseFinal = "";

            int metade = fraseAtual.length() / 2;
            var esquerda = fraseAtual.substring(0, metade);
            var direita = fraseAtual.substring(metade);
            char caracter;
            var esquerdaFinal = "";
            var direitaFinal = "";

            
            for (int j=0; j<esquerda.length(); j++) {
                caracter = esquerda.charAt(j); 
                esquerdaFinal= caracter+esquerdaFinal;
            }

            for (int k=0; k<direita.length(); k++) {
                caracter = direita.charAt(k);
                direitaFinal= caracter+direitaFinal;
            }

            fraseFinal = esquerdaFinal+direitaFinal;
            frasesFinais[i] = fraseFinal;
        }

        for (int i = 0; i < n; i++) {
            var frase = frasesFinais[i];
            System.out.println(frase);
        }
    }
}
