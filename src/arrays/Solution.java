package arrays;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete a função 'reverseArray' abaixo.
     *
     * A função espera retornar uma LISTA DE INTEIROS.
     * A função aceita uma LISTA DE INTEIROS a como parâmetro.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        // Inicializando os índices inicial e final
        int start = 0;
        int end = a.size() - 1;

        // Continua o loop até que os índices se cruzem
        while (start < end) {
            // Armazenando temporariamente o valor inicial
            int temp = a.get(start);
            // Trocando o valor inicial pelo valor final
            a.set(start, a.get(end));
            // Colocando o valor temporário no fim
            a.set(end, temp);
            // Movendo o índice inicial para frente e o final para trás
            start++;
            end--;
        }

        // Retorna a lista após inverter todos os elementos
        return a;
    }

    public static List<Integer> alternativeReverseArray(List<Integer> a){
        Collections.reverse(a);
        return a;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Lê o número de elementos na lista
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        // Lê a linha de entrada e a divide em elementos separados por espaço
        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // Criação da lista de inteiros
        List<Integer> arr = new ArrayList<>();

        // Preenche a lista com os elementos da entrada
        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        // Chama a função 'reverseArray' e guarda o resultado
        List<Integer> res = Result.reverseArray(arr);

        // Escreve o resultado no buffer, separando os números por espaço
        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));
            if (i != res.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        // Fecha os buffers de leitura e escrita
        bufferedReader.close();
        bufferedWriter.close();
    }
}
