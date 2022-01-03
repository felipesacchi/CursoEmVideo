package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		float n1 = sc.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float n2 = sc.nextFloat();
		float m = (n1+n2)/2;
		
		System.out.println("Sua média foi " + m);
		
		if (m>9) {
			System.out.println("Parabéns");
		}
		
		sc.close();

	}

}
