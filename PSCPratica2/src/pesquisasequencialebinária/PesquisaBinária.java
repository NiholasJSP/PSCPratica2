package pesquisasequencialebinária;

import java.util.Arrays;
import java.util.Scanner;

public class PesquisaBinária {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        // Preencher o vetor ordenado
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Garante que o vetor está ordenado
        Arrays.sort(vetor);

        // Realizar pesquisas binárias
        while (true) {
            System.out.print("\nDigite o número a ser pesquisado (ou -1 para sair): ");
            int numeroPesquisar = scanner.nextInt();

            if (numeroPesquisar == -1) {
                break;
            }

            int comparacoes = buscaBinaria(vetor, numeroPesquisar);

            System.out.println("Número de comparações: " + comparacoes);
        }

        scanner.close();
    }

    // Busca binária
    private static int buscaBinaria(int[] vetor, int elemento) {
        int comparacoes = 0;
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == elemento) {
                return comparacoes + 1; // Retorna o número de comparações
            } else if (vetor[meio] < elemento) {
                comparacoes++;
                inicio = meio + 1;
            } else {
                comparacoes++;
                fim = meio - 1;
            }
        }

        return comparacoes + 1; // Se não encontrar, retorna o número total de comparações
    }
}