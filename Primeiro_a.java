package br.com.generation.objeto;

public class Primeiro_a {

	public static void main(String[] args) {
		
		Primeiro_b Pessoa = new Primeiro_b();
		
		System.out.println("Nome: " + Pessoa.Nome2("Cristiano Ronaldo"));
		System.out.println("RG: " + Pessoa.rg2("111111111"));
		System.out.println("CPF: " + Pessoa.cpf2("11111111111"));
		System.out.println("Endereço: " + Pessoa.endereco2("Rua da Champions, 10"));

	}

}
