package testefuncao01;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class TesteFuncao01 {
	
	static void soma(int a, int b) {
		int s = a + b;
		System.out.println("A soma é : " + s);
	}
	
	static int soma2(int a, int b) {
		int s = a + b;
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Começou o programa");
		soma(5,2);
		int sm = soma2(5, 2);
		
		System.out.println("A soma vale: " + sm);

	}

}
