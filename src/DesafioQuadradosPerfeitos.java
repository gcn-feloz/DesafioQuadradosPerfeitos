import java.util.*;

public class DesafioQuadradosPerfeitos {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        ArrayList<Integer> quadradoPerf = new ArrayList<Integer>();

        int a = 0; // menor numero de quadrados perfeitos.

        for (int i = 0; i <= n; i++) {
            if (i * i >= n) {
                break;
            }
            quadradoPerf.add(i * i); // Adiciona na lista os Quadrados perfeitos
            System.out.println("contagem: " + i + " ²perf.: " + quadradoPerf.get(i));
        }
        System.out.println(quadradoPerf.size());

        for (int i = 0; i < (quadradoPerf.size()); i++) {
            // System.out.println("Verificando: " + i);

            if (n / 2 == quadradoPerf.get(i)) {
                System.out.println("é divisivo por 2:");
                System.out.println(n / 2);
            } else if (n / 3 == quadradoPerf.get(i)) {
                System.out.println("é divisivo por 3:");
                System.out.println(n / 3;
            }

        }

        // // i--;
        // // System.out.println("Finalizou contagem, agora vai subtrair");
        // // System.out.println("n: " + n);
        // // System.out.println("i: " + i);
        // // System.out.println("d[i]: " + d[i]);
        // // System.out.println("Subtraindo " + n + "-" + d[i]);
        // // n = n-d[i];
        // // i--;
        // System.out.println("Valor de i: " + i);
        // for (int ii = i; ii > 0; ii--) {
        // System.out.println("--Entrou no FOR--");

        // System.out.println("N é menor ou igual que d[ii]: " + n + ">=" + d[ii] + " :
        // " + (n >= d[ii]));
        // if (n >= d[ii]) {
        // n = n - d[ii];
        // System.out.println("Valor de n: " + n);
        // a++;
        // }

        // }
        // System.out.println("Menor quantidade de quadrados perfeitos é:" + a);

    }

}
