package contador01;

public class Contador01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cc = 0;
		while (cc < 10) {
			cc++;
			if (cc == 5 || cc == 7 || cc == 9) {
				continue;
			}
			System.out.println("Cambalhota " + cc);
		}

	}

}
