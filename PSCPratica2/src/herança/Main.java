package herança;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				DclasseCadastro cadastro = new DclasseCadastro(10);

				// Cadastrar Pessoa Física
				BClassePessoaFisica pessoaFisica = new BClassePessoaFisica();
				System.out.println("Cadastro de Pessoa Física:");
				System.out.print("Nome: ");
				pessoaFisica.setNome(scanner.nextLine());
				System.out.print("CPF: ");
				pessoaFisica.setCPF(scanner.nextLine());
				cadastro.cadastrarPessoa(pessoaFisica);

				// Cadastrar Pessoa Jurídica
				CClassePessoaJuridica pessoaJuridica = new CClassePessoaJuridica();
				System.out.println("Cadastro de Pessoa Jurídica:");
				System.out.print("Nome: ");
				pessoaJuridica.setNome(scanner.nextLine());
				System.out.print("CNPJ: ");
				pessoaJuridica.setCNPJ(scanner.nextLine());
				cadastro.cadastrarPessoa(pessoaJuridica);

				// Imprimir Cadastro
				cadastro.imprimirCadastro();
			}
	    }
	}

