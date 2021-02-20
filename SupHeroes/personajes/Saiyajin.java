package personajes;


import interfaces.LanzarProyectiles;
import interfaces.SuperFuerza;
import interfaces.Volar;

public class Saiyajin implements Volar, SuperFuerza, LanzarProyectiles{
	
	//Metodos interfaz Volar
	public String despegar(){
		return("Grita y sale volando");
	}
	public String volar(){
		return("Vuela a grandes velocidades");
	}
	public String levitar(){
		return("Se mantiene flotando en el aire sin problemas");
	}
	public String aterrizar(){
		return("Puede aterrizar de golpe sin problema");
	}

	//Metodos interfaz SuperFuerza
	public String levantarCosas(){
		return("A diferencia de los seres humanos, son bastante fuertes gracias a que la gravedad del planeta es elevada, permitiendoles levantar cosas pesadas");
	}
	public String arrojarCosas(){
		return("Asi como pueden levantar cosas pesadas, las pueden lanzar a los enemigos sin problema");
	}
	public String destruirCosas(){
		return("Con la fuerza que tienen, pueden destruir edificios o montañas");
	}
	public String saltarAlto(){
		return("Gracias a su gran capacidad física, pueden saltar una distancia de varios metros y aterrizar sin sufrir daño");
	}

	//Metodos LanzarProyectiles
	public String big_one(){
		return("Concentra una gran cantidad de ki que causa una gran explosion y daño, aunque le toma algo de tiempo");
	}
	public String peque(){
		return("Carga una pequeña cantidad de ki que no causa mucho daño, pero al cargarlo rapidamente puede lanzar varios proyectiles en un corto tiempo");
	}
	public String continuo(){
		return("Carga una gran catidad de ki que lo puede lanzar manteniendolo de forma constante si le suministra ki sin parar, lo que causa gran daño");
	}
	public String rafaga(){
		return("Dispara una enorme cantidad de proyectiles de ki de poco daño como si fuese una ametralladora, teniendo que mantenerse quieto en el sitio donde está");
	}
}