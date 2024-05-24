package br.com.karineg;

public class PessoaFisica extends Pessoa {
	private String cpf;

	public PessoaFisica(String nome, String endereco, String cpf) {
		super(nome, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void mostrarDetalhes() {
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("CPF: " + cpf);
	}
}
