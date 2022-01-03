package supercalculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.Format;
import java.awt.event.ActionEvent;

public class SuperCalculadoraView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuperCalculadoraView frame = new SuperCalculadoraView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SuperCalculadoraView() {
		setResizable(false);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe um valor:");
		lblNewLabel.setBounds(12, 29, 154, 23);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(181, 31, 116, 22);
		txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JPanel panCalc = new JPanel();
		panCalc.setBounds(12, 65, 424, 196);
		contentPane.add(panCalc);
		panCalc.setLayout(null);
		
		panCalc.setVisible(false); //Deixa invisivio
		
		JLabel lblelevado = new JLabel("Elevado ao Cubo");
		lblelevado.setBounds(12, 48, 134, 29);
		panCalc.add(lblelevado);
		lblelevado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1 = new JLabel("Resto da divis\u00E3o por 2");
		lblNewLabel_1.setBounds(12, 13, 178, 29);
		panCalc.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblRaisQ = new JLabel("Raiz Quadrada");
		lblRaisQ.setBounds(12, 88, 191, 29);
		panCalc.add(lblRaisQ);
		lblRaisQ.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_4 = new JLabel("Raiz C\u00FAbica");
		lblNewLabel_4.setBounds(12, 130, 191, 29);
		panCalc.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_5 = new JLabel("Valor Absoluto");
		lblNewLabel_5.setBounds(12, 165, 191, 29);
		panCalc.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblResto = new JLabel("0");
		lblResto.setBounds(298, 19, 83, 16);
		panCalc.add(lblResto);
		lblResto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResto.setForeground(Color.BLUE);
		lblResto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblPow = new JLabel("0");
		lblPow.setBounds(298, 54, 83, 16);
		panCalc.add(lblPow);
		lblPow.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPow.setForeground(Color.BLUE);
		lblPow.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblRaizQ = new JLabel("0");
		lblRaizQ.setBounds(298, 94, 83, 16);
		panCalc.add(lblRaizQ);
		lblRaizQ.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRaizQ.setForeground(Color.BLUE);
		lblRaizQ.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblRaizC = new JLabel("0");
		lblRaizC.setBounds(298, 136, 83, 16);
		panCalc.add(lblRaizC);
		lblRaizC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRaizC.setForeground(Color.BLUE);
		lblRaizC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblAbs = new JLabel("0");
		lblAbs.setBounds(298, 171, 83, 16);
		panCalc.add(lblAbs);
		lblAbs.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAbs.setForeground(Color.BLUE);
		lblAbs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(320, 29, 116, 25);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panCalc.setVisible(true);
				int numero = Integer.parseInt(txtNumero.getText());
				
				int resto = numero % 2;
				lblResto.setText(Integer.toString(resto));
				
				float pow = (float) Math.pow(numero, 2);
				lblPow.setText(Float.toString(pow));
				
				float raizQ = (float) Math.sqrt(numero);
				lblRaizQ.setText(String.format("%.2f", raizQ));
				
				float raizC = (float)Math.cbrt(numero);
				lblRaizC.setText(String.format("%.2f", raizC));
				
				float abs = (float) Math.abs(numero);
				lblAbs.setText(Float.toString(abs));

			}
		});
		contentPane.add(btnCalcular);
		
		
	}
}
