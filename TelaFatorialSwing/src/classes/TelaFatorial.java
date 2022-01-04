package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class TelaFatorial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFatorial frame = new TelaFatorial();
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
	public TelaFatorial() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panResultado = new JPanel();
		panResultado.setBounds(14, 71, 410, 62);
		contentPane.add(panResultado);
		panResultado.setVisible(false);
		panResultado.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblFatorial = new JLabel("New label");
		lblFatorial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFatorial.setHorizontalAlignment(SwingConstants.RIGHT);
		panResultado.add(lblFatorial);
		
		JLabel lblResultado = new JLabel("New label");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultado.setHorizontalAlignment(SwingConstants.LEFT);
		panResultado.add(lblResultado);
		
		JSpinner txtValor = new JSpinner();
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtValor.setBounds(107, 29, 75, 31);
		contentPane.add(txtValor);
		
		JLabel lblNewLabel = new JLabel("Valor");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(14, 29, 75, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operadores fatorial = new Operadores();
				
				fatorial.setValor(Integer.parseInt(txtValor.getValue().toString()));
				
				panResultado.setVisible(true);
				
				lblFatorial.setText(fatorial.getFormula());
				lblResultado.setText(Integer.toString(fatorial.getFatorial()));
				
				
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalcular.setBounds(206, 29, 101, 31);
		contentPane.add(btnCalcular);
	}
}
