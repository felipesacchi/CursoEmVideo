package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.security.DigestOutputStream;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class TelaJogoAdivinhacao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogoAdivinhacao frame = new TelaJogoAdivinhacao();
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
	public TelaJogoAdivinhacao() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 509);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPensamento = new JLabel("");
		lblPensamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblPensamento.setVerticalAlignment(SwingConstants.TOP);
		lblPensamento.setToolTipText("");
		lblPensamento.setForeground(Color.BLACK);
		lblPensamento.setBounds(79, 92, 163, 82);
		contentPane.add(lblPensamento);
		lblPensamento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPensamento.setText("<html>Estou pensando em um número entre <b>1 e 5</b>. Tente adivinhar que valor é esse.</html>");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Felipe Sacchi\\OneDrive\\Imagens\\Java\\Genius.jpg"));
		lblNewLabel_1.setBounds(184, 215, 227, 227);
		contentPane.add(lblNewLabel_1);
		
		JSpinner txtValor = new JSpinner();
		txtValor.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtValor.setBounds(98, 299, 60, 36);
		contentPane.add(txtValor);
		
		JLabel lblNewLabel_2 = new JLabel("Valor");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(26, 305, 46, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Felipe Sacchi\\OneDrive\\Imagens\\Java\\balao.jpg"));
		lblNewLabel.setBounds(37, 26, 247, 204);
		contentPane.add(lblNewLabel);
		
		JButton btnPalpite = new JButton("Palpite");
		btnPalpite.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPalpite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numero = Integer.parseInt(txtValor.getValue().toString());
				int random = (int) (1 + (Math.random() * 5));
					
				String r1 = "<html>ACERTOU!</html>";
				String r2 = "<html>ERROU! Eu pensei no valor " + random + "</html>";
					
				String res = (random == numero)?r1:r2;
				
				lblPensamento.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblPensamento.setText(res);
				
				
			}
		});
		btnPalpite.setBounds(79, 364, 104, 36);
		contentPane.add(btnPalpite);
		
		
		

	}
}
