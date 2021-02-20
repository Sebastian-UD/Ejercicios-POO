package gui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


import personajes.DiosGr;
import personajes.Kryptoniano;
import personajes.Saiyajin;
import personajes.Avatar;

public class Menu extends JFrame {

    private final int ANCHO = 1200, ALTO = 800;
    private JButton btnDiosGr, btnKriptoniano, btnSayajin, btnAvatars;
    private JLabel info, titlePanel;
    private JPanel panelLateral;
  

    private void initComponents() {
        panelLateral = new JPanel(null);
        panelLateral.setSize(new Dimension(200, ALTO));
        panelLateral.setLocation(0, 0);
        panelLateral.setBackground(new Color(135, 206, 235));
        panelLateral.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        titlePanel = new JLabel("Super Heroes");
        titlePanel.setSize(new Dimension(200, 50));
        titlePanel.setLocation((panelLateral.getWidth() - titlePanel.getWidth()) / 2, 20);
        titlePanel.setFont(new Font("Arial", Font.BOLD, 20));
        titlePanel.setHorizontalAlignment(JLabel.CENTER);
        titlePanel.setVisible(true);
        panelLateral.add(titlePanel);

        btnDiosGr = new JButton("Dios Gr");
        btnDiosGr.setSize(150, 30);
        btnDiosGr.setLocation((panelLateral.getWidth() - btnDiosGr.getWidth()) / 2, 100);
        btnDiosGr.setFont(new Font("Arial", Font.BOLD, 15));
        btnDiosGr.setFocusable(false);
        panelLateral.add(btnDiosGr);

        btnKriptoniano = new JButton("Kriptoniano");
        btnKriptoniano.setSize(150, 30);
        btnKriptoniano.setLocation((panelLateral.getWidth() - btnKriptoniano.getWidth()) / 2, 200);
        btnKriptoniano.setFont(new Font("Arial", Font.BOLD, 15));
        btnKriptoniano.setFocusable(false);
        panelLateral.add(btnKriptoniano);

        btnSayajin = new JButton("Sayajin");
        btnSayajin.setSize(150, 30);
        btnSayajin.setLocation((panelLateral.getWidth() - btnSayajin.getWidth()) / 2, 300);
        btnSayajin.setFont(new Font("Arial", Font.BOLD, 15));
        btnSayajin.setFocusable(false);
        panelLateral.add(btnSayajin);

        btnAvatars = new JButton("Avatars");
        btnAvatars.setSize(150, 30);
        btnAvatars.setLocation((panelLateral.getWidth() - btnAvatars.getWidth()) / 2, 400);
        btnAvatars.setFont(new Font("Arial", Font.BOLD, 15));
        btnAvatars.setFocusable(false);
        panelLateral.add(btnAvatars);
        
        info = new JLabel();
        info.setSize(new Dimension(985, ALTO - 40));
        info.setLocation(205, 5);
        info.setHorizontalAlignment(JLabel.CENTER);
        info.setFont(new Font("Arial", Font.PLAIN, 20));
        info.setOpaque(true);
        info.setBackground(new Color(224, 255, 255));
        info.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        

       
        add(info);

        add(panelLateral);

    }

