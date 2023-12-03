package pesquisasequencialebinária;

import java.util.Scanner;

public class PesquisaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        // Preencher o vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Realizar pesquisas sequenciais
        while (true) {
            System.out.print("\nDigite o número a ser pesquisado (ou -1 para sair): ");
            int numeroPesquisar = scanner.nextInt();

            if (numeroPesquisar == -1) {
                break;
            }

            System.out.print("Escolha o algoritmo de busca (1 - Sequencial, 2 - Sequencial com Sentinela): ");
            int opcao = scanner.nextInt();

            int comparacoes = 0;

            switch (opcao) {
                case 1:
                    comparacoes = buscaSequencial(vetor, numeroPesquisar);
                    break;
                case 2:
                    comparacoes = buscaSequencialSentinela(vetor, numeroPesquisar);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("Número de comparações: " + comparacoes);
        }

        scanner.close();
    }

    // Busca sequencial
    private static int buscaSequencial(int[] vetor, int elemento) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                return i + 1; // Retorna o número de comparações
            }
        }
        return vetor.length; // Se não encontrar, retorna o total de elementos como comparações
    }

    // Busca sequencial com sentinela
    private static int buscaSequencialSentinela(int[] vetor, int elemento) {
        int i = 0;
        vetor[vetor.length - 1] = elemento; // Sentinela

        while (vetor[i] != elemento) {
            i++;
        }

        return i + 1; // Retorna o número de comparações
    }
}
