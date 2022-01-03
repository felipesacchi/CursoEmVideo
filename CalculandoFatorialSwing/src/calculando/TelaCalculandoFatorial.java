package calculando;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import java.awt.Color;
import java.awt.Font;
import java.util.Iterator;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;

public class TelaCalculandoFatorial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculandoFatorial frame = new TelaCalculandoFatorial();
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
	public TelaCalculandoFatorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("! = ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(145, 107, 68, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblResposta = new JLabel("1");
		lblResposta.setForeground(Color.RED);
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblResposta.setBounds(211, 107, 213, 47);
		contentPane.add(lblResposta);
		
		JSpinner btnValores = new JSpinner();
		btnValores.setModel(new SpinnerNumberModel(0, 0, 12, 1));
		btnValores.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int valor = Integer.parseInt(btnValores.getValue().toString());
				int resultado = 1;
				
				while (valor > 1) {
					resultado *= valor;
					valor--;
				}
					
				lblResposta.setText(Integer.toString(resultado));
			}
		});
		btnValores.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnValores.setBackground(new Color(240, 240, 240));
		btnValores.setBounds(60, 107, 75, 47);
		contentPane.add(btnValores);
	}
}
