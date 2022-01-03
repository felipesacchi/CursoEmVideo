package programaidade;

import java.util.Calendar;
import java.util.Scanner;

public class ProgramaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.print("Que ano você nasceu: ");
		int nasc = sc.nextInt();
		int idade = year - nasc;
		System.out.println("Sua idade é: " + idade);
		if (idade>=18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
		
		sc.close();

	}

}
