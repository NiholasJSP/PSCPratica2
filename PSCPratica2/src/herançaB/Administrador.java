package herançaB;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    // Construtores, getters e setters

    @Override
    public double calcularSalario() {
		return ajudaDeCusto;
        // Implementação específica para Administrador
    }
}