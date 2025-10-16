package Vista;

import java.awt.*;
import javax.swing.*;
import java.text.SimpleDateFormat;

public class Vista extends JFrame {

    private FondoPanel panelSaioaHasi;
    private JPanel panelEregistro;

    private JTextField txtEmailLogin;
    private JTextField txtIzena, txtAbizenak, txtEmaila;
    private JFormattedTextField txtJaiotzeData;
    
    private JPasswordField txtPasswordLogin;
    private JPasswordField txtPasahitza;
    

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Vista window = new Vista();
                window.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Vista() {
    	setTitle("Gimnasioa");
        setBounds(100, 100, 500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        crearPanelSaioaHasi();
        crearPanelEregistro();
    }

    private void crearPanelSaioaHasi() {
        panelSaioaHasi = new FondoPanel();
        panelSaioaHasi.setBounds(0, 0, 500, 350);
        panelSaioaHasi.setLayout(null);
        getContentPane().add(panelSaioaHasi);

        // Logo superior
        JLabel lblLogo = new JLabel(new ImageIcon(getClass().getResource("/imagenes/HeavySpace.png")));
        lblLogo.setBounds(175, 10, 150, 100);
        panelSaioaHasi.add(lblLogo);

        JLabel lblEmailLogin = new JLabel("Emaila:");
        lblEmailLogin.setForeground(Color.WHITE);
        lblEmailLogin.setBounds(130, 130, 80, 20);
        panelSaioaHasi.add(lblEmailLogin);

        txtEmailLogin = new JTextField();
        txtEmailLogin.setBounds(210, 130, 150, 22);
        panelSaioaHasi.add(txtEmailLogin);

        JLabel lblPasswordLogin = new JLabel("Pasahitza:");
        lblPasswordLogin.setForeground(Color.WHITE);
        lblPasswordLogin.setBounds(130, 160, 80, 20);
        panelSaioaHasi.add(lblPasswordLogin);

        txtPasswordLogin = new JPasswordField();
        txtPasswordLogin.setBounds(210, 160, 150, 22);
        panelSaioaHasi.add(txtPasswordLogin);

        JButton btnSaioaHasi = new JButton("Saioa hasi");
        btnSaioaHasi.setBounds(200, 200, 120, 30);
        panelSaioaHasi.add(btnSaioaHasi);

        JButton btnErregistratu = new JButton("Erregistratu");
        btnErregistratu.setBounds(200, 240, 120, 30);
        panelSaioaHasi.add(btnErregistratu);

        btnErregistratu.addActionListener(e -> {
            panelSaioaHasi.setVisible(false);
            panelEregistro.setVisible(true);
        });
    }

    private void crearPanelEregistro() {

        panelEregistro = new JPanel();
        panelEregistro.setBounds(0, 0, 500, 350);
        panelEregistro.setLayout(null);
        panelEregistro.setVisible(false);
        getContentPane().add(panelEregistro);

        JLabel lblTituloEreg = new JLabel("Erregistroa");
        lblTituloEreg.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblTituloEreg.setBounds(200, 20, 150, 20);
        panelEregistro.add(lblTituloEreg);

        JLabel lblIzena = new JLabel("Izena:");
        lblIzena.setBounds(100, 60, 80, 20);
        panelEregistro.add(lblIzena);

        txtIzena = new JTextField();
        txtIzena.setBounds(200, 60, 180, 20);
        panelEregistro.add(txtIzena);

        JLabel lblAbizenak = new JLabel("Abizenak:");
        lblAbizenak.setBounds(100, 90, 80, 20);
        panelEregistro.add(lblAbizenak);

        txtAbizenak = new JTextField();
        txtAbizenak.setBounds(200, 90, 180, 20);
        panelEregistro.add(txtAbizenak);

        JLabel lblEmaila = new JLabel("Emaila:");
        lblEmaila.setBounds(100, 120, 80, 20);
        panelEregistro.add(lblEmaila);

        txtEmaila = new JTextField();
        txtEmaila.setBounds(200, 120, 180, 20);
        panelEregistro.add(txtEmaila);

        JLabel lblPasahitza = new JLabel("Pasahitza:");
        lblPasahitza.setBounds(100, 150, 80, 20);
        panelEregistro.add(lblPasahitza);

        txtPasahitza = new JPasswordField();
        txtPasahitza.setBounds(200, 150, 180, 20);
        panelEregistro.add(txtPasahitza);

        JLabel lblJaiotzeData = new JLabel("Jaiotze-data:");
        lblJaiotzeData.setBounds(100, 180, 80, 20);
        panelEregistro.add(lblJaiotzeData);

        txtJaiotzeData = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));
        txtJaiotzeData.setBounds(200, 180, 180, 20);
        panelEregistro.add(txtJaiotzeData);

        JButton btnGorde = new JButton("Gorde");
        btnGorde.setBounds(200, 220, 100, 25);
        panelEregistro.add(btnGorde);

        JButton btnAtzera = new JButton("Atzera");
        btnAtzera.setBounds(200, 260, 100, 25);
        panelEregistro.add(btnAtzera);

        btnAtzera.addActionListener(e -> {
            panelEregistro.setVisible(false);
            panelSaioaHasi.setVisible(true);
        });

        btnGorde.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Erabiltzailea gordeta!");
            panelEregistro.setVisible(false);
            panelSaioaHasi.setVisible(true);
        });
    }

    // Panel con fondo panelSaioaHasi
    class FondoPanel extends JPanel {
        private Image imagen;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            imagen = new ImageIcon(getClass().getResource("/imagenes/HeavySpace.png")).getImage();
            // Dibujamos la imagen con algo de transparencia para no tapar texto
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.4f));
            g2d.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            g2d.dispose();
        }
    }
}
