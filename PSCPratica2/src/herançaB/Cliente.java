package herançaB;

public class Cliente extends Pessoa2 {
    private double credMax;
    private double valorEmDivida;

    // Construtores, getters e setters

    public double obterSaldo() {
        return credMax - valorEmDivida;
    }
}