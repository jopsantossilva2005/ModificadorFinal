package teste;

import java.util.Scanner;

import dominio.Conversao;

public class ConversaoTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conversao conversao = new Conversao();
		
		System.out.println("Digite valor em reais: ");
		conversao.setValorReal(sc.nextDouble());
		System.out.print("Digite cotacao dolar: ");
		conversao.setCotacaoDolar(sc.nextDouble());
		sc.close();
		
		conversao.imprimir();
		
	}

}
