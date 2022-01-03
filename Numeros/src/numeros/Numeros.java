package numeros;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, s=0;
		String resp;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			n = sc.nextInt();
			s += n;
			System.out.print("Quer continuar? [S/N] ");
			resp = sc.next();
		} while (resp.equals("S") || resp.equals("s"));
		System.out.println("A soma de todos os valores é " + s);
	
		

	}

}
