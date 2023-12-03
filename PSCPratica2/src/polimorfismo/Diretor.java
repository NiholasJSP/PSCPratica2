package polimorfismo;

public class Diretor extends Empregado {
    private String nomeSecretaria;

    public Diretor(String nome, double salario, int anoContratacao, String nomeSecretaria) {
        super(nome, salario, anoContratacao);
        this.nomeSecretaria = nomeSecretaria;
    }

    // Adicione getters e setters se necessário

    @Override
    public void reajustaSalario(double porcentagem) {
        // Lógica específica para o reajuste de salário do Diretor
        super.reajustaSalario(porcentagem);
    }

    @Override
    public String toString() {
        return super.toString() + "\nNome da Secretaria: " + nomeSecretaria;
    }
}{

}
