import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner nomes = new Scanner(System.in);
        System.out.println("Informe a lista de nomes, separados por vírgula");

        String resp = nomes.next();
        String[] vetor = resp.split(",");
        String temp = "";
        int i = 0;
        int j = 0;

        for(i=0; i<vetor.length; i++) {
            for(j = 0; j<vetor.length-1; j++){

                int resultado = vetor[j].compareTo(vetor[j+1]);

                if (resultado > 0) {
                    temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1]  = temp;
                }
            }
        };

        System.out.println("Lista de nomes informados");

        for(i=0; i<vetor.length; i++) {
            System.out.println("" + vetor[i]);
        }

        // --------------------------------------------------- //

        Scanner pessoas = new Scanner(System.in);
        System.out.println("Informe a lista de nomes e sexo, separados por vírgula");

        String resposta = pessoas.next();
        String[] vector = resposta.split(",");

        Map<Integer, String> masculinos = new HashMap<>();
        Map<Integer, String> femininos = new HashMap<>();

        int l = 0;

        for(int k=0; k<vector.length; k++) {
            String[] yyy = vector[k].split("-");
            String aa = yyy[0];
            String bb = yyy[1];

            l++;

            if (bb.equals("m")) {
                masculinos.put(l, aa);
            } else if (bb.equals("f")) {
                femininos.put(l, aa);
            } else {
                System.out.println("Sexo de " + aa + " não é válido.");
            }
        }

        System.out.println("Lista de nomes do sexo masculino");
        masculinos.values().stream().forEach(System.out::println);

        System.out.println("Lista de nomes do sexo feminino");
        femininos.values().stream().forEach(System.out::println);
    }
}