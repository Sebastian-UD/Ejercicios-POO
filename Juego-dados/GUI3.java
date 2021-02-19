import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI3 extends JFrame implements ActionListener {
  private JTextField texto1;
	private JTextField texto2;
  private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
  private JButton boton;
  private JButton boton2;
	private JPanel panelDatos;
  private JPanel panelBoton;
	private JPanel panelBoton2;
	private JPanel panelRegistrarse;

  public GUI3() {

    //Indicar posicion inicial y tamaño al mismo tiempo
    this.setBounds(200,200,1500,1500);

    //Impedir que la ventana se pueda ajustar
    this.setResizable(false);

    this.setTitle("Iniciar sesion juego dados");

		texto1 = new JTextField("");
    etiqueta1 = new JLabel("Nombre usuario: ");

		texto2 = new JTextField("");
    etiqueta2 = new JLabel("Contraseña: ");

		etiqueta3 = new JLabel("¿No tienes una cuenta?, Registrate:");

    boton = new JButton("Iniciar sesion");
		boton2 = new JButton("Registrarse");

		//Panel de datos
		panelDatos = new JPanel();
		panelDatos.setLayout(new GridLayout(2, 1));

		panelDatos.add(etiqueta1);
		panelDatos.add(texto1);
		
		panelDatos.add(etiqueta2);
		panelDatos.add(texto2);
		
		
		//Panel del botón
    panelBoton=new JPanel();
		panelBoton.setLayout(new FlowLayout());
    panelBoton.add(boton);

		panelBoton2=new JPanel();
		panelBoton2.setLayout(new FlowLayout());
    panelBoton2.add(boton2);

		//Panel registrarse
		panelRegistrarse=new JPanel();
		panelRegistrarse.setLayout(new GridLayout(1,2, 0, 10));
		panelRegistrarse.add(etiqueta3);
		panelRegistrarse.add(panelBoton2);
		
    //Modificacion tamaño etiquetas
    etiqueta1.setFont(new Font("Algerian", Font.ITALIC, 20));
		etiqueta2.setFont(new Font("Algerian", Font.ITALIC, 20));
		etiqueta3.setFont(new Font("Algerian", Font.ITALIC, 15));

		//Modificacion tamaño letra de los campos de texto
    texto1.setFont(new Font("Algerian", Font.ITALIC, 20));
		texto2.setFont(new Font("Algerian", Font.ITALIC, 20));

		//Modificacion botones
    boton.setFont(new Font("cooper black", 3, 15));
		boton.setActionCommand("Iniciar sesion");
    boton.addActionListener(this);

		boton2.setFont(new Font("cooper black", 3, 12));
		boton2.setActionCommand("Registrarse");
    boton2.addActionListener(this);

    
		this.getContentPane().add(panelDatos, BorderLayout.NORTH);
    this.getContentPane().add(panelBoton, BorderLayout.CENTER);
		this.getContentPane().add(panelRegistrarse, BorderLayout.SOUTH);

    this.pack();
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e){

    if(e.getActionCommand().equals("Iniciar sesion")){
			
			if(texto1.getText().equals("") || texto2.getText().equals("")){
				texto1.setText("Ingrese el usuario");
				texto2.setText("Ingrese la contraseña");
			}
			else{
				String usuario = texto1.getText();
				String contraseña = texto2.getText();
				try{
					Jugador user = archiJugador.recuperar(usuario, contraseña);
					this.dispose();
					GUI2 ventana = new GUI2(user);
				}
				catch(Exception nfe){}
			}
    }
    else if(e.getActionCommand().equals("Registrarse")){
      this.dispose();
			GUI ventana = new GUI();	
    }
  }
}