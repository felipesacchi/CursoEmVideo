package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite o valor da nota: ");
		float nota = sc.nextFloat();
		
		System.out.println("A nota �: " + nota);
		System.out.printf("A nota de %s �: %.2f", nome, nota);
		

	}

}
