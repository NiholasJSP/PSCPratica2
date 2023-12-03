package algoritimosdeordenação;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenação {
	   // Método de ordenação - Bolha
    public static void ordenarBolha(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    // Método de ordenação - Seleção
    public static void ordenarSelecao(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    // Atualiza o índice do menor elemento
                    indiceMinimo = j;
                }
            }

            // Troca os elementos se necessário
            int temp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = temp;
        }
    }

    // Método de ordenação - Inserção
    public static void ordenarInsercao(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;

            // Move os elementos do vetor[0..i-1] que são maiores que a chave para uma posição à frente de sua posição atual
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
    }

    // Método para exibir o vetor
    public static void exibirVetor(int[] vetor) {
        System.out.println("Vetor Ordenado: " + Arrays.toString(vetor));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        while (true) {
            System.out.println("\nEscolha o método de ordenação:");
            System.out.println("1. Bolha");
            System.out.println("2. Seleção");
            System.out.println("3. Inserção");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            if (opcao == 4) {
                break;
            }

            System.out.println("Digite 10 números para serem ordenados:");

            for (int i = 0; i < 10; i++) {
                vetor[i] = scanner.nextInt();
            }

            switch (opcao) {
                case 1:
                    ordenarBolha(vetor);
                    break;
                case 2:
                    ordenarSelecao(vetor);
                    break;
                case 3:
                    ordenarInsercao(vetor);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            exibirVetor(vetor);
        }

        System.out.println("Programa encerrado.");

        scanner.close();
    }
}