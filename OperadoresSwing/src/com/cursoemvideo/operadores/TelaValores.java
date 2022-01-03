package com.cursoemvideo.operadores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaValores extends JFrame {

	private JPanel contentPane;
	private JTextField textNum;
	private JTextField textDen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaValores frame = new TelaValores();
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
	public TelaValores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNum = new JTextField();
		textNum.setBounds(136, 32, 116, 22);
		contentPane.add(textNum);
		textNum.setColumns(10);
		
		textDen = new JTextField();
		textDen.setBounds(136, 86, 116, 22);
		contentPane.add(textDen);
		textDen.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numerador:");
		lblNewLabel.setBounds(26, 32, 98, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Denominador:");
		lblNewLabel_1.setBounds(26, 86, 98, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Divis\u00E3o");
		lblNewLabel_2.setBounds(42, 202, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblDiv = new JLabel("0");
		lblDiv.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiv.setBounds(170, 202, 56, 16);
		contentPane.add(lblDiv);
		
		JLabel lblNewLabel_4 = new JLabel("Resto");
		lblNewLabel_4.setBounds(42, 247, 56, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblResto = new JLabel("0");
		lblResto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResto.setBounds(170, 247, 56, 16);
		contentPane.add(lblResto);
		
		JLabel lblNewLabel_4_1 = new JLabel("Raiz quadrada");
		lblNewLabel_4_1.setBounds(42, 291, 116, 16);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblRaiz = new JLabel("0");
		lblRaiz.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRaiz.setBounds(170, 291, 56, 16);
		contentPane.add(lblRaiz);
		
		
		JButton btDividir = new JButton("Dividir");
		btDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numerador = Integer.parseInt(textNum.getText());
				int denominador = Integer.parseInt(textDen.getText());
				float div = numerador / denominador;
				float resto = numerador % denominador;
				float raiz = (float) Math.sqrt(numerador);
				
				lblDiv.setText(Float.toString(div));
				lblResto.setText(Float.toString(resto));
				lblRaiz.setText(Double.toString(raiz));
			}
		});
		btDividir.setBounds(91, 149, 97, 25);
		contentPane.add(btDividir);
		


	}
}
