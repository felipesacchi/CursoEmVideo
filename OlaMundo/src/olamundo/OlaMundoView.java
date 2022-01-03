package olamundo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class OlaMundoView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlaMundoView frame = new OlaMundoView();
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
	public OlaMundoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblText = new JLabel("Clique para escrever");
		lblText.setForeground(Color.RED);
		lblText.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblText.setHorizontalAlignment(SwingConstants.CENTER);
		lblText.setBounds(77, 69, 288, 59);
		contentPane.add(lblText);
		
		JButton btnClick = new JButton("Clique!");
		btnClick.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblText.setText("Olá, Mundo!");
			}
		});
		btnClick.setBounds(150, 176, 125, 25);
		contentPane.add(btnClick);
	}
}
