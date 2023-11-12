package att;

import java.util.Random;

public class ATTFAZER {
    public static void main(String[] args) {
        int[] vetor = new int[30];
        Random rand = new Random();

        // Preenche o vetor com números aleatórios entre 0 e 30
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(31);
        }

        // Imprime o vetor original
        System.out.println("Vetor original:");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Ordena o vetor em ordem decrescente usando o método da bolha
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] < vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        // Imprime o vetor ordenado
        System.out.println("Vetor ordenado:");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}