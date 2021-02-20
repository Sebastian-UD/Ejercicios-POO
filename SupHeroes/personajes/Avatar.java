package personajes;

import interfaces.Controlelem;
import interfaces.LanzarProyectiles;

public class Avatar implements Controlelem, LanzarProyectiles {
    //Elementos que controla el avatar

    public String fuego() {
        return ("Puede manipular y/o generar este elemento");
    }

    public String aire() {
        return ("Puede manipular y/o generar este elemento");
    }

    public String agua() {
        return ("Puede manipular y/o generar este elemento");
    }

    public String tierra() {
        return ("Puede manipular y/o generar este elemento");
    }
    //Proyectiles

    public String big_one() {
        return ("Lanza una gran llamarada de fuego, o una gran formacion de rocas");
    }

    public String peque() {
        return ("Levanta y lanza pequeñas rocas o llamaradas de fuego");
    }

    public String continuo() {
        return ("forma un latigo de agua de largo alcance");
    }

    public String rafaga() {
        return ("lanza cualquier elemento en continuidad");
    }
}
