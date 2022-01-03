package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class EquacaoSegundoGrauView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EquacaoSegundoGrauView frame = new EquacaoSegundoGrauView();
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
	public EquacaoSegundoGrauView() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 327);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("x\u00B2 +");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(154, 45, 42, 24);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblX = new JLabel("x +");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblX.setBounds(281, 45, 42, 24);
		contentPane.add(lblX);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("= 0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(408, 45, 42, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("\u0394 = ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(154, 110, 36, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblValorB = new JLabel("b");
		lblValorB.setForeground(Color.RED);
		lblValorB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblValorB.setBounds(206, 110, 17, 24);
		contentPane.add(lblValorB);
		
		
		JSpinner txtValorB = new JSpinner();
		txtValorB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblValorB.setText(txtValorB.getValue().toString());
			}
		});
		txtValorB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtValorB.setBounds(206, 43, 65, 29);
		contentPane.add(txtValorB);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("- 4 .");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(225, 108, 35, 29);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("\u00B2");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(217, 96, 17, 24);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblValorA = new JLabel("a");
		lblValorA.setForeground(Color.RED);
		lblValorA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblValorA.setBounds(270, 110, 17, 24);
		contentPane.add(lblValorA);
		
		JSpinner txtValorA = new JSpinner();
		txtValorA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblValorA.setText(txtValorA.getValue().toString());
			}
		});
		txtValorA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtValorA.setBounds(79, 43, 65, 29);
		contentPane.add(txtValorA);
		
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel(".");
		lblNewLabel_1_1_3_1.setBackground(Color.BLACK);
		lblNewLabel_1_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_3_1.setBounds(293, 110, 6, 24);
		contentPane.add(lblNewLabel_1_1_3_1);
		
		JLabel lblValorC = new JLabel("c");
		lblValorC.setForeground(Color.RED);
		lblValorC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblValorC.setBounds(309, 110, 17, 24);
		contentPane.add(lblValorC);
		
		
		JSpinner txtValorC = new JSpinner();
		txtValorC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblValorC.setText(txtValorC.getValue().toString());
			}
		});
		txtValorC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtValorC.setBounds(333, 43, 65, 29);
		contentPane.add(txtValorC);
		
		JPanel panResposta = new JPanel();
		panResposta.setBounds(79, 196, 371, 74);
		contentPane.add(panResposta);
		panResposta.setLayout(null);
		panResposta.setVisible(false);
		
		JLabel lblNewLabel_1_2 = new JLabel("\u0394 = ");
		lblNewLabel_1_2.setBounds(23, 10, 36, 22);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panResposta.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Tipo = ");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(23, 42, 59, 22);
		panResposta.add(lblNewLabel_1_2_1);
		
		JLabel lblValorDelta = new JLabel("Delta");
		lblValorDelta.setForeground(Color.BLUE);
		lblValorDelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblValorDelta.setBounds(69, 10, 168, 22);
		panResposta.add(lblValorDelta);
		
		JLabel lblResposta = new JLabel("Resposta");
		lblResposta.setForeground(Color.BLUE);
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResposta.setBounds(90, 42, 271, 22);
		panResposta.add(lblResposta);
		
		
		
		
		
		JButton btnCalcularDelta = new JButton("Calcular \u0394");
		btnCalcularDelta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valorA = Integer.parseInt(txtValorA.getValue().toString());
				int valorB = Integer.parseInt(txtValorB.getValue().toString());
				int valorC = Integer.parseInt(txtValorC.getValue().toString());
				
				
				float delta = (float)Math.pow(valorB, 2) - (4* valorA * valorC);
				
				lblValorDelta.setText(String.format("%.2f", delta));
			
				if (delta >= 0) {
					lblResposta.setText("Existem raízes Reais");
				}else {
					lblResposta.setText("Não existem raízes Reais");
				}
				panResposta.setVisible(true);
			}
			
		});

		
		btnCalcularDelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalcularDelta.setBounds(179, 144, 132, 28);
		contentPane.add(btnCalcularDelta);
	}
}
