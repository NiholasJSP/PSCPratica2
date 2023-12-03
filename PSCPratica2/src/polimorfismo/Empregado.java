package polimorfismo;
public class Empregado {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Crie instâncias de Empregado, Gerente, Diretor
        Empregado empregado = new Empregado("Empregado1", 50000, 2020);
        Gerente gerente = new Gerente("Gerente1", 70000, 2018);
        Diretor diretor = new Diretor("Diretor1", 100000, 2015, "Secretaria1");

        // Adicione empregados à empresa
        empresa.adicionaEmpregado(empregado);
        empresa.adicionaEmpregado(gerente);
        empresa.adicionaEmpregado(diretor);

        // Reajuste de salários
        empresa.reajustaSalarios(10);

        // Exiba informações dos empregados
        System.out.println(empresa.mostrEmpregados());
    }

	public void reajustaSalario(double porcentagem) {
		// TODO Auto-generated method stub
		
	}
}