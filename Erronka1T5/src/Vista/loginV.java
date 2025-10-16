package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginV extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public loginV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSaioaHasi = new JButton("Saioa Hasi");
		btnSaioaHasi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//comprobar que el usuario y la contraseña son correctos y llevar a siguiente ventana
				workoutsV workouts = new workoutsV();
				loginV loginV = new loginV();
				workouts.setVisible(true);
				loginV.setVisible(false);
			}
		});
		btnSaioaHasi.setBounds(168, 179, 127, 23);
		contentPane.add(btnSaioaHasi);
		
		
		JButton btnErregistro = new JButton("Erregistratu\r\n");
		btnErregistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				erregistroV erregistro = new erregistroV();
				loginV loginV = new loginV();
				erregistro.setVisible(true);
				loginV.setVisible(false);
				dispose();
			}
		});
		btnErregistro.setBounds(168, 214, 127, 23);
		contentPane.add(btnErregistro);
		
		JLabel lblSaioaHasi = new JLabel("Saioa Hasi");
		lblSaioaHasi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSaioaHasi.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaioaHasi.setBounds(153, 11, 104, 23);
		contentPane.add(lblSaioaHasi);
		
		JLabel lblIzena = new JLabel("Izena");
		lblIzena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIzena.setHorizontalAlignment(SwingConstants.CENTER);
		lblIzena.setBounds(50, 78, 89, 14);
		contentPane.add(lblIzena);
		
		JLabel lblPasahitza = new JLabel("Pasahitza:");
		lblPasahitza.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPasahitza.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasahitza.setBounds(50, 120, 89, 14);
		contentPane.add(lblPasahitza);
		
		textField = new JTextField();
		textField.setBounds(168, 78, 127, 17);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(168, 120, 127, 17);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

	}
}
