package vetor01;

import java.util.Iterator;

public class Vetor01 {
	
	public static void main(String[] args) {
		
		int n[] = {3,2,8,7,5,4};
		
		System.out.println("Total de casas de n " + n.length);
		
		for (int i = 0; i < n.length; i++) {
			System.out.println("Na posição " + i + " temos o valor " + n[i]);
		}
	}

}
