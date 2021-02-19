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

public class GUI extends JFrame implements ActionListener {
  private JTextField texto1;
	private JTextField texto2;
	private JTextField texto3;
  private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
	private JLabel etiqueta4;
  private JButton boton;
  private JButton boton2;
	private JPanel panelDatos;
  private JPanel panelBoton;
	private JPanel panelBoton2;
	private JPanel panelIS;

	//private GUI2 ventana2;


  public GUI() {

    //Indicar posicion inicial y tamaño al mismo tiempo
    this.setBounds(150,150,1500,1500);

    //Impedir que la ventana se pueda ajustar
    this.setResizable(false);

    this.setTitle("Registro juego dados");

		texto1 = new JTextField("");
    etiqueta1 = new JLabel("Nombre usuario: ");

		texto2 = new JTextField("");
    etiqueta2 = new JLabel("Contraseña: ");

		texto3 = new JTextField("");
    etiqueta3 = new JLabel("Saldo inicial: ");

		etiqueta4 = new JLabel("¿Ya tienes una cuenta?, Inicia sesión:");

    boton = new JButton("Registrarse");
		boton2 = new JButton("Iniciar sesion");

		//Panel de datos
		panelDatos = new JPanel();
		panelDatos.setLayout(new GridLayout(3, 1));

		panelDatos.add(etiqueta1);
		panelDatos.add(texto1);
		
		panelDatos.add(etiqueta2);
		panelDatos.add(texto2);
		
		panelDatos.add(etiqueta3);
		panelDatos.add(texto3);
		

		//Panel del botón
    panelBoton=new JPanel();
		panelBoton.setLayout(new FlowLayout());
    panelBoton.add(boton);

		panelBoton2=new JPanel();
		panelBoton2.setLayout(new FlowLayout());
    panelBoton2.add(boton2);

		//Panel iniciar sesion
		panelIS = new JPanel();
		panelIS.setLayout(new GridLayout(1,2));
		panelIS.add(etiqueta4);
		panelIS.add(panelBoton2);
		
    //Modificacion tamaño etiquetas
    etiqueta1.setFont(new Font("Algerian", Font.ITALIC, 20));
		etiqueta2.setFont(new Font("Algerian", Font.ITALIC, 20));
		etiqueta3.setFont(new Font("Algerian", Font.ITALIC, 20));
		etiqueta4.setFont(new Font("Algerian", Font.ITALIC, 15));

		//Modificacion tamaño letra de los campos de texto
    texto1.setFont(new Font("Algerian", Font.ITALIC, 20));
		texto2.setFont(new Font("Algerian", Font.ITALIC, 20));
		texto3.setFont(new Font("Algerian", Font.ITALIC, 20));

		//Modificacion botones
    boton.setFont(new Font("cooper black", 3, 15));
		boton.setActionCommand("Registrarse");
    boton.addActionListener(this);

		boton2.setFont(new Font("cooper black", 3, 12));
		boton2.setActionCommand("Iniciar sesion");
    boton2.addActionListener(this);

    
		this.getContentPane().add(panelDatos, BorderLayout.NORTH);
    this.getContentPane().add(panelBoton, BorderLayout.CENTER);
		this.getContentPane().add(panelIS, BorderLayout.SOUTH);


    this.pack();
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e){

    if(e.getActionCommand().equals("Registrarse")){
			try{
				String text = texto3.getText();
				float dinero = Float.parseFloat(text);

				if(texto1.getText().equals("") || texto2.getText().equals("")){
					texto1.setText("Ingrese el usuario");
					texto2.setText("Ingrese la contraseña");
				}
				else if(texto3.getText().equals("") || texto3.getText().equals("0") || dinero<0){
					texto3.setText("Ingrese el saldo");
				}
				else{
					String usuario = texto1.getText();
					String contraseña = texto2.getText();
					Jugador user = new Jugador(usuario, contraseña, dinero);

					archiJugador.guardar(user, usuario, contraseña);
					this.dispose();
					GUI2 ventana = new GUI2(user);
				}
			}
			catch(NumberFormatException nfe){
				texto3.setText("Ingrese el saldo");
			}
			catch(Exception a){}
    }
    else if(e.getActionCommand().equals("Iniciar sesion")){
      this.dispose();
			GUI3 ventana = new GUI3();
    }
  }
}