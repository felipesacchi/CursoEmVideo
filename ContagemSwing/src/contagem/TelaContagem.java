package contagem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.text.Format;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.ListSelectionModel;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JScrollPane;

public class TelaContagem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContagem frame = new TelaContagem();
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
	public TelaContagem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("In\u00EDcio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 23, 54, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblFim_2 = new JLabel("Fim");
		lblFim_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFim_2.setBounds(10, 56, 54, 22);
		contentPane.add(lblFim_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Passo");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 89, 54, 22);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblInicio = new JLabel("-");
		lblInicio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInicio.setBounds(276, 23, 34, 22);
		contentPane.add(lblInicio);
		
		JLabel lblFim = new JLabel("-");
		lblFim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFim.setBounds(276, 56, 34, 22);
		contentPane.add(lblFim);
		
		JLabel lblPasso = new JLabel("-");
		lblPasso.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPasso.setBounds(276, 89, 34, 22);
		contentPane.add(lblPasso);
		
		JSlider slInicio = new JSlider();
		slInicio.setValue(0);
		slInicio.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int inicio = slInicio.getValue();
				lblInicio.setText(Integer.toString(inicio));
			}
		});
		slInicio.setMaximum(5);
		slInicio.setBounds(66, 23, 200, 26);
		contentPane.add(slInicio);
		
		JSlider slFim = new JSlider();
		slFim.setValue(6);
		slFim.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int fim = slFim.getValue();
				lblFim.setText(Integer.toString(fim));
			}
		});
		slFim.setMaximum(20);
		slFim.setMinimum(6);
		slFim.setBounds(66, 56, 200, 26);
		contentPane.add(slFim);
		
		JSlider slPasso = new JSlider();
		slPasso.setValue(1);
		slPasso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int passo = slPasso.getValue();
				lblPasso.setText(Integer.toString(passo));
			}
		});
		slPasso.setMinimum(1);
		slPasso.setMaximum(5);
		slPasso.setBounds(66, 89, 200, 26);
		contentPane.add(slPasso);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(305, 23, 119, 227);
		contentPane.add(scrollPane);
		
		JList<Integer> listResposta = new JList<Integer>();
		scrollPane.setViewportView(listResposta);
		
		JButton btnNewButton = new JButton("Contar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int inicio = slInicio.getValue();
				int fim = slFim.getValue();
				int passo = slPasso.getValue();
				
				DefaultListModel<Integer> lista = new DefaultListModel<Integer>();
				
				for (int i = inicio; i <= fim; i += passo) {
					lista.addElement(i);
				}
				
				listResposta.setModel(lista);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(108, 141, 104, 31);
		contentPane.add(btnNewButton);
		

		
		
		
	}
}
