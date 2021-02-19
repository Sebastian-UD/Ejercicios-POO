public class Juego{
	private Jugador jugador;
	private Dado dado1;
	private Dado dado2;
	private int total;
	private Boolean estado; 

	public Juego(){

	}

	public Juego(Jugador jugador, Dado dado1, Dado dado2, Boolean estado){
		this.jugador=jugador;
		this.dado1=dado1;
		this.dado2=dado2;
		this.estado=estado;
	}

	//SETTERS
	public void setJugador(Jugador jugador){
		this.jugador=jugador;
	}

	public void setDado1(Dado dado){
		this.dado1=dado;
	}

	public void setDado2(Dado dado){
		this.dado2=dado;
	}

	public void setEstado(Boolean estado){
		this.estado=estado;
	}

	public void setTotal(int total){
		this.total=total;
	}

	//GETTERS
	public Jugador getJugador(){
		return this.jugador;
	}

	public Dado getDado1(){
		return this.dado1;
	}

	public Dado getDado2(){
		return this.dado2;
	}

	public Boolean getEstado(){
		return this.estado;
	}

	public int getTotal(){
		return this.total;
	}

	public int lanzarDados(){
		return this.dado1.lanzamiento() + this.dado2.lanzamiento();
	}

	public int jugar(String text) throws NumberFormatException{

		this.total=this.dado1.lanzamiento()+this.dado2.lanzamiento();

		float dineroApostado = Float.parseFloat(text);

		//En caso de que quiera apostar mas de lo que tiene
		if(dineroApostado>this.jugador.getDinero()){
			return 0;
		}
		//En caso de que ingrese dinero menor o igual a 0
		else if(dineroApostado<=0){
			return 1;
		}
		else if(this.total==7 || this.total==11){
			this.jugador.ganarDinero(dineroApostado);
			return 2;
		}
		else if(this.total==2 || this.total==3 || this.total==12){
			this.jugador.perderDinero(dineroApostado);
			return 3;
		}
		else{
			this.estado=true;
			return 4;
		}
	}

	public int jugar(String text, int aux){

		this.total=this.dado1.lanzamiento()+this.dado2.lanzamiento();

		float dineroApostado = Float.parseFloat(text);

		if(this.total==aux){
			this.jugador.ganarDinero(dineroApostado);
			this.estado=false;
			return 2;
		}
		else if(this.total==7){
			this.jugador.perderDinero(dineroApostado);
			this.estado=false;
			return 3;
		}
		else{
			return 4;
		}
	}
}