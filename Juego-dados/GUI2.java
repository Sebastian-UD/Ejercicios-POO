import javax.swing.Timer;
import javax.swing.border.Border;
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

public class GUI2 extends JFrame implements ActionListener {

	private JLabel etiqueta1;
	private JLabel etiqueta2;
  private JTextField dineroApostar;
	private JLabel saldoActual;
	private JLabel resultado;
	private JLabel instruccion;
  private JButton boton1;
	private JButton boton2;
  private JPanel panel1;
	private JPanel panel2;
	private JPanel panelBoton1;
	private JPanel panelBoton2;

	private int condicion=0;
	private int aux=0;
	private Jugador jugador;
	private Dado dado1;
	private Dado dado2;
	private Juego juego;

  
  public GUI2(Jugador x){

		int[ ] array = {2, 6, 1, 5, 4, 3};
		int[ ] array2 = {3, 1, 6, 4, 5, 2};
		
		this.dado1 = new Dado(array);
		this.dado2 = new Dado(array2);

		this.jugador=x;

		this.juego = new Juego(jugador, dado1, dado2, false);

    //Indicar posicion inicial y tamaño al mismo tiempo
    this.setBounds(150,150,800,700);

    //Impedir que la ventana se pueda ajustar
    this.setResizable(false);

    this.setTitle("Juego Dados");

    boton1 = new JButton("Lanzar dados");
		boton2 = new JButton("Cerrar sesion");
		etiqueta1 = new JLabel("Dinero a apostar");
		etiqueta2 = new JLabel("Saldo actual", SwingConstants.CENTER);
		dineroApostar = new JTextField("");
		saldoActual = new JLabel(Float.toString(jugador.getDinero()), SwingConstants.CENTER);
		resultado = new JLabel("El resultado es:");
		instruccion = new JLabel("", SwingConstants.CENTER);


		//Modificacion de las etiquetas
		etiqueta1.setFont(new Font("Algerian", Font.ITALIC, 20));
		etiqueta2.setFont(new Font("Algerian", Font.ITALIC, 20));
		saldoActual.setFont(new Font("Algerian", Font.ITALIC, 16));
		instruccion.setFont(new Font("Algerian", Font.ITALIC, 12));

		//Panel datos
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2,2,2,7));
		panel1.add(etiqueta1);
		panel1.add(etiqueta2);
		panel1.add(dineroApostar);
		panel1.add(saldoActual);

		//Panel boton
		panelBoton1=new JPanel();
    panelBoton1.add(boton1);

		panelBoton2=new JPanel();
    panelBoton2.add(boton2);

    this.getContentPane().setLayout(new GridLayout(5,1,0,10));
    
    this.getContentPane().add(panel1);
		this.getContentPane().add(panelBoton1);
		this.getContentPane().add(resultado);
		this.getContentPane().add(instruccion);
		this.getContentPane().add(panelBoton2);

    boton1.setActionCommand("Lanzar");
    boton1.addActionListener(this);

		boton2.setActionCommand("Cerrar");
    boton2.addActionListener(this);

    this.pack();
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

  }

  public void actionPerformed(ActionEvent e){

		if(e.getActionCommand().equals("Lanzar")){
			int resul=0;
			String text = dineroApostar.getText();	

			try{
				//En caso de que saque uno de los numeros
				if(this.juego.getEstado()==false){
					resul = this.juego.jugar(text);
					this.aux=this.juego.getTotal();
				}
				//En caso de que no saque uno de los numeros
				else if(this.juego.getEstado()==true){
					resul = this.juego.jugar(text, this.aux);
				}

				//Resultados
				if(resul==0){
					instruccion.setText("El dinero que quiere apostar excede su saldo");
					dineroApostar.setText("");
				}
				else if(resul==1){
					instruccion.setText("Ingrese un valor mayor a 0");
					dineroApostar.setText("");
				}
				else if(resul==2){
					instruccion.setText("Usted gano");
				}
				else if(resul==3){
					instruccion.setText("Usted perdio");
				}
				else{
					resultado.setText("El resultado es:" + this.juego.getTotal());
					instruccion.setText("Vuelva a lanzar hasta sacar el mismo numero o 7");
					dineroApostar.setEditable(false);
				}

				if(resul==2 || resul==3){
					resultado.setText("El resultado es:" + this.juego.getTotal());
					String cadena = Float.toString(this.jugador.getDinero());
					saldoActual.setText(cadena);
					dineroApostar.setText("");
					dineroApostar.setEditable(true);
					archiJugador.guardar(this.jugador, this.jugador.getNombre(), this.jugador.getContraseña());
				}
			}
			catch(NumberFormatException nfe){
				dineroApostar.setText("");
				instruccion.setText("Por favor ingrese el dinero a apostar");
			}
			catch(Exception b){}
		}

		else if(e.getActionCommand().equals("Cerrar")){
			if(this.juego.getEstado()==true){
				String text = dineroApostar.getText();	
				float dineroApostado = Float.parseFloat(text);
				this.juego.getJugador().perderDinero(dineroApostado);
				try{
						archiJugador.guardar(this.jugador, this.jugador.getNombre(), this.jugador.getContraseña());
				}
				catch(Exception b){}
			}
			this.dispose();
			GUI3 ventana = new GUI3();
		}
  }
}
