package Vista;


import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class erregistroV extends JFrame {

	private JTextField tFIzena;
	private JTextField tFAbizena;
	private JTextField tFEmail;
	private JTextField tFpasahitza;
	private JTextField tFjaiotzeData;
	private JPanel contentPane;

	public erregistroV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel lblErregistatu = new JLabel("Erregistratu");
		lblErregistatu.setHorizontalAlignment(SwingConstants.CENTER);
		lblErregistatu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblErregistatu.setBounds(137, 11, 146, 22);
		getContentPane().add(lblErregistatu);
		
		JLabel lblIzena = new JLabel("Izena:");
		lblIzena.setHorizontalAlignment(SwingConstants.CENTER);
		lblIzena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIzena.setBounds(76, 62, 46, 14);
		getContentPane().add(lblIzena);
		
		JLabel lblAbizena = new JLabel("Abizena:");
		lblAbizena.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbizena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAbizena.setBounds(66, 93, 65, 14);
		getContentPane().add(lblAbizena);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(76, 118, 46, 14);
		getContentPane().add(lblEmail);
		
		JLabel lblPasahitza = new JLabel("Pasahitza:");
		lblPasahitza.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPasahitza.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasahitza.setBounds(66, 143, 71, 14);
		getContentPane().add(lblPasahitza);
		
		JLabel lblJaiotzeData = new JLabel("Jaiotze-Data");
		lblJaiotzeData.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblJaiotzeData.setHorizontalAlignment(SwingConstants.CENTER);
		lblJaiotzeData.setBounds(43, 168, 101, 14);
		getContentPane().add(lblJaiotzeData);
		
		tFIzena = new JTextField();
		tFIzena.setBounds(171, 61, 86, 20);
		getContentPane().add(tFIzena);
		tFIzena.setColumns(10);
		
		tFAbizena = new JTextField();
		tFAbizena.setBounds(171, 92, 86, 20);
		getContentPane().add(tFAbizena);
		tFAbizena.setColumns(10);
		
		tFEmail = new JTextField();
		tFEmail.setBounds(171, 117, 86, 20);
		getContentPane().add(tFEmail);
		tFEmail.setColumns(10);
		
		tFpasahitza = new JTextField();
		tFpasahitza.setBounds(171, 142, 86, 20);
		getContentPane().add(tFpasahitza);
		tFpasahitza.setColumns(10);
		
		JButton btnErregistratu = new JButton("Erregistratu");
		btnErregistratu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				//Comprobar que los campos no esten vacios
				if(tFIzena.getText().isEmpty() || tFAbizena.getText().isEmpty() || tFEmail.getText().isEmpty() || tFpasahitza.getText().isEmpty() || tFjaiotzeData.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Mesedez, bete eremu guztiak", "Errorea", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Erregistroa ondo burutu da", "Ondo", JOptionPane.INFORMATION_MESSAGE);
					workoutsV workouts = new workoutsV();
					workouts.setVisible(true);
					dispose();
				}
			}
		});
		btnErregistratu.setBounds(76, 212, 112, 23);
		getContentPane().add(btnErregistratu);
		
		JButton btnAtzera = new JButton("Atzera");
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginV login = new loginV();
				login.setVisible(true);
				dispose();
			}
		});
		btnAtzera.setBounds(244, 212, 89, 23);
		getContentPane().add(btnAtzera);
		
		tFjaiotzeData = new JTextField();
		tFjaiotzeData.setBounds(171, 167, 86, 20);
		getContentPane().add(tFjaiotzeData);
		tFjaiotzeData.setColumns(10);
		
		JLabel lblLogo = new JLabel("LOGO");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogo.setBounds(10, 7, 65, 33);
		contentPane.add(lblLogo);


	}
}
