package ordenção;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenação {
    public static void bolha(int[] vetor) {
        int n = vetor.length;
        boolean trocou;

        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    // Troca os elementos
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }
    public static void selecao(int[] vetor) {
    	
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            // Troca os elementos
            int temp = vetor[i];
            vetor[i] = vetor[indiceMenor];
            vetor[indiceMenor] = temp;
        }
    }

    public static void insercao(int[] vetor) {
        int n = vetor.length;

        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            vetor[j + 1] = chave;
        }
    }

    public static void quicksort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = particiona(vetor, inicio, fim);
            quicksort(vetor, inicio, posicaoPivo - 1);
            quicksort(vetor, posicaoPivo + 1, fim);
        }
    }

    private static int particiona(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1;
        int f = fim;

        while (i <= f) {
            if (vetor[i] <= pivo) {
                i++;
            } else if (pivo < vetor[f]) {
                f--;
            } else {
                // Troca os elementos
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }

        // Reposiciona o pivo
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }

    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    private static void merge(int[] vetor, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        int[] ladoEsquerdo = Arrays.copyOfRange(vetor, inicio, inicio + n1);
        int[] ladoDireito = Arrays.copyOfRange(vetor, meio + 1, meio + 1 + n2);

        int i = 0, j = 0, k = inicio;

        while (i < n1 && j < n2) {
            if (ladoEsquerdo[i] <= ladoDireito[j]) {
                vetor[k] = ladoEsquerdo[i];
                i++;
            } else {
                vetor[k] = ladoDireito[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            vetor[k] = ladoEsquerdo[i];
            i++;
            k++;
        }

        while (j < n2) {
            vetor[k] = ladoDireito[j];
            j++;
            k++;
        }
    }
}}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nEscolha o método de ordenação:");
            System.out.println("1. Bolha");
            System.out.println("2. Seleção");
            System.out.println("3. Inserção");
            System.out.println("4. QuickSort");
            System.out.println("5. MergeSort");
            System.out.println("0. Sair");

            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;
            }

            System.out
        }