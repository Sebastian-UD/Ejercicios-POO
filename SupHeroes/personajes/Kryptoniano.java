package personajes;

import interfaces.LanzarRayos;
import interfaces.SuperFuerza;
import interfaces.Volar;

public class Kryptoniano implements SuperFuerza, Volar, LanzarRayos {

    //Metodos de la interfaz Volar
    public String despegar() {
        return ("Saltan alto para empezar a volar o simplemente despegan desde el suelo");
    }

    public String volar() {
        return ("Pueden volar gracias a la absorción de energía solar a niveles celulares");
    }

    public String levitar() {
        return ("Pueden mantenerse levitando gracias a la absorción de energía solar a niveles celulares");
    }

    public String aterrizar() {
        return ("Aunque vayan a gran velocidad, pueden disminuir esta rapidamente para aterrizar suavemente");
    }

    //Metodos de la interfaz SuperFuerza
    public String levantarCosas() {
        return ("Mediante la absorción de energía solar a niveles celulares obtienen una gran fuerza que les permite levantar objetos pesados");
    }

    public String arrojarCosas() {
        return ("Mediante la absorción de energía solar a niveles celulares obtienen una gran fuerza que les permite arrojar objetos pesados");
    }

    public String destruirCosas() {
        return ("Mediante la absorción de energía solar a niveles celulares obtienen una gran fuerza que les permite destruir objetos resistentes");
    }

    public String saltarAlto() {
        return ("Mediante la absorción de energía solar a niveles celulares obtienen una gran capacidad física con la cual pueden saltar una gran altura");
    }

    //Metodos lanzarRayos
    public String rayoConstante() {
        return ("Bajo los efectos de una Enana amarilla obtienen la capacidad de lanzar un rayo continuo por los ojos con lo que hace daño constante a los enemigos");
    }

    public String rafagaRayos() {
        return ("Bajo los efectos de una Enana amarilla obtienen la capacidad de lanzar una rafaga de rayos por los ojos como un arma de fuego");
    }

    public String derretir() {
        return ("Haciendo uso del rayo constante pueden derretir objetos de metal");
    }

    public String rayoCargado() {
        return ("Bajo los efectos de una Enana amarilla, pueden cargar un rayo potenciado por varios segundos que causa gran daño");
    }
}
