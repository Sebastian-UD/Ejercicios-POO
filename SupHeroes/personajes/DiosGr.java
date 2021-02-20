package personajes;

import interfaces.Controlelem;
import interfaces.SuperFuerza;
import interfaces.Volar;

public class DiosGr implements SuperFuerza, Volar, Controlelem {

// Metodos de la Interfaz SuperFuerza
    public String levantarCosas() {
        return ("Levantan objetos gigantescos con gran facilidad.");
    }

    public String destruirCosas() {
        return ("Pueden asestar golpes muy fuertes capaces de destruir cualquier objeto a su paso.");
    }

    public String arrojarCosas() {
        return ("Su fuerza les permite hacer lanzamientos de objetos muy grandes a mucha distancia.");
    }

    public String saltarAlto() {
        return ("La fuerza que poseen esta en todo su cuerpo y con la de sus pies les permite hacer grandes saltos.");
    }

// Metodos de la Interfaz Controlelem
    public String fuego() {
        return ("Controlan lugares u objetos que tienen fuego como lo pueden ser volcanes y hogueras.");
    }

    public String tierra() {
        return ("Son los responsables de la creacion de la tierra que se conoce y por tanto pueden moldear y eregir a su manera este material.");
    }

    public String aire() {
        return ("Pueden utilizar el aire para crear fenomenos naturales como huracanes o ventiscas.");
    }

    public String agua() {
        return ("Controlan el agua para poder llevarla a la tierra o controlar el mar para crear tsunamis o maremotos.");
    }

// Metodos de la Interfaz Volar
    public String aterrizar() {
        return ("Pueden caer desde mucha altura sin sufrir daño.");
    }

    public String despegar() {
        return ("Pueden emprender vuelo desde cualquier lugar y momento.");
    }

    public String levitar() {
        return ("Logran quedar suspendidos en el aire durante tiempos indefinidos.");
    }

    public String volar() {
        return ("Recorren el cielo a gran velocidad y ganando mucha altura.");
    }

// Metodos de la Interfaz LanzarRayos
    public String rayoConstante() {
        return ("Lanza un rayo canalizado de gran poder e inflige mucho daño al objetivo.");
    }

    public String rafagaRayos() {
        return ("Lanzan multiples rayos de energia de poco alcance y poco poder individual.");
    }

    public String derretir() {
        return ("Los rayos pueden derretir la materia.");
    }

    public String rayoCargado() {
        return ("Absorben energia dependiendo del elemento especializado del Dios para cargar un rayo muy dañino.");
    }

}
