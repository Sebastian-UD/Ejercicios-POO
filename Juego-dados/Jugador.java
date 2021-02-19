import java.io.Serializable;

public class Jugador implements Serializable{
  private String nombre;
  private String contraseña;
  private float dinero;

  public Jugador(){
    nombre = "";
    contraseña = "";
    dinero = 0;
  }

  public Jugador(String nombre, String contraseña, float dinero){
		this.nombre=nombre;
		this.contraseña=contraseña;
		this.dinero=dinero;
	}

	///SETTERS
	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public void setContraseña(String contraseña){
		this.contraseña=contraseña;
	}

	public void setDinero(float dinero){
		this.dinero=dinero;
	}

	///GETTERS
	public String getNombre(){
		return this.nombre;
	}

	public String getContraseña(){
		return this.contraseña;
	}

	public float getDinero(){
		return this.dinero;
	}

	//Metodo cuando gana
	public void ganarDinero(float dinero){
		this.dinero=this.dinero+dinero;
	}

	//Metodo cuando pierde
	public void perderDinero(float dinero){
		this.dinero=this.dinero-dinero;
	}

}