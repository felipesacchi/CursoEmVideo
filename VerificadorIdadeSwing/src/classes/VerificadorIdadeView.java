package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class VerificadorIdadeView extends JFrame {

	private JPanel contentPane;
	private JTextField txtAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerificadorIdadeView frame = new VerificadorIdadeView();
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
	public VerificadorIdadeView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 234, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		lblNewLabel.setBounds(12, 36, 116, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(39, 124, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Situa\u00E7\u00E3o");
		lblNewLabel_2.setBounds(39, 176, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		txtAno = new JTextField();
		txtAno.setBounds(145, 33, 56, 22);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIdade.setBounds(107, 124, 94, 16);
		contentPane.add(lblIdade);
		
		JLabel lblSituacao = new JLabel("<vazio>");
		lblSituacao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSituacao.setBounds(107, 176, 94, 16);
		contentPane.add(lblSituacao);
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		
		JButton btnCalc = new JButton("Calcular idade");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ano = Integer.parseInt(txtAno.getText());
				int idade = year - ano;
				if (idade>=16) {
					lblIdade.setText(Integer.toString(idade));
					String sit = ((idade>=16 && idade < 18) || (idade>70))?"É opcional":"Não é opcional";
					lblSituacao.setText(sit);
				} else {
					lblSituacao.setText("Proibido");
				}
				
			}
		});
		btnCalc.setBounds(39, 73, 128, 25);
		contentPane.add(btnCalc);
		

	}

}
