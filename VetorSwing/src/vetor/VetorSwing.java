package vetor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class VetorSwing extends JFrame {
	
	

	private JPanel contentPane;
	
	int vetor[] = new int[5];
	DefaultListModel<Integer> lista = new DefaultListModel<>();
	int selecionado = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VetorSwing frame = new VetorSwing();
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
	public VetorSwing() {
		
		for (int i = 0; i < vetor.length; i++) {
			lista.addElement(vetor[i]);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner txtNum = new JSpinner();
		txtNum.setBounds(20, 11, 61, 30);
		txtNum.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(txtNum);
		
		JLabel lblNewLabel = new JLabel("vetor");
		lblNewLabel.setBounds(217, 11, 52, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
		
		JLabel lblSelecionado = new JLabel("[]");
		lblSelecionado.setBounds(329, 11, 35, 22);
		lblSelecionado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSelecionado.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblSelecionado);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(217, 44, 147, 283);
		contentPane.add(scrollPane);
		
				JList<Integer> lstVetor = new JList<Integer>();
				lstVetor.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						selecionado = lstVetor.getSelectedIndex();
						lblSelecionado.setText("[" + selecionado + "]");
					}
				});
				scrollPane.setViewportView(lstVetor);
				lstVetor.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lstVetor.setModel(lista);
		
		JButton btnAdd = new JButton("Adicionar");
		btnAdd.setBounds(98, 11, 109, 30);
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vetor[selecionado] = Integer.parseInt(txtNum.getValue().toString());
				lista.removeAllElements();
				for (int i = 0; i < vetor.length; i++) {
					lista.addElement(vetor[i]);
				}
			}
		});
		contentPane.add(btnAdd);
		
		JButton btnRemove = new JButton("Remover");
		btnRemove.setBounds(98, 52, 109, 30);
		btnRemove.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vetor[selecionado] = 0;
				lista.removeAllElements();
				for (int i = 0; i < vetor.length; i++) {
					lista.addElement(vetor[i]);
				}
			}
		});
		contentPane.add(btnRemove);
		
		JButton btnOrdem = new JButton("Ordenar");
		btnOrdem.setBounds(98, 93, 109, 30);
		btnOrdem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOrdem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arrays.sort(vetor);
				lista.removeAllElements();
				for (int i = 0; i < vetor.length; i++) {
					lista.addElement(vetor[i]);
				}
			} 
		});
		contentPane.add(btnOrdem);
		

	}
}
