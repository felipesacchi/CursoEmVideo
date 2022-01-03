package com.cursoemvideo.soma;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaSoma extends JFrame {
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSoma frame = new TelaSoma();
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
	public TelaSoma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 159);
		getContentPane().setLayout(null);
		
		txtN1 = new JTextField();
		txtN1.setHorizontalAlignment(SwingConstants.CENTER);
		txtN1.setBounds(41, 31, 62, 43);
		getContentPane().add(txtN1);
		txtN1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setBounds(115, 31, 32, 43);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
		txtN2 = new JTextField();
		txtN2.setHorizontalAlignment(SwingConstants.CENTER);
		txtN2.setBounds(159, 31, 62, 43);
		getContentPane().add(txtN2);
		txtN2.setColumns(10);
		
		JLabel lblSoma = new JLabel("0");
		lblSoma.setBounds(319, 31, 62, 43);
		lblSoma.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblSoma);
		
		JButton btnSoma = new JButton("=");
		btnSoma.setBounds(245, 31, 62, 43);
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txtN1.getText());
				int n2 = Integer.parseInt(txtN2.getText());
				int s = n1 + n2;
				lblSoma.setText(Integer.toString(s));
			}
		});
		getContentPane().add(btnSoma);
		
		
		
	}

}
