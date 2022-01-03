package calculadoraidade;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class CalculadoraIdade extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraIdade frame = new CalculadoraIdade();
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
	public CalculadoraIdade() {
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 285);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento:");
		lblNewLabel.setBounds(12, 68, 121, 16);
		contentPane.add(lblNewLabel);
		
		JSpinner txtAN = new JSpinner();
		txtAN.setModel(new SpinnerNumberModel(new Integer(1500), new Integer(1500), null, new Integer(1)));
		txtAN.setBounds(132, 65, 81, 22);
		contentPane.add(txtAN);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(39, 197, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setForeground(Color.RED);
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setBounds(104, 185, 56, 36);
		contentPane.add(lblIdade);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Felipe Sacchi\\OneDrive\\Imagens\\Java\\images (1).jpg"));
		lblNewLabel_3.setBounds(192, 13, 243, 231);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Ano atual:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(12, 13, 83, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblAN = new JLabel("");
		lblAN.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAN.setForeground(Color.BLUE);
		lblAN.setBounds(104, 13, 56, 16);
		contentPane.add(lblAN);
		lblAN.setText(Integer.toString(year));
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int an = Integer.parseInt(txtAN.getValue().toString());
				int id = year - an;
				lblIdade.setText(Integer.toString(id));
			}
		});
		btnCalc.setBounds(52, 117, 97, 25);
		contentPane.add(btnCalc);
		

		

	}
}
