package pesquisasequencialebinária;

import java.util.Arrays;
import java.util.Scanner;

public class UniaoConjuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        // Preencher os vetores
        preencherVetor(scanner, vetorA, "A");
        preencherVetor(scanner, vetorB, "B");

        // Garante que os vetores estão ordenados
        Arrays.sort(vetorA);
        Arrays.sort(vetorB);

        // Criar conjuntos A e B
        int[] conjuntoA = criarConjunto(vetorA);
        int[] conjuntoB = criarConjunto(vetorB);

        // Calcular a união entre A e B (C = A ∪ B)
        int[] conjuntoC = uniaoConjuntos(conjuntoA, conjuntoB);

        // Exibir conjuntos
        exibirConjunto(conjuntoA, "A");
        exibirConjunto(conjuntoB, "B");
        exibirConjunto(conjuntoC, "C");

        scanner.close();
    }

    private static void exibirConjunto(int[] conjuntoA, String string) {
		// TODO Auto-generated method stub
		
	}

	// Preencher vetor a partir do teclado
    private static void preencherVetor(Scanner scanner, int[] vetor, String nome) {
        System.out.println("Digite os números para o vetor " + nome + ":");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número na posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }
    }

    // Criar conjunto a partir do vetor
    private static int[] criarConjunto(int[] vetor) {
        int tamanhoConjunto = vetor.length;
        int[] conjunto = new int[tamanhoConjunto];
        int indiceConjunto = 0;

        for (int i = 0; i < tamanhoConjunto; i++) {
            if (i == 0 || vetor[i] != vetor[i - 1]) {
                conjunto[indiceConjunto++] = vetor[i];
            }
        }

        return Arrays.copyOf(conjunto, indiceConjunto);
    }



    // Calcular união entre conjuntos A e B
    private static int[] uniaoConjuntos(int[] conjuntoA, int[] conjuntoB) {
        int tamanhoC = conjuntoA.length + conjuntoB.length;
        int[] conjuntoC = new int[tamanhoC];
        int indiceC = 0;

        int i = 0, j = 0;

        while (i < conjuntoA.length && j < conjuntoB.length) {
            if (conjuntoA[i] < conjuntoB[j]) {
                conjuntoC[indiceC++] = conjuntoA[i++];
            } else if (conjuntoA[i]}
    }
}
    