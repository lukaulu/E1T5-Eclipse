package Vista;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {
	
	// Paneles 
	private fondoPanel panelSaioaHasi;
	private JPanel panelEregistro;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Vista() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("Gimnasioa - Saioa Hasi");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Panel de Inicio
        panelSaioaHasi = new fondoPanel();
        panelSaioaHasi.setBounds(0, 0, 450, 300);
        panelSaioaHasi.setLayout(null);
        getContentPane().add(panelSaioaHasi);

        JLabel lblTitulo = new JLabel("Ongi etorri gimnasiora!");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblTitulo.setBounds(130, 10, 270, 30);
        panelSaioaHasi.add(lblTitulo);

        JButton btnErregistratu = new JButton("Erregistratu");
        btnErregistratu.setBounds(162, 40, 120, 30);
        panelSaioaHasi.add(btnErregistratu);

        // Panel de Eregistro
        panelEregistro = new JPanel();
        panelEregistro.setOpaque(false);
        panelEregistro.setBounds(0, 0, 450, 300);
        panelEregistro.setLayout(null);
        panelEregistro.setVisible(false);
        getContentPane().add(panelEregistro);

        JLabel lblIzena = new JLabel("Izena:");
        lblIzena.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblIzena.setBounds(50, 50, 80, 20);
        panelEregistro.add(lblIzena);

        JButton btnAtzera = new JButton("Atzera");
        btnAtzera.setBounds(160, 200, 120, 30);
        panelEregistro.add(btnAtzera);

        // Eventos
        
        btnErregistratu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		panelSaioaHasi.setVisible(false);
                panelEregistro.setVisible(true);
        	}
        });

        btnAtzera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelEregistro.setVisible(false);
                panelSaioaHasi.setVisible(true);
            }
        });
    }
	
	class fondoPanel extends JPanel {
		private Image imagen;
		
		@Override
		public void paint(Graphics g) {
			imagen = new ImageIcon(getClass().getResource("/imagenes/HeavySpace.png")).getImage();
			g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			setOpaque(false);
			super.paint(g); 
		}
	}
}
