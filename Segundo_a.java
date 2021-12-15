package br.com.generation.objeto;

public class Segundo_a {

	public static void main(String[] args) {
		
		Segundo_b aviao = new Segundo_b();
		
		System.out.println("O nome do avião é: " + aviao.construcao("Jatinho"));
		System.out.println("O modelo do avião é: " + aviao.construcao2("Embraer E7"));

	}

}
