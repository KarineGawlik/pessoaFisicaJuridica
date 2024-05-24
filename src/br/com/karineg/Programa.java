package br.com.karineg;

public class Programa {

	public static void main(String[] args) {
		PessoaFisica pessoaFisica = new PessoaFisica("Karine Gawlik", "Rua Bernardo Jacinto da Veiga,1565","111.222.333-44");
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa AltaDigital", "Rua 15 de Novembro, 1800", "00.111.789/0001-99");
		
		pessoaFisica.mostrarDetalhes();
		System.out.println();
		pessoaJuridica.mostrarDetalhes();
	}

}
