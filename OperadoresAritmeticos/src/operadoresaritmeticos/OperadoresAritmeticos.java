package operadoresaritmeticos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 3;
		int n2 = 5;
		float m = (n1+n2)/2;
		
		System.out.println("A média é igual a " + m);
		System.out.println("=========================");
		int numero = 5;
		int valor =  5 + numero--;
		System.out.println(valor);
		System.out.println(numero);
		
		System.out.println("=========================");
		
		int x = 4;
		x *= 2;
		System.out.println(x);
		
		System.out.println("=========================");
		
		float v = 8.3f;
		int af = (int) Math.floor(v);
		int ac = (int) Math.ceil(v);
		int ar = (int) Math.round(v);
		
		System.out.println(af);
		System.out.println(ac);
		System.out.println(ar);
		
		System.out.println("=========================");
		
		double ale = Math.random();
		int n = (int) ( ale * 5);
		System.out.println(n);
	}

}
