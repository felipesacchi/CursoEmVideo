package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class ParImparView extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;
	private JLabel lblResultado;
	private JButton btnVerificar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParImparView frame = new ParImparView();
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
	public ParImparView() {
		setType(Type.POPUP);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 228, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Valor");
		lblNewLabel.setBounds(40, 17, 48, 28);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtValor = new JTextField();
		txtValor.setBounds(119, 17, 52, 28);
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtValor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtValor.setText("0");
		txtValor.setColumns(10);
		
		lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(66, 124, 77, 22);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		btnVerificar = new JButton("Verificar");
		btnVerificar.setBounds(40, 63, 131, 31);
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor = Integer.parseInt(txtValor.getText());
				
				if (valor % 2 == 0) {
					lblResultado.setText("PAR");
				}else {
					lblResultado.setText("IMPAR");
				}
			}
		});
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(txtValor);
		contentPane.add(btnVerificar);
		contentPane.add(lblResultado);
	}

}