    private void initListeners() {

        btnDiosGr.addActionListener((event) -> {
            DiosGr dios = new DiosGr();

            info.setText("<html><body><h1 style='text-align:center'>Habilidades</h1>"
                    + "<p style='text-align:center'>Fuerza<p>"
                    + "<ul>"
                    + "<li>" + dios.levantarCosas() + "</li>"
                    + "<li>" + dios.destruirCosas() + "</li>"
                    + "<li>" + dios.arrojarCosas() + "</li>"
                    + "<li>" + dios.saltarAlto() + "</li>"
                    + "</ul><br>"
                    + "<p style='text-align:center'>Control elemental<p>"
                    + "<ul>"
                    + "<li>fuego: " + dios.fuego() + "</li>"
                    + "<li>tierra: " + dios.tierra() + "</li>"
                    + "<li>agua: " + dios.agua() + "</li>"
                    + "<li>aire: " + dios.aire() + "</li>"
                    + "</ul><br>"
                    + "<p style='text-align:center'>Vuelo<p>"
                    + "<ul>"
                    + "<li>" + dios.despegar() + "</li>"
                    + "<li>" + dios.aterrizar() + "</li>"
                    + "<li>" + dios.levitar() + "</li>"
                    + "<li>" + dios.volar() + "</li>"
                    + "</ul><br>"
                    + "<p style='text-align:center'>Rayos<p>"
                    + "<ul>"
                    + "<li>" + dios.rafagaRayos() + "</li>"
                    + "<li>" + dios.rayoCargado() + "</li>"
                    + "<li>" + dios.rayoConstante() + "</li>"
                    + "<li>" + dios.derretir() + "</li>"
                    + "</ul>"
                    + "</body></html>");
        });

        btnKriptoniano.addActionListener((event) -> {
            Kryptoniano dios = new Kryptoniano();
            info.setText("<html><body><h1 style='text-align:center'>Habilidades</h1>"
                    + "<p style='text-align:center'>Fuerza<p>"
                    + "<ul>"
                    + "<li>" + dios.levantarCosas() + "</li>"
                    + "<li>" + dios.destruirCosas() + "</li>"
                    + "<li>" + dios.arrojarCosas() + "</li>"
                    + "<li>" + dios.saltarAlto() + "</li>"
                    + "</ul><br>"
                    + "<p style='text-align:center'>Vuelo<p>"
                    + "<ul>"
                    + "<li>" + dios.despegar() + "</li>"
                    + "<li>" + dios.aterrizar() + "</li>"
                    + "<li>" + dios.levitar() + "</li>"
                    + "<li>" + dios.volar() + "</li>"
                    + "</ul><br>"
                    + "<p style='text-align:center'>Rayos<p>"
                    + "<ul>"
                    + "<li>" + dios.rafagaRayos() + "</li>"
                    + "<li>" + dios.rayoCargado() + "</li>"
                    + "<li>" + dios.rayoConstante() + "</li>"
                    + "<li>" + dios.derretir() + "</li>"
                    + "</ul>"
                    + "</body></html>");
        });

        btnSayajin.addActionListener((event) -> {
            Saiyajin dios = new Saiyajin();
            info.setText("<html><body><h1 style='text-align:center'>Habilidades</h1>"
                    + "<p style='text-align:center'>Fuerza<p>"
                    + "<ul>"
                    + "<li>" + dios.levantarCosas() + "</li>"
                    + "<li>" + dios.destruirCosas() + "</li>"
                    + "<li>" + dios.arrojarCosas() + "</li>"
                    + "<li>" + dios.saltarAlto() + "</li>"
                    + "</ul><br>"
                    + "<p style='text-align:center'>Vuelo<p>"
                    + "<ul>"
                    + "<li>" + dios.despegar() + "</li>"
                    + "<li>" + dios.aterrizar() + "</li>"
                    + "<li>" + dios.levitar() + "</li>"
                    + "<li>" + dios.volar() + "</li>"
                    + "</ul><br>"
                    + "<p style='text-align:center'>Proyectiles<p>"
                    + "<ul>"
                    + "<li>" + dios.big_one()+ "</li>"
                    + "<li>" + dios.peque()+ "</li>"
                    + "<li>" + dios.continuo()+ "</li>"
                    + "<li>" + dios.rafaga()+ "</li>"
                    + "</ul>"
                    + "</body></html>");
        });
        
         btnAvatars.addActionListener((event) -> {
            Avatar dios = new Avatar();
            info.setText("<html><body><h1 style='text-align:center'>Habilidades</h1>"
                   + "<p style='text-align:center'>Control elemental<p>"
                    + "<ul>"
                    + "<li>fuego: " + dios.fuego() + "</li>"
                    + "<li>tierra: " + dios.tierra() + "</li>"
                    + "<li>agua: " + dios.agua() + "</li>"
                    + "<li>aire: " + dios.aire() + "</li>"
                    + "</ul>"
                    + "<p style='text-align:center'>Proyectiles<p>"
                    + "<ul>"
                    + "<li>" + dios.big_one()+ "</li>"
                    + "<li>" + dios.peque()+ "</li>"
                    + "<li>" + dios.continuo()+ "</li>"
                    + "<li>" + dios.rafaga()+ "</li>"
                    + "</ul>"
                    + "</body></html>");
        });

    }

    public void initTemplate() {
        setLayout(null);
        setSize(new Dimension(ANCHO, ALTO));
        setTitle("Superheroes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image icon = new ImageIcon(getClass().getResource("../resources/super-power.png")).getImage();
        setIconImage(icon);
        setResizable(false);
        setLocationRelativeTo(null);
        initComponents();
        initListeners();
        setVisible(true);

    }

}
