package herançaB;

public class Vendedor extends Empregado {
    private double valorProducao;
    private double comissao;

    // Construtores, getters e setters

    @Override
    public double calcularSalario() {
		return comissao;
        // Implementação específica para Operario
    }
}


//Exemplo de uso
