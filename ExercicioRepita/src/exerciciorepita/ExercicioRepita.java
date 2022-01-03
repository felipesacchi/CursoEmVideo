package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, soma =0, tValores=0, tPar=0, tImpar=0, t100=0, media=0;
		
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog(null,
					"<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
			soma += n;
			if (n != 0) {
				tValores++;
			}
			if(n > 100) {
				t100++;
			}
			if ((n % 2) == 0 & n !=0) {
				tPar++;
			} else 
				tImpar++;
			
			
			
		} while (n != 0);
		JOptionPane.showMessageDialog(null, "<html>Resultado final<hr>" + 
											"<br>Total de Valores: " + tValores +
											"<br>Total de Pares: " + tPar +
											"<br>Total de Ímpares: " + tImpar +
											"<br>Acima de 100: " + t100 +
											"<br>Média dos valores: " + (soma/tValores) +
											"</html>");

	}

}
