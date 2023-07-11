import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Integer lines = sc.nextInt();

        var impares = new ArrayList<Integer>();
        var pares = new ArrayList<Integer>();

        for (int i = 0; i < lines; i++) {
            var proximoNumero = sc.nextInt();
            if (proximoNumero % 2 == 0) {
                pares.add(proximoNumero);
            }else {
                impares.add(proximoNumero);
            }
        }

        var result = new ArrayList<Integer>();
        
        for (int i: impares) {
            result.add(i);
        }
        for (int i: pares) {
            result.add(i);
        }

        for (int i: result) {
            System.out.println(i);
        }
    }
}
