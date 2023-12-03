package exceção;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisãoInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador (dividendo): ");
            int numerador = scanner.nextInt();

            System.out.print("Digite o denominador (divisor): ");
            int denominador = scanner.nextInt();

            // Chamada do método que realiza a divisão
            realizarDivisao(numerador, denominador);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero!");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira números inteiros.");
        } finally {
            scanner.close();
        }
    }

    // Método que efetua a divisão e repassa a exceção
    private static void realizarDivisao(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }

        if (numerador < 0) {
            throw new ArithmeticException("Numerador menor que 0!");
        }

        int resultado = numerador / denominador;
        System.out.println("Resultado da divisão: " + resultado);
    }
}