package comparacaostring;

public class ComparacaoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome1 = "Felipe";
		String nome2 = "Felipe";
		String nome3 = new String("Felipe");
		String res;
		
		res = (nome1==nome2)?"igual":"diferente";
		System.out.println(res);
		res = (nome1==nome3)?"igual":"diferente";
		System.out.println(res);
		res = (nome1.equals(nome3))?"igual":"diferente";
		System.out.println(res);
		
	}

}
