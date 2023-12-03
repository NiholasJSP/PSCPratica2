package exceção;

class Divisao {
    // Método que efetua a divisão e repassa a exceção
    public static void dividir(int numerador, int denominador) throws ArithmeticException {
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