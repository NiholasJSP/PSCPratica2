package herança;

public class DclasseCadastro {
	 private AClassePessoa[] vetorCadastro;
	    private int quantidadePessoas;

	    public DclasseCadastro(int tamanho) {
	        vetorCadastro = new AClassePessoa[tamanho];
	        quantidadePessoas = 0;
	    }

	    public void cadastrarPessoa(AClassePessoa pessoa) {
	        if (quantidadePessoas < vetorCadastro.length) {
	            vetorCadastro[quantidadePessoas] = pessoa;
	            quantidadePessoas++;
	            System.out.println("Pessoa cadastrada com sucesso!");
	        } else {
	            System.out.println("Cadastro cheio. Impossível cadastrar mais pessoas.");
	        }
	    }

	    public void imprimirCadastro() {
	        System.out.println("Lista de Cadastro:");
	        for (int i = 0; i < quantidadePessoas; i++) {
	            System.out.println("Nome: " + vetorCadastro[i].getNome());
	            if (vetorCadastro[i] instanceof BClassePessoaFisica) {
	                System.out.println("CPF: " + ((BClassePessoaFisica) vetorCadastro[i]).getCPF());
	            } else if (vetorCadastro[i] instanceof CClassePessoaJuridica) {
	                System.out.println("CNPJ: " + ((CClassePessoaJuridica) vetorCadastro[i]).getCNPJ());
	            }
	            System.out.println("---------------------");
	        }
	    }
	}