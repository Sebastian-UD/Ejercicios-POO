import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

//import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame implements ActionListener {
  private JTextField texto;
  private JLabel etiqueta;
  private JButton boton;
  private JButton boton2;
  private JPanel panel;

  private int cs=0;

  private int contador=0;

  private Cronometro cronometro;

  private Timer t;

  private ActionListener acciones = new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent ae) {

      int h = cronometro.getHoras().getDato();
      int m = cronometro.getMinutero().getDato();
      int s = cronometro.getSegundero().getDato();

      String texto = (h<=9?"0":"") + h + ":" +  (m<=9?"0":"") + m + ":" + (s<=9?"0":"") + s + ":" + (cs<=9?"0":"")+cs;

      cs++;

      //Aumento del segundero
      if(cs==100){
         cs=0;
         cronometro.getSegundero().aumentar();
      }

      //Aumento del minutero
      if(cronometro.getSegundero().getDato()==60){
        cronometro.getMinutero().aumentar();
        cronometro.getSegundero().setDato(0);
      }

      //Aumento de las horas
      if(cronometro.getMinutero().getDato()==60){
        cronometro.getHoras().aumentar();
        cronometro.getMinutero().setDato(0);
      }  
      etiqueta.setText(texto);        
    }  
  };
  
  public GUI() {

    t = new Timer(10, acciones);

    //Indicar posicion inicial y tamaño al mismo tiempo
    this.setBounds(250,200,600,500);

    //Impedir que la ventana se pueda ajustar
    this.setResizable(false);

    this.setTitle("Cronometro 1.0");

    texto = new JTextField("Cronometro Java");
    etiqueta = new JLabel("00:00:00:00");

    boton = new JButton("Iniciar");
    boton2 = new JButton("Reiniciar");

    panel=new JPanel();
    panel.add(boton);
    panel.add(boton2);
    panel.setLayout(new GridLayout(1,2));

    texto.setForeground(Color.WHITE);
    texto.setBackground(Color.BLACK);
    texto.setFont(new Font("Algerian", Font.ITALIC, 30));

    //Modificacion etiqueta
    etiqueta.setFont(new Font("Algerian", Font.ITALIC, 36));
    etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
    etiqueta.setForeground(Color.WHITE);
    etiqueta.setOpaque(true);
    etiqueta.setBackground(Color.BLACK);

    //Modificacion botones
    boton.setForeground(Color.BLUE);
    boton.setFont(new Font("cooper black", 3, 15));

    boton2.setForeground(Color.BLUE);
    boton2.setFont(new Font("cooper black", 3, 15));
    boton2.setEnabled(false);

    this.getContentPane().setLayout(new GridLayout(3, 1));
    
    this.getContentPane().add(texto);
    this.getContentPane().add(etiqueta);
    this.getContentPane().add(panel);

    boton.setActionCommand("Iniciar");
    boton.addActionListener(this);

    boton2.setActionCommand("Reiniciar");
    boton2.addActionListener(this);

    this.pack();
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Instanciacion de las 3 agujas segundero, minutero, horas
    Segundero segundero = new Segundero(0);
    Minutero minutero = new Minutero(0);
    Horas horas = new Horas(0);

    //Instanciacion del cronometro
    cronometro = new Cronometro(segundero, minutero, horas);  
  }

  public void actionPerformed(ActionEvent e){

    if(e.getActionCommand().equals("Iniciar")){
      
      //Iniciar/reanudar el cronometro
      if(contador==0){
        t.start();
        contador=1;
        boton.setText("Detener");
        boton2.setEnabled(true);
      }
      //Detener el cronometro
      else if(contador==1){
        t.stop();
        contador=0;
        boton.setText("Reanduar");
      }
    }
    //Reiniciar el cronometro
    else if(e.getActionCommand().equals("Reiniciar")){
      contador=0;
      t.stop();
      boton.setText("Iniciar");
      boton2.setEnabled(false);
      etiqueta.setText("00:00:00:00");
      
      cronometro.getSegundero().setDato(0);
      cronometro.getMinutero().setDato(0);
      cronometro.getHoras().setDato(0);
    }
  }
}