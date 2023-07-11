import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int contador = contagemDeParesComDiferencaK(arr, k, n);
        System.out.println(contador);
    }

   private static int contagemDeParesComDiferencaK(int[] arr, int k, int n) {
        int contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++)
                if (arr[i] - arr[j] == k ||
                    arr[j] - arr[i] == k)
                    contador++;
        }

        return contador;
    }
}
