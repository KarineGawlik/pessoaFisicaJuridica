package br.com.karineg;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	
	public PessoaJuridica(String nome, String endereco, String cnpj) {
		super(nome, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public void mostrarDetalhes() {
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("CNPJ: " + cnpj);
	}
}
