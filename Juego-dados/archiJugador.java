import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ClassNotFoundException;

public class archiJugador{

	public static void guardar(Jugador x, String usuario, String contraseña) throws FileNotFoundException, IOException{
		ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(usuario + "_" + contraseña + ".obj"));
		salida.writeObject(x);
		salida.close();
	}

	public static Jugador recuperar(String usuario, String contraseña) throws IOException, ClassNotFoundException{
		ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(usuario + "_" + contraseña + ".obj"));
		Jugador jugador = (Jugador)entrada.readObject();
		entrada.close();
		return jugador;
	}
}