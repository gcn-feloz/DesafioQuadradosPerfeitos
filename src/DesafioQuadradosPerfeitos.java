import java.util.*;

public class DesafioQuadradosPerfeitos {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        ArrayList<Double> quadradoPerf = new ArrayList<Double>();

        int a = 0; // menor numero de quadrados perfeitos.

        Boolean divPor2 = false;
        Boolean divPor3 = false;

        Double resultado = 0.0;

        for (int i = 0; i <= n; i++) {
            if (i * i >= n) {
                break;
            }
            quadradoPerf.add((double) (i * i)); // Adiciona na lista os Quadrados perfeitos
            System.out.println("contagem: " + i + " ²perf.: " + quadradoPerf.get(i));
        }
        System.out.println(quadradoPerf.size());

        for (int i = 0; i < (quadradoPerf.size()); i++) {

            if (n / 2d == quadradoPerf.get(i)) {
                System.out.println("é divisivo por 2:");
                System.out.println(n / 2);
                divPor2 = true;
                break;
            } else if (n / 3d == quadradoPerf.get(i)) {
                System.out.println("é divisivo por 3:");
                System.out.println(n / 3d);
                divPor3 = true;
                break;
            }
        }
        if (divPor2) {
            System.out.println("2");
        } else if (divPor3) {
            System.out.println("3");
        } else {
            for (int ii = quadradoPerf.size() - 1; ii > 0; ii--) {
                if (n == 0) {
                    break;
                }
                
                
                while (n >= quadradoPerf.get(ii)) {
                    System.out.println("N é menor ou igual: " + n + ">=" + quadradoPerf.get(ii) + ""
                        + (n >= quadradoPerf.get(ii)));
                    n = (int) (n - quadradoPerf.get(ii));
                    System.out.println("Valor de n: " + n);
                    a++;
                }
            }
            System.out.println("Menor quantidade de quadrados perfeitos é:" + a);
        }
    }

}
